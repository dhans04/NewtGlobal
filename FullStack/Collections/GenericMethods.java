package org.studyeasy;

import java.util.ArrayList;
import java.util.List;

class Data5{
    public <E> void print(List<E> list){
        for (E elements: list){
            System.out.println(elements);
        }
    }
    public <E> void printArray(E[] array){
        for (E data:array){
            System.out.println(data);
        }
    }
}

public class GenericMethods {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(12);
        list1.add(45);
        list1.add(90);
        list1.add(56);
        new Data5().print(list1);

        List<String> list2=new ArrayList<>();
        list2.add("ABC");
        list2.add("DEF");
        list2.add("GHI");
        list2.add("JKL");
        new Data5().print(list2);

        String[] stringArray={"One","Two","Three","Four","Five"};
        new Data5().printArray(stringArray);

        // we can't able to declare int bcz it's primitive data type
        Integer[] intArray={56,89,56,34,9};
        new Data5().printArray(intArray);

    }
}
