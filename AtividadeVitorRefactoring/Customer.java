package AtividadeVitorRefactoring;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector<>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        return new TextStatement().value(this);
    }

    public String htmlStatement() {
        return new HtmlStatement().value(this);
    }

    public Enumeration<Rental> getRentals() {
        return _rentals.elements();
    }

    public double getTotalCharge() {
        double totalAmount = 0;
        Enumeration<Rental> rentals = _rentals.elements();

        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            totalAmount += each.getCharge();
        }

        return totalAmount;
    }

    public int getTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();

        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            frequentRenterPoints += each.getFrequentRenterPoints();
        }

        return frequentRenterPoints;
    }
}
