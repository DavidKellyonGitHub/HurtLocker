import org.apache.commons.io.IOUtils;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        return IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
    }

    public static void main(String[] args) throws Exception{
        String milk = (new ResultPrinter().formatItemResults(new MilkManager()));
        String bread = (new ResultPrinter().formatItemResults(new BreadManager()));
        String cookies = (new ResultPrinter().formatItemResults(new CookiesManager()));
        String apples = (new ResultPrinter().formatItemResults(new ApplesManager()));
        System.out.println(milk + bread + cookies + apples);

    }
}
