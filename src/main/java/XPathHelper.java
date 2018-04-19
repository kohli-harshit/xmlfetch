import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

public class XPathHelper {

    public static String getElementText(String xmlPath,String xPath){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder;
        Document doc;
        try {
            builder = factory.newDocumentBuilder();
            doc = builder.parse(xmlPath);
            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();
            XPathExpression expr = xpath.compile(xPath);
            NodeList nodes = (NodeList) expr.evaluate(doc,XPathConstants.NODESET);

            if(nodes.getLength()==0){
                throw new Exception("Incorrect XPath");
            }
            else if(nodes.getLength()>1){
                throw new Exception("More than 1 elements found");
            }
            else{
                return nodes.item(0).getFirstChild().getNodeValue();
            }

        } catch (Exception e) {
            return "Error - " + e.getMessage();
        }
    }
}