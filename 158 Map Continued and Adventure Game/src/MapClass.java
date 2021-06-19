import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<String, String> language = new HashMap<>();
        if (language.containsKey("Java")) {
            System.out.println("Java is already exist");
        } else {
            language.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        language.put("Phython", "an interpreted,object-oriented, high level programing language with dynamic semantics");
        language.put("Algol", "an algorithmic language");
        System.out.println(language.put("BASIC", "Beginners All Purposes Symbolic Instructions Code"));
        System.out.println(language.put("Lisp", "Therein lies madness"));

        if (language.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            System.out.println(language.put("Java", "this course is about Java"));

        }
        System.out.println("===================================");

        for (String key : language.keySet()) {
            System.out.println(key + ":" + language.get(key));
        }
    }
}
