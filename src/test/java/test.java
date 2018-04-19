import org.junit.Assert;
import org.junit.Test;
import pojo.Environment;

import javax.xml.bind.JAXBContext;
import java.io.File;

public class test {

    String xmlPath = "./data/sample.xml";

    @Test
    public void getXMLValueWithXPath(){
        String expected = "tytest";
        String actual = XPathHelper.getElementText(xmlPath,"//application[@id='tm']//username");
        Assert.assertEquals("Expected value = " + expected + ", Actual = " + actual, expected,actual);

        expected = "Error - Incorrect XPath";
        actual = XPathHelper.getElementText(xmlPath,"//xyz");
        Assert.assertEquals("Expected value = " + expected + ", Actual = " + actual, expected,actual);

        expected = "Error - More than 1 elements found";
        actual = XPathHelper.getElementText(xmlPath,"//application");
        Assert.assertEquals("Expected value = " + expected + ", Actual = " + actual, expected,actual);
    }

    @Test
    public void getXMLValueWithPOJO() throws Exception{
        Environment environment = (Environment)JAXBContext.newInstance(Environment.class).createUnmarshaller().unmarshal(new File(xmlPath));
        String expected = "tytest";
        String actual = environment.getApplication()[0].getDb().getUsername();
        Assert.assertEquals("Expected value = " + expected + ", Actual = " + actual, expected,actual);
    }
}
