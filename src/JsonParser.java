import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URL;


/**
 * Created by miral on 7/7/2017.
 */
public class JsonParser {
    public static void main(String[] args) {


        JSONParser parser = new JSONParser();


        try {
            URL url = Resources.getResource("employee.json");
            String text = Resources.toString(url, Charsets.UTF_8);
            Object obj = parser.parse(text);
            JSONArray array = (JSONArray) obj;
            for (Object jsonObject : array) {
                JSONObject obj2 = (JSONObject) jsonObject;
                System.out.println(" element of array");
                System.out.println(obj2);

            }


        } catch (ParseException pe) {

            System.out.println("position: " + pe.getPosition());
            System.out.println(pe);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
