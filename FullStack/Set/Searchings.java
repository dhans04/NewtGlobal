package org.studyeasy.Set;

import java.util.*;
class Name implements Comparable<Name>{
    private String name;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Name name1 = (Name) object;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Name(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Name o) {
        return name.compareTo(o.getName());
    }
}
public class Searchings {
    public static void main(String[] args) {
        Set<Name> set=new HashSet<>();
        set.add(new Name("Dhans"));
        set.add(new Name("Dhivs"));
        set.add(new Name("Lavs"));
        set.add(new Name("Srija"));
        set.add(new Name("Priya"));
        set.add(new Name("Anu"));
        set.add(new Name("Dhivs"));

        //Collections.sort(set);4
        List<Name> list=new ArrayList<>();
        list.addAll(set);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,new Name("Srija")));
    }
}
