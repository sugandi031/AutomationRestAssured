package Helper;

import java.util.HashMap;
import java.util.Map;

public class path {
    public static Map<String, String>  PATH = new HashMap<>();

    static {
        PATH.put("PostAuth", "/auth/api-key");
    }
    public static String getPath(String path) {
        return PATH.getOrDefault(path, "");
    }
}