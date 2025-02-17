package org.studyeasy;
class Data6<K extends Name2,V extends Integer>{
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data6{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public Data6(K key, V value) {
        this.key = key;
        this.value = value;
    }
    //Generic methods
    //If we pass integer in string place and vice versa also it will get executes
    // we need to provide restriction for that
    public <E extends String,N extends Number>void display(E elements,N number){
        System.out.println("Element : "+elements+" Number : "+number);
    }
}
class Name2{
    private String name;

    public Name2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class BoundedParametersType {
    public static void main(String[] args) {
        Data6<Name2,Integer> data=new Data6(new Name2("Dhans"),20);

        System.out.println(data);

        //If we pass integer in string place and vice versa also it will get executes
        // we need to provide restriction for that
        //data.display(34,"huidgdyu");
        data.display("Dhans",1);
    }
}
