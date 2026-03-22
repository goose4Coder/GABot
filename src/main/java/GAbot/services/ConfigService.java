package GAbot.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class ConfigService {
    protected Map<String,String> parameters;
    public ConfigService(){
        parameters=new HashMap<String,String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("config.csv"));
            String header = br.readLine(); // skip header
            if (header == null) return;

            String line;
            while ((line = br.readLine()) != null) {
                String[] pair=line.split(",");
                parameters.put(pair[0],pair[1]);
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
    public String getParameter(String parameter){
        return parameters.get(parameter);
    }

}
