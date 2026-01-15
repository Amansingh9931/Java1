
import java.util.*;

public class PersonAge{
    public static void main(String[] args) {
        HashMap<String,Integer> m=new HashMap<>();
        m.put("Aura",33);       // put -> insert / update
        m.put("Jeet",19);
        m.put("lakhan",23);
        m.put("Sameer",31);
        System.out.println(m.get("Aura"));
        m.put("Aura",35);
        System.out.println(m.get("Aura"));
        //removing 
        System.out.println(m.remove("Jeet"));
        System.out.println(m.get("Jeet"));

        //check it contains or not
        System.out.println(m.containsKey("Jeet"));
        
        //doesn't exist then it will enter
        m.putIfAbsent("Amar", 24);

        //get all keys 
        System.out.println(m.keySet());
        //get all values
        System.out.println(m.values());

        //get all enteries
        System.out.println(m.entrySet());
        
        //traversing all entries
            // 1 method
            for(String key : m.keySet()){
                System.out.printf("Age of %s is %d\n",key,m.get(key));
            }

            System.out.println();
            // 2 method
            for(Map.Entry<String, Integer> e: m.entrySet()){
                System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
            }
            System.out.println();
            //or
            for(var e: m.entrySet()){
                System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
            }
    }
} 