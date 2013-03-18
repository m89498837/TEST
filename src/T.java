import java.util.HashMap;
import java.util.Map;


public class T {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<String, String>();
        m.put("1", "1");
        m.put("1", "2");
        System.out.println(m.keySet());
        System.out.println("a".equalsIgnoreCase("b"));

    }

}
