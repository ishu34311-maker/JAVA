import java.util.HashMap;
public class Hasmap {
    public static void main(String[] args) {
        
        //HashMap = A data structure that stores key-value pairs
        //          Keys are unique, but values can be dublictaed
        //           Does nto maintain any order, but is memory efficient
        //          HashMap<Key, Value>

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Ishu", 99);
        marks.put("Aarya", 100);
        marks.put("Aditya", 1300);
        marks.put("Vansh", 103);
        marks.put("Muskan", 104);
        marks.put("Anushka", 1000);

       // marks.remove("Anushka");

       /*  if (marks.containsKey("Aarya")) {
            System.out.println(marks.get("Ishu"));
        }else{
            System.out.println("Key not found");
        } */

        //System.out.println(marks);
        //System.out.println(marks.containsValue(99));
       // System.out.println(marks.size());
        for(String key : marks.keySet()){
            System.out.println(key + " : $" + marks.get(key));
        }
    }
}
