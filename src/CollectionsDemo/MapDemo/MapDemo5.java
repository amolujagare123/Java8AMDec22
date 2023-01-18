package CollectionsDemo.MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo5 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        System.out.println("isEmpty="+hm.isEmpty());

        hm.put(102,"Amol");
        hm.put(222,"Yuvarani");
        hm.put(112,"Vishal");
        hm.put(322,"Sunil");
        hm.put(412,"Rutuja");
        hm.put(311,"Roshan");
        hm.put(111,"Ramesh");

        System.out.println("hm="+hm);

        Set s = hm.keySet();
        Collection values = hm.values();
        Set entrySet = hm.entrySet();

        System.out.println("Set="+s);
        System.out.println("values="+values);
        System.out.println("entrySet="+entrySet);





    }
}
