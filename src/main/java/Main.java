import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

public class Main {

    private static final ObjectMapper mapper = new ObjectMapper();


    public static void main(String args[]) {

        Map<String, String> countryInformations = null;
        try {
            countryInformations = mapper.readValue(new URL("http://country.io/capital.json"), Map.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(countryInformations);

    }
}
