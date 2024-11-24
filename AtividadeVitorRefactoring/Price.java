package AtividadeVitorRefactoring;

public abstract class Price {
    public abstract int getPriceCode();

    public double getCharge(int daysRented) {
        double amount = 0;

        switch (getPriceCode()) {
            case Movie.REGULAR:
                amount += 2;
                if (daysRented > 2) {
                    amount += (daysRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                amount += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                amount += 1.5;
                if (daysRented > 3) {
                    amount += (daysRented - 3) * 1.5;
                }
                break;
        }
        return amount;
    }

    public int getFrequentRenterPoints(int daysRented) {
        return (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1) ? 2 : 1;
    }
}