class Solution {
    public int[] rearrangeArray(int[] nums) {
        int j=0;
      ArrayList<Integer> p=new ArrayList<>();
       ArrayList<Integer> n=new ArrayList<>();
        for(int i:nums){
        if(i>=0){
            p.add(i);
            
        }
        }
      for(int i:nums){
        if(i<0){
            n.add(i);

        }
      }
        //  ArrayList<Integer> n=new ArrayList<>();/
   
      
           int []f=new int[nums.length] ;
           for(int i=0;i<p.size();i++){
            f[j]=p.get(i);j++;
             f[j]=n.get(i);j++;
           }

        return f;
        }
      }
    
