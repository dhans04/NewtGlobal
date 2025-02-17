package org.studyeasy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList1=new LinkedList<>();
        linkedList1.add("dhans");
        linkedList1.add("dhivs");
        linkedList1.add("anu");

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Anu");
        arrayList.add("Dhivya");
        arrayList.add("Lava");
//
//        System.out.println(linkedList1);
//        System.out.println(arrayList);
        new ListInterface1().printList(linkedList1);
    }
    // if we declare the type as arraylist we can't able to pass linked list and viseversa
    // so that list interface had used
    void printList(List<String> list){
        for(String value:list){
            System.out.println(value);
        }
    }
}
