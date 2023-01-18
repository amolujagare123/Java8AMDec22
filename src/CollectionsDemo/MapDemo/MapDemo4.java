package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class MapDemo4 {

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


        System.out.println("isEmpty="+hm.isEmpty());
        System.out.println("size="+hm.size());
         System.out.println("hm="+hm);

        System.out.println(hm.containsValue("Sunil1"));
        System.out.println(hm.containsKey(220));

        hm.clear();
        System.out.println("hm="+hm);






    }
}
