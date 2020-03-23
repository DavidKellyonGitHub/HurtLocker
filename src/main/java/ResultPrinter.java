public class ResultPrinter {


    public String formatItemResults(ItemManager item) {
        if (item.getPriceList().size() >1) {
            return String.format("name:    %s        seen: %d times\n" +
                            "=============        ==============\n" +
                            "Price:   %2f          seen: %d times\n" +
                            "-------------        --------------\n" +
                            "Price:   %2f          seen: %d times\n",
                    item.getItemName(), item.getItemFrequency(), item.getPriceList().get(0), item.getPrice1Frequency(), item.getPriceList().get(1), item.getPrice2Frequency());
        } else {
            return String.format("name:    %s        seen: %d times\n" +
                            "=============        ==============\n" +
                            "Price:   %2f          seen: %d times\n" +
                            "-------------        --------------\n" +
                            "\n",
                    item.getItemName(), item.getItemFrequency(), item.getPriceList().get(0), item.getPrice1Frequency());

        }
    }
}