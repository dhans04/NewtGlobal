package org.studyeasy;

public class DecisionMaking {
    public static void main(String[] args) {
        int x = 6;

        if ( x != 6) {
            System.out.println("X is not 6");
        }else {
            System.out.println("X is 6");
        }

        System.out.println("Sample code");
        int y = 5;

        if ( y >= 5) {
            System.out.println("Y is greater or equal to 5");
        }else {
            System.out.println("Y is lower than 5");
        }

        boolean a = true;
        boolean b = false;

        if ( b || a ) {
            System.out.println("Condition is TRUE");
        }else {
            System.out.println("Condition is FALSE");
        }

  //      int x  = 5;
//        int y = 10;
//
//        if ( (x < y) && (y >= 10) ) {
//            System.out.println("Condition is TRUE");
//        }else {
//            System.out.println("Condition is FALSE");
//        }

        int ageOfBoy = 20;
        int ageOfGirl = 28;

        if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) {
            System.out.println("Eligible for marriage");
        } else {
            System.out.println("Wait for it kiddo!");
        }

        int l = 4;
        int m = 10;

        if (l == 5){
            System.out.println("L is 5");
        }else if(l > 5){
            System.out.println("L is greater 5");
        }else{
            System.out.println("L is smaller 5");
            if (m == 10){
                System.out.println("M is 10");
            }
        }





    }

}
