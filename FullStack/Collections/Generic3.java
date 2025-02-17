package org.studyeasy;

import java.util.LinkedList;
import java.util.List;

class Data2<T>{
    private T object;
    public Data2(T object){
        this.object=object;
    }

    @Override
    public String toString() {
        return object.toString();
    }
}
public class Generic3 {
    public static void main(String[] args) {
        //to add all data type into single list we can go for object data type
        List<Data2<Object>> elements=new LinkedList<>();
        elements.add(new Data2<Object>("XYZ"));
        elements.add(new Data2<Object>(23));
        elements.add(new Data2(67.8));
        elements.add(new Data2<>('$'));

        for(Object data:elements){
            System.out.println(data);
        }
    }
}
