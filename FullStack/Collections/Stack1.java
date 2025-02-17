package org.studyeasy;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {

        // --stack
        Stack<Integer> st=new Stack<>();
        st.push(34);
        st.push(90);
        st.push(32);
        st.push(78);
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.search(90));
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.get(1));
        System.out.println(st.indexOf(90));

        //vectors


    }
}
