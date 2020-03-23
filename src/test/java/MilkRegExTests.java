import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class MilkRegExTests {
    Pattern milkPat = Pattern.compile("(?i:.*milk.*)");

    @Test
    public void lowerCaseTest(){
        String testMilk = "milk";
        Assert.assertTrue(milkPat.matcher(testMilk).find());
    }

    @Test
    public void upperCaseTest(){
        String testMilk = "MILK";
        Assert.assertTrue(milkPat.matcher(testMilk).find());
    }

    @Test
    public void multiCaseTest(){
        String testMilk = "MilK";
        Assert.assertTrue(milkPat.matcher(testMilk).find());
    }

    @Test
    public void amidstCharsTest(){
        String testMilk = "123heyheyMiLkyehyeh321";
        Assert.assertTrue(milkPat.matcher(testMilk).find());
    }
}
