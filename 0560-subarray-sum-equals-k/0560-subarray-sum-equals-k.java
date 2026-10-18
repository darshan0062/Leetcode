import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);              // total 0 seen once (before starting)

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum = sum + num;        // 1. update running total

            int need = sum - k;     // 2. which earlier total do I need?

            if (map.containsKey(need)) {
                count+=map.get(sum-k); // 3. add how many times I saw it
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);   // 4. write current total in notebook
        }
        return count;
    }
}