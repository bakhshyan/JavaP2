package dataimport;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;


public class JsonParser {


    public ArrayList<Car> importJson() throws IOException, ParseException {
        Object object = new JSONParser().parse(new FileReader("resources/Cars.json"));
        JSONObject jsonObject = (JSONObject) object;
        JSONArray jsonArray = (JSONArray) jsonObject.get("cars");

        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(String.valueOf(jsonArray), new TypeReference<ArrayList<Car>>() {});
    }


}
