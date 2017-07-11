import java.util.*;

public class Arrays { 

    public static void main (String[] args) {
    int [] primeNumbers = {2,3,4,5,11,13};
    System.out.println(primeNumbers);


    List list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(4);

    
    System.out.println(list.get(1));


    List Countries = new ArrayList();
    Countries.add("England");
    System.out.println(Countries.get(0));
    

    // Maps
    // Maping certein indexes to certain vaules
    Map map = new HashMap();
    map.put("Father","Rob");
    map.put("Mother","Maria");
    System.out.println(map.get("Father"));

    System.out.println(map.toString());


    map.remove("Mother");
    System.out.println(map.toString());
    
    }



    
}
