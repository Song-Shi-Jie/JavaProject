import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @Author: 宋世杰
 * @Date: 2023-04-04 17:28:01
 * @LastEditTime: 2023-04-07 09:23:49
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\Solution.java
 * @Description: 请自行修改描述
 */

public class Solution {
    // private static final Random RANDOM = new Random();

    public int[] sortArray(int[] nums) {
        // for(int cur : nums){
        // cur += OFFSET;
        // }

        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();

        int bucket_count = 5;
        int bucket_size = (max - min) / bucket_count + 1;

        List[] buckets = new ArrayList[bucket_count];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < nums.length; i++) {
            int idx = (nums[i] - min) / bucket_size;
            buckets[idx].add(nums[i]);
        }

        for (int i = 0; i < buckets.length; i++) {
            buckets[i].sort(null);
        }
        List<Integer> res = new ArrayList<>();
        for (List l : buckets) {
            System.out.println(l);
            res.addAll(l);
        }
        Object[] t = res.toArray();
        int[] tmp = new int[t.length];
        int k = 0;
        for (Object cur : t) {
            tmp[k] = (Integer) cur;
            k++;
        }
        return tmp;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 5, 1, 1, 2, 0, 0 };
        Solution s = new Solution();
        int[] tmp = s.sortArray(nums);
        for (int cur : tmp) {
            System.out.print(cur + " ");
        }
    }
}