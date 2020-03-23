import java.util.ArrayList;
import java.util.regex.Pattern;

public abstract class ItemManager {
    Pattern itemPattern;
    Pattern pricesPattern;
    Pattern price1Pattern;
    Pattern price2Pattern;
    String itemName;
    int itemFrequency;
    int itemErrors;
    ArrayList<Double> priceList;

    public ItemManager(){
        this.priceList = new ArrayList<>();
    }

    public int itemFreq(Pattern itemPattern){
        return -1;
    }

    public Double getItemPrices(Pattern pricesPattern){return null;}

    public Double getItemPrice1(){return null;}

    public int getItemPrice1Freq(Pattern price1Pattern){return -1;}

    public Double getItemPricePrice2(){return null;}

    public int getItemPrice2Freq(Pattern price2Pattern){return -1;}

    public String[] getItemStats() throws Exception {
        return null;
    }

    public int getErrorFreq(){return -1;}

}
