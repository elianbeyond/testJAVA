package Leetcode;

import java.util.*;

public class EdPrac {
    public static void main(String[] args) {
        //TODO
        //判断输入是否合法 Determine whether the input is legal
        int num;
        Scanner sc = new Scanner(System.in);
        try{
            num = sc.nextInt();
        }catch (Exception e){
            System.out.println("Error in input");
            return;
        }
        sc.nextLine();
        boolean flag2 = false;
        if (num <= 0) {
            System.out.println("Error in input");
            return;
        }
        if (num == 1 || num == 2) {
            flag2 = true;
        }
        int i = 0;
        boolean flag = false;


        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] ints = new int[arr.length];
        if (arr.length != num) {
            System.out.println("Invalid input");
            return;
        }

        for (i = 0; i < arr.length; i++) {
            try{
                ints[i] = Integer.parseInt(arr[i]);
            }catch (Exception e){
                System.out.println("Invalid input");
                return;
            }
            if (ints[i] < 0) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("Invalid input");
            return;
        }
        if (flag2) {
            System.out.println("It is an Amazing Sequence");
            return;
        }


        HashSet<Integer> difs = new HashSet<>();
        for (i = 1; i < num; i++) {
            if (ints[i] <= ints[i - 1] || ints[0]!=0) {
                System.out.println("It is an ordinary sequence");
                return;
            }
            for (int j = 0; j < i; j++) {
                int tem = ints[i] - ints[j];
                if (difs.contains(tem)) {
                    System.out.println("It is an ordinary sequence");
                    return;
                }
                difs.add(tem);


            }
        }
        System.out.println("It is an Amazing Sequence");
        return;


    }
}
