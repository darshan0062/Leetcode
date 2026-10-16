class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int num:nums){
            if(h.containsKey(num)){
                h.put(num,h.get(num)+1);
            }
            else{
                h.put(num,1);
            }
        }
          int[]arr=new int[k];
        for(int i=0;i<k;i++){
       int max = Collections.max(h.values());
       for(int key:h.keySet()){
        if(h.get(key)==max){
            arr[i]=key;
            h.remove(key);
            break;
        }
       }


    }
    return arr;
}
}