package Leetcode;

import java.util.HashSet;

public class Leetcode {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abc";
        String[] s2 = solution.permutation(s);
        for (String s3 : s2) {
            System.out.println(s3);
        }
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);

        LeetCodeUtil.show(a);


    }

}

class Solution {
    public String[] permutation(String s) {

        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char item1 = s.charAt(i);
            String s1 = String.valueOf(item1);
            for (int j = 0; j < s.length(); j++) {
                char item2 = s.charAt(j);
                if (item2 == item1) {
                    continue;
                }
                String s2 = String.valueOf(item2);
                for (int k = 0; k < s.length(); k++) {
                    char item3 = s.charAt(k);
                    if (item3 == item2 || item3 == item1) {
                        continue;
                    }
                    String s3 = String.valueOf(item3);
                    String str = s1 + s2 + s3;
                    hs.add(str);
                }
            }

        }
        String[] array = new String[hs.size()];
        return hs.toArray(array);

    }

}