package AtividadeVitorRefactoring;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
   private String _name;
   private Vector _rentals = new Vector();

   public Customer(String name) {
      _name = name;
   }

   public void addRental(Rental arg) {
      _rentals.addElement(arg);
   }

   public String getName() {
      return _name;
   }

   public String htmlStatement() {
      String result = "<h1>Rental Record for " + getName() + "</h1\n>";
      result += "<tables>\n";
      result += "<tr><th>Title</th><th>Amont</th></tr>\n";

      Enumeration rentals = _rentals.elements();

      while (rentals.hasMoreElements()) {
         double thisAmount = 0;
         Rental each = (Rental) rentals.nextElement();

         thisAmount = each.getCharge();

         result += "<tr><td>" + each.getMovie().getTitle() + "</td><td>" +
               String.valueOf(thisAmount) + "</td></tr>\n";
      }

      result += "</table>\n";
      result += "<p>Amount owed is <strong>" + String.valueOf(getTotalCharge()) + "</strong></p>\n";
      result += "<p>You earned <strong>" + String.valueOf(getTotalFrequentRenterPoints())
            + "</strong> frequent renter points</p>\n";

      return result;
   }

   public double getTotalCharge() {
      double totalAmount = 0;
      Enumeration rentals = _rentals.elements();

      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         totalAmount += each.getCharge();
      }

      return totalAmount;
   }

   public int getTotalFrequentRenterPoints() {
      int frequentRenterPoints = 0;
      Enumeration rentals = _rentals.elements();

      while (rentals.thisMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         frequentRenterPoints += each.getFrequentRenterPoints();
      }

      return frequentRenterPoints;
   }
}
