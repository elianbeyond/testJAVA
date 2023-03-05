package Leetcode;

import java.util.*;

public class EdPrac {
    public static void main(String[] args) {
        //TODO
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        double a,b;
        if(sc.hasNextDouble()){
            a = sc.nextDouble();
        }else {
            System.out.println("Invalid input.");
            return;
        }
        if(sc.hasNextDouble()){
            b = sc.nextDouble();
            sc.nextLine();
        }else {
            System.out.println("Invalid input.");
            return;
        }
        double c = (a+b)*b;
        if(c==(a*a)){
            System.out.println("Golden ratio!");
        }else{
            System.out.println("Maybe next time.");
        }


    }
}
