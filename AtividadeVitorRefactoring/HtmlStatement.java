package AtividadeVitorRefactoring;

import java.util.Enumeration;

public class HtmlStatement extends Statement {

    @Override
    protected String generateHeader(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    @Override
    protected String generateRentalDetails(Rental each) {
        return each.getMovie().getTitle() + ": " +
               String.valueOf(each.getCharge()) + "<BR>\n";
    }

    @Override
    protected String generateFooter(Customer aCustomer) {
        String footer = "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        footer += "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                  "</EM> frequent renter points<P>";
        return footer;
    }
}
