package org.studyeasy;

/*
T - Type
E - Element
K - Key
N - number
V - value
* */
class Data4<K,V>{
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Data4(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data4{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
    //Generic methods
    public <E,N>void display(E elements,N number){
        System.out.println("Element : "+elements+" Number : "+number);
    }
 }
public class ParametersType {
    public static void main(String[] args) {
        Data4<Integer,String> data=new Data4(20,"Dhanusya");
        System.out.println("Key : "+data.getKey()+" Value : "+data.getValue());
        data.display("Dhans",21);
    }
}
