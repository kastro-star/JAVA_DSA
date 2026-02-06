import java.util.*;
public class HashMap_ProblemSolvingApproach {
    public static void main(String[] args) {



    HashMap<Integer, String> kas = new HashMap<>();

        // Add elements to the Hashmap
        kas.put(1,"ALice");
        kas.put(2,"bob");
        kas.put(3,"Arun");

        // Get Values using Key
        System.out.println(kas.get(1));


        //Checks if the key exists         True / False
        System.out.println(kas.containsKey(1));

        //Checks if the value exists      True / false
        System.out.println(kas.containsValue("alice"));


        // remove using key  with value is not allowded
        System.out.println(kas.get(1));
        kas.remove(1);
        System.out.println(kas.get(1));


        //length of them
        System.out.println(kas.size());

        //Checks if empty
        System.out.println(kas.isEmpty());
    }

}
