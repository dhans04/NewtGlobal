package org.studyeasy;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList1=new LinkedList<>();
        linkedList1.add("dhans");
        linkedList1.add("dhivs");
        linkedList1.add("anu");
        linkedList1.add("lava");
        linkedList1.add("priya");
        linkedList1.add("Srija");
        System.out.println(linkedList1);
        linkedList1.add(2,"rani");
        System.out.println(linkedList1);
        linkedList1.set(0,"Dhanu");
        System.out.println(linkedList1);
        linkedList1.remove(2);
        System.out.println(linkedList1);


    }
}
