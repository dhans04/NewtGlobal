package org.studyeasy;

import java.util.ArrayList;
class IntWrapper{
    public int num;

    public IntWrapper(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
public class ArrayList1 {
    public static void main(String[] args) {
        // --ArrayList
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Anu");
        arrayList.add("Dhivya");
        arrayList.add("Lava");
        arrayList.add("Priya");
        arrayList.add("Dhans");
        for(String name:arrayList){
            System.out.print(name+" ");
        }
        System.out.println(arrayList.remove("dhans"));
        System.out.println(arrayList.set(1,"Srija"));
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf("Dhans"));

        //Inbuild wrapper class (int -> Integer)
        ArrayList<Integer> arrayList1=new ArrayList<>();
        arrayList1.add(20);
        arrayList1.add(30);//Autoboxing
        System.out.println(arrayList1.get(0));//Auto unboxing

        //Userbuild Wrapper class
        ArrayList<IntWrapper> userWrapper=new ArrayList<>();
        userWrapper.add(new IntWrapper(40));//boxing
        System.out.println(userWrapper.get(0).getNum());//unboxing

        ArrayList<Double> doubleArray=new ArrayList<>();
        doubleArray.add(Double.valueOf(25.5));//autoboxing
        System.out.println(doubleArray);
        System.out.println(doubleArray.get(0).doubleValue());//unboxing


    }
}