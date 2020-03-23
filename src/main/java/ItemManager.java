import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public abstract class ItemManager {
    private Pattern itemPattern;
    private Pattern pricesPattern;
    private Pattern price1Pattern;
    private Pattern price2Pattern;
    private String itemName;
    private int itemFrequency;
    private int itemErrors;
    private ArrayList<Double> priceList;
    private int price1Frequency;
    private int price2Frequency;
    private String groceryList = Main.readRawDataToString();
    private ArrayList<String> allItems;

    protected ItemManager() throws Exception {
        this.priceList = new ArrayList<>();
        this.allItems = new ArrayList<>();
    }

    public void assignFields(){
        assignName();
        this.itemPattern = Pattern.compile("(?i:.*"+ getItemName() + ".*)");
        this.itemFrequency = itemFreq(itemPattern);
        //parseItemList();
    }

    public void assignName(){
        if (this instanceof MilkManager){
            this.setItemName("Milk");
        } else if (this instanceof BreadManager){
            this.setItemName("Bread");
        } else if (this instanceof CookiesManager){
            this.setItemName("Cookies");
        } else if (this instanceof ApplesManager){
            this.setItemName("Apples");
        }
    }

    public int itemFreq(Pattern itemPattern){
        itemFrequency = 0;
        while (itemPattern.matcher(groceryList).find()){
            itemFrequency++;
        }
            return itemFrequency;
    }

//    public void parseItemList(){
//        this.allItems = new ArrayList<String>(Arrays.asList(groceryList.split("##")));
//        for(String item : allItems){
//            if (item.startsWith())
//        }
//    }

    public Double parseItemPrices(Pattern pricesPattern){return null;}

    public Double parseItemPrice1(){return null;}

    public int parseItemPrice1Freq(Pattern price1Pattern){return -1;}

    public Double parseItemPricePrice2(){return null;}

    public int parseItemPrice2Freq(Pattern price2Pattern){return -1;}

    public String[] parseItemStats() throws Exception {
        return null;
    }

    public int parseErrorFreq(){return -1;}

    public Pattern getItemPattern() {
        return itemPattern;
    }

    public void setItemPattern(Pattern itemPattern) {
        this.itemPattern = itemPattern;
    }

    public Pattern getPricesPattern() {
        return pricesPattern;
    }

    public void setPricesPattern(Pattern pricesPattern) {
        this.pricesPattern = pricesPattern;
    }

    public Pattern getPrice1Pattern() {
        return price1Pattern;
    }

    public void setPrice1Pattern(Pattern price1Pattern) {
        this.price1Pattern = price1Pattern;
    }

    public Pattern getPrice2Pattern() {
        return price2Pattern;
    }

    public void setPrice2Pattern(Pattern price2Pattern) {
        this.price2Pattern = price2Pattern;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemFrequency() {
        return itemFrequency;
    }

    public void setItemFrequency(int itemFrequency) {
        this.itemFrequency = itemFrequency;
    }

    public int getItemErrors() {
        return itemErrors;
    }

    public void setItemErrors(int itemErrors) {
        this.itemErrors = itemErrors;
    }

    public ArrayList<Double> getPriceList() {
        return priceList;
    }

    public void setPriceList(ArrayList<Double> priceList) {
        this.priceList = priceList;
    }

    public int getPrice1Frequency() {
        return price1Frequency;
    }

    public void setPrice1Frequency(int price1Frequency) {
        this.price1Frequency = price1Frequency;
    }

    public int getPrice2Frequency() {
        return price2Frequency;
    }

    public void setPrice2Frequency(int price2Frequency) {
        this.price2Frequency = price2Frequency;
    }

    public String getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(String groceryList) {
        this.groceryList = groceryList;
    }
}
