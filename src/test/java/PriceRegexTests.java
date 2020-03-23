import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceRegexTests {
    Pattern pricePat = Pattern.compile("(?i:price[:@^*%]\\d[.]\\d\\d)");

    @Test
    public void testColon() {
        String testPrice = "price:1.25";
        Assert.assertTrue(pricePat.matcher(testPrice).find());
    }

    @Test
    public void testAt(){
        String testPrice = "price@1.25";
        Assert.assertTrue(pricePat.matcher(testPrice).find());
    }

    @Test
    public void amidstCharsTest(){
        String testPrice = "abc##price@1.252323232";
        Assert.assertTrue(pricePat.matcher(testPrice).find());
    }

    @Test
    public void splitToAmountTest(){
        String testPrice = "abc##price@1.252323232";
        Double expected = 1.25;
        String test = "";
        ArrayList<String> testList = new ArrayList<>();
         Matcher priceMat = pricePat.matcher(testPrice);
         while (priceMat.find()){
             testList.add(priceMat.group());
         }
         int counter = 0;
         Double actual = Double.parseDouble(testList.get(0).split("[:@^*%]")[1]);
        Assert.assertEquals(expected,actual);
    }
}
