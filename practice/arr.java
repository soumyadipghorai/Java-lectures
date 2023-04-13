import java.util.*;

public class arr{
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        String[] arr = {"ijcndcn", "adjcnd"}; 
        System.out.println(arr[0]);


        HashMap<String, Integer> map = new HashMap<>();

        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
 
        System.out.println("Size of map is:- "
                           + map.size());
 
 
        System.out.println(map);
 
        if (map.containsKey("vishal")) {
 
            Integer a = map.get("vishal");
 
            System.out.println("value for key"
                               + " \"vishal\" is:- " + a);
        }
    }
}