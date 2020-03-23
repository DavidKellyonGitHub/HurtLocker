public class ResultPrinter {


    public String formatMilkResults(int milkFrequency, Double price1, int price1Frequency, Double price2, int price2Frequency) {
        return String.format("name:    Milk        seen: %d times\n" +
                             "=============        ==============\n" +
                             "Price:   %2f          seen: %d times\n" +
                             "-------------        --------------\n" +
                             "Price:   %2f          seen: %d times\n", milkFrequency,price1,price1Frequency,price2,price2Frequency);

    }

    public String formatBreadResults(int breadFrequency, Double price, int priceFrequency) {
        return null;
    }

    public String formatCookiesResults(int cookiesFrequency, Double price, int priceFrequency) {
        return null;
    }

    public String formatApplesResults(int applesFrequency, Double price1, int price1Frequency, Double price2, int price2Frequency) {
        return null;
    }

    public String formatErrorsResults(int errorFrequency){
        return null;
    }
}