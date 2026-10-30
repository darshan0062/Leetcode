class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap <Integer,Integer >h = new  HashMap <>();
        Stack<Integer>s = new Stack<>();
        for(int i =0;i<nums2.length;i++){
            if(s.isEmpty()){
                s.push(nums2[i]);
            }
            
            else{
             while(!s.isEmpty()&& nums2[i]>s.peek()){

             
                int d=s.pop();
                h.put(d,nums2[i]);
             }
             s.push(nums2[i]);
            }
        }
                
            
            int[] ans= new int[nums1.length];
            for(int j=0;j<nums1.length;j++){
             if(h.containsKey(nums1[j])){
                ans[j]=h.get(nums1[j]);
             }else{
                ans[j]=-1;
             }
            }
            return ans;
        }
    }
