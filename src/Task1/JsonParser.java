package Task1;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import org.json.*;

public class JsonParser {


    public ArrayList<Car> importJson() throws IOException, ParseException {
        Object object = new JSONParser().parse(new FileReader("resources/Cars.json"));
        JSONObject jsonObject = (JSONObject) object;
        JSONArray jsonArray = (JSONArray) jsonObject.get("cars");

        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(String.valueOf(jsonArray), new TypeReference<ArrayList<Car>>() {});
    }


}
