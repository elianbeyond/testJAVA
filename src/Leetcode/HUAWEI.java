package Leetcode;

import java.util.HashSet;
import java.util.Scanner;

public class HUAWEI {
    public static void main(String[] args) {
        // please define the JAVA input here. For example: Scanner s = new Scanner(System.in);
        // please finish the function body here.
        // please define the JAVA output here. For example: System.out.println(s.nextInt());
        HashSet<String> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            s = s.toLowerCase();
            int begin1 = s.indexOf("http");
            int begin2 = s.indexOf("https");
            int end = s.indexOf(".com");
            int len = s.length();
            String res = new String();
            while ((begin1 != -1 || begin2 != -1) && end != -1) {
                int count = hs.size();
                len = s.length();
                //http 的情况
                if (begin2 == -1) {
                    res = s.substring(begin1 + 7, end + 4);
                }
                //https的情况
                else {
                    res = s.substring(begin1 + 8, end + 4);
                }
                s = s.substring(0, begin1) + s.substring(end + 3, len);

                begin1 = s.indexOf("http");
                begin2 = s.indexOf("https");
                end = s.indexOf(".com");
                String res2 = res.replace(" ","");
                if(!res2.equals(res)){
                    continue;
                }
                hs.add(res);
                if (hs.size() != count) {
                    System.out.println(res);
                }
            }
        }
        if(hs.size() == 0){
            System.out.println("none");
        }


    }
}