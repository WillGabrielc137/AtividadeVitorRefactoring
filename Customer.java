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

   public double getTotalCharge(){
      double totalAmount = 0;
      Enumeration rentals = _rentals.elements();

      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         totalAmount += each.getCharge();
      }

      return totalAmount;
   }

   public int getTotalFrequentRenterPoints(){
      int frequentRenterPoints = 0;
      Enumeration rentals = _rentals.elements();

      while (rentals.thisMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         frequentRenterPoints += each.getFrequentRenterPoints();
      }

      return frequentRenterPoints;
   }

   public String statement() {
      String result = "Rental Record for " + getName() + "\n";

      Enumeration rentals = _rentals.elements();

      while (rentals.hasMoreElements()) {
         double thisAmount = 0;
         Rental each = (Rental) rentals.nextElement();

         thisAmount = each.getCharge();

         result += "\t" + each.getMovie().getTitle() + "\t" +
               String.valueOf(thisAmount) + "\n";
      }

      result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
      result += "You earned " + String.valueOf(frequentRenterPoints) +
            " frequent renter points";
      return result;
   }
}
