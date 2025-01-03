package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise2 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Abşeron");
        map.put(2, "Ağdam");
        map.put(3, "Ağdaş");
        map.put(4, "Ağcabədi");
        map.put(6, "Ağsu");
        map.put(8, "Astara");



        Object[] list = map.values().toArray();
        for (Object s : list){
            System.out.println(s);
        }


        Set<Integer> set = map.keySet();
        for (Integer i : set){
            System.out.println(i);
        }

        Set<Map.Entry<Integer, String>> entryMap = map.entrySet();
        for (Map.Entry<Integer, String> s : entryMap){
            System.out.println(s);
        }


    }
}
