package org.studyeasy;

import java.util.LinkedList;
import java.util.List;
class Name implements Comparable<Name>{
    private String name;
    public Name(String name) {
        this.name=name;
    }
    @Override
    public String toString() {
        return name;
    }
    @Override
    public int compareTo(Name obj) {
        if(name.length() == obj.name.length()) {
            return 0;
        }
        else if (name.length() > obj.name.length()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
public class CompareTo1 {
    public static void main(String[] args) {
        // same 0
        // param1 is greater 1
        // param2 is greater -1

        String a="b";
        String x="a";
        System.out.println(a.compareTo(x));

        List<Object> elements=new LinkedList<>();
        elements.add(new Name("hans"));
        elements.add(new Name("Aivya"));
        elements.add(new Name("Lavanya"));
        // we can't use direct sort() here beacuse this is the custom object and not having comparable interface

        System.out.println(elements);
        elements.sort(null);
        System.out.println(elements);
    }
}
