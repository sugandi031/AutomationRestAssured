package Helper;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class yamlHelper {
    public static Map<String, Object> loadYaml(String fileName){
        Yaml yaml = new Yaml();
        InputStream getFileYaml = yamlHelper.class.getClassLoader().getResourceAsStream("data/" + fileName);
        return yaml.load(getFileYaml);
    }
    public static Map<String, Object> getYamlData(String key, Map<String, Object> data){
        return (Map<String,Object>) data.getOrDefault(key, new HashMap<>());
    }
}
