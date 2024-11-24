package AtividadeVitorRefactoring;

import java.util.Enumeration;

public class TextStatement extends Statement {

    @Override
    protected String generateHeader(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    @Override
    protected String generateRentalDetails(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" +
               String.valueOf(each.getCharge()) + "\n";
    }

    @Override
    protected String generateFooter(Customer aCustomer) {
        String footer = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
        footer += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                  " frequent renter points";
        return footer;
    }
}
