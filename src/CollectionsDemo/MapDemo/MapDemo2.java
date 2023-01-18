package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class MapDemo2 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(102,"Amol");
        hm.put(222,"Yuvarani");
        hm.put(112,"Vishal");
        hm.put(322,"Sunil");
        hm.put(412,"Rutuja");
        hm.put(311,"Roshan");
        hm.put(111,"Ramesh");

        System.out.println("hm="+hm);

        HashMap<Integer,String> hm2 = new HashMap<>();

        System.out.println("hm2="+hm2);

        hm2.putAll(hm);

        System.out.println("hm2="+hm2);





    }
}
