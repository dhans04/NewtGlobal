package org.studyeasy.Set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps1 {
    public static void main(String[] args) {
        //HashMap - don't follow any order
        //TreeMap - follows the ascending order
        Map<String,String> map=new HashMap<>();
        map.put("a1","Dhans");
        map.put("a2","Dhivya");
        map.put("a3","Anu");
        map.put("a4","Dhans");
        map.put("a1","Dhan");
        System.out.println(map);

        for(String key: map.keySet()){
            System.out.println("Key: "+key+" Value: "+map.get(key));
        }

        for(Map.Entry<String,String> entry: map.entrySet()){
            System.out.println("Key: "+entry.getKey()+" value: "+entry.getValue());
        }

        Iterator<Map.Entry<String,String>> entryIterator=map.entrySet().iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String,String> temp=entryIterator.next();
            System.out.println("Key: "+temp.getKey()+" Value: "+temp.getValue());
        }
    }
}
