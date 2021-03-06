import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Created by miral on 7/7/2017.
 */
public class SAXParserDemo {

    public static void main(String[] args) throws Exception {
        SAXParserFactory parserFactor = SAXParserFactory.newInstance();
        SAXParser parser = parserFactor.newSAXParser();
        SAXHandler handler = new SAXHandler();
        parser.parse(ClassLoader.getSystemResourceAsStream("employee.xml"),
                handler);

        //Printing the list of employees obtained from XML
        for (Employee emp : handler.empList) {
            System.out.println(emp);
        }
    }
}