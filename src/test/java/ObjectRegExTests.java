import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectRegExTests {
    Pattern objectPat = Pattern.compile("milk.*[^##]*");

    @Test
    public void isolateObjectTest(){
    String testObject = "milk,price,ehhh,whatever,etc.##bread,whatever,eh,whatever";
    Assert.assertTrue(objectPat.matcher(testObject).find());
    }

    @Test
    public void createListOfAllObjects(){
        String testObject = "milk,price,numbers##bread,price,numbers##milk,ahhhhhh";
        ArrayList<String> testList = new ArrayList<>();
        Matcher objectMat = objectPat.matcher(testObject);
        while(objectMat.find()){
            testList.add(objectMat.group());
        }
        for (String str : testList)
        System.out.println(str);
        System.out.println(testList.size());
    }
}
