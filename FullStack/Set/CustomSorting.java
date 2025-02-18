package org.studyeasy.Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Data7<K,V>{
    private K key;
    private V value;

    @Override
    public String toString() {
        return "Data7{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public Data7(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
public class CustomSorting {
    public static void main(String[] args) {
        Comparator<Data7<Integer,String>> comparatorKey=new Comparator<Data7<Integer, String>>() {
            @Override
            public int compare(Data7<Integer, String> o1, Data7<Integer, String> o2) {
                if(o1.getKey()<o2.getKey()){
                    return  -1;
                } else if (o1.getKey()>o2.getKey()) {
                    return 1;
                    
                }
                return 0;
            }
        };
        Set<Data7<Integer,String>> set=new TreeSet<>(comparatorKey);
        set.add(new Data7<>(57,"Dhans"));
        set.add(new Data7<>(45,"Dhivya"));
        set.add(new Data7<>(51,"Anu"));
        set.add(new Data7<>(66,"Lava"));
        set.add(new Data7<>(57,"Dhans"));
        set.add(new Data7<>(57,"Dhan"));
        for (Data7 d:set){
            System.out.println(d);
        }

    }
}
