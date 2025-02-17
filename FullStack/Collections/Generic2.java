package org.studyeasy;
class Data1{
    private Object data;

    public Object getData() {
        return data;
    }

    public Data1(Object data) {
        this.data = data;
    }


}
class GenericData<T>{
    private T data;

    public GenericData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
public class Generic2 {
    public static void main(String[] args) {
        Data1 d1=new Data1("Some Data");
        String x=(String) d1.getData();
        System.out.println(x);

        GenericData<String> genericData=new GenericData<>("Generic Data");
        String Y=(String) genericData.getData();
        System.out.println(Y);
    }
}
