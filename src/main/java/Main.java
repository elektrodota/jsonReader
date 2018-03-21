import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final ObjectMapper mapper = new ObjectMapper();


    public static void main(String args[]) {

        Map<String, String> countryInformations = new HashMap<String, String>();
        try {
            countryInformations = mapper.readValue(new URL("http://country.io/capital.json"),HashMap.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(countryInformations);

    }
}
