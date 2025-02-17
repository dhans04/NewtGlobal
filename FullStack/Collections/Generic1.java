package org.studyeasy;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

class Data{
    private Object object;
    public Data (Object object){
        this.object=object;
    }

    public Object getObject() {
        return object;
    }

    @Override
    public String toString() {
        return object.toString();
    }
}
class Name1{
    private String name;

    public Name1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name1{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Generic1 {
    public static void main(String[] args) {
        List<Data> elements = new LinkedList<>();
        elements.add(new Data("Carrot"));
        elements.add(new Data("Tomato"));
        elements.add(new Data("Cabbage"));
        elements.add(new Data("Brinjal"));
        elements.add(new Data(new Name("XYZ")));
        System.out.println(elements);

        Data x=new Data("Hello world");
        String y=new Data("Variable y").toString();
        System.out.println(y);
        System.out.println(x.getObject());
    }
}
