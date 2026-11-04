class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[]arr= new int[nums1.length];
        Stack<Integer> s= new Stack<>();
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            if(s.isEmpty()){
                s.push(nums2[i]);

            }while(!s.isEmpty()&&s.peek()<nums2[i]){
                int ans=s.pop();
                h.put(ans,nums2[i]);
            }
             s.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(h.containsKey(nums1[i])){
                arr[i]=h.get(nums1[i]);
            }else{
                arr[i]=-1;
            }
        }
        return arr;
    }
}