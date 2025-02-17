package org.studyeasy;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("Apple");
        list1.add("Orange");
        list1.add("Grapes");
        list1.add("Watermelon");
        new Iterator1().printList(list1);
        list1.sort(null);
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);
    }
    void printList(List<String> list){
        Iterator<String> value=list.listIterator();
        while (value.hasNext()){
            System.out.println(value.next());
        }
    }
}
