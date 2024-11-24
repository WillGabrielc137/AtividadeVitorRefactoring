package AtividadeVitorRefactoring;

import java.util.Enumeration;

public abstract class Statement {


    public String value(Customer aCustomer) {
        Enumeration<Rental> rentals = aCustomer.getRentals();
        String result = generateHeader(aCustomer);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += generateRentalDetails(each);
        }

        result += generateFooter(aCustomer);
        return result;
    }

    protected abstract String generateHeader(Customer aCustomer);
    protected abstract String generateRentalDetails(Rental each);
    protected abstract String generateFooter(Customer aCustomer);
}
