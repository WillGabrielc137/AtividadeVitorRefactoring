package AtividadeVitorRefactoring;

import java.util.Enumeration;

public abstract class Statement {

    public String value(Customer aCustomer) {
        Enumeration<Rental> rentals = aCustomer.getRentals();
        StringBuilder result = new StringBuilder();

        result.append(generateHeader(aCustomer));

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result.append(generateRentalDetails(each));
        }

        result.append(generateFooter(aCustomer));

        return result.toString();
    }

    protected abstract String generateHeader(Customer aCustomer);

    protected abstract String generateRentalDetails(Rental each);

    protected abstract String generateFooter(Customer aCustomer);
}
