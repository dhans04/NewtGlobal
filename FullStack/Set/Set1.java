package org.studyeasy.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("ABC");
        set.add("DEF");
        set.add("GHI");
        set.add("aBC");
        System.out.println(set);

        System.out.println(set.contains("ABc"));

        //HashSet - don't follow any order
        //          - Allow one null key, fastest for operations such as add, remove,search

        Set set1=new HashSet<>();
        for(int i=30;i>=0;i--){
            set1.add("A"+i);
        }

        System.out.println(set1);

        //HashSet -  follow the order of adding element
        //          - Allow one null key, close second

        Set set2=new LinkedHashSet<>();
        for(int i=30;i>=0;i--){
            set2.add("A"+i);
        }

        System.out.println(set2);
        //TreeSet - Sort all objetc
        //          - Doesn't allow null key, Slow in performing operation because of having sorting nature


        Set set3=new TreeSet<>();
        for(int i=30;i>=0;i--){
            set3.add("A"+i);
        }

        System.out.println(set3);

    }
}
