import org.apache.commons.io.IOUtils;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public static String readRawDataToString() throws Exception{
        ClassLoader classLoader = Main.class.getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    //scope issue?  objects unusable in PSVM after execution
    public static void instantiateAndPopulate() throws Exception {
        MilkManager mainMilk = new MilkManager();
        mainMilk.assignFields();
        BreadManager mainBread = new BreadManager();
        mainBread.assignFields();
        CookiesManager mainCookies = new CookiesManager();
        mainCookies.assignFields();
        ApplesManager mainApples = new ApplesManager();
        mainApples.assignFields();
    }

    public static void main(String[] args) throws Exception{
        MilkManager mainMilk = new MilkManager();
        mainMilk.assignFields();
        BreadManager mainBread = new BreadManager();
        mainBread.assignFields();
        CookiesManager mainCookies = new CookiesManager();
        mainCookies.assignFields();
        ApplesManager mainApples = new ApplesManager();
        mainApples.assignFields();
        String milk = (new ResultPrinter().formatItemResults(mainMilk));
        String bread = (new ResultPrinter().formatItemResults(mainBread));
        String cookies = (new ResultPrinter().formatItemResults(mainCookies));
        String apples = (new ResultPrinter().formatItemResults(mainApples));
        System.out.println(milk + bread + cookies + apples);

    }
}
