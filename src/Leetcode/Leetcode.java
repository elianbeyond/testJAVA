package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Leetcode {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Integer [] arr ={3,1,4,null,2};
        System.out.println(solution.kthLargest(LeetCodeUtil.createTree(arr),arr.length));



    }

}

class Solution {
    //子串--滑动窗口
    //这个题目我们找到每一个right窗口对应的最大的无重字串，最后比大小存进res
    //由于right增加后，前面的序列不变，该重复还得重复，故left不用清零，继续增加即可
    List<Integer> res = new LinkedList<>();
    public int kthLargest(TreeNode root, int k) {
        return 0;


    }
    void
}