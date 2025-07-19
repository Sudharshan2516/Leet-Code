class Solution {
    public int findLucky(int[] arr) {
       int n = arr.length;
       Map <Integer, Integer> M = new HashMap<>();
       int Luck = -1;
       for(int i = 0; i < n; i++){
        M.put(arr[i], M.getOrDefault(arr[i],0)+1);
       }
       for(Map.Entry<Integer, Integer> I : M.entrySet()){
        int ele = I.getKey();
        int fre = I.getValue();

         if(ele == fre){
        Luck = Math.max(Luck, ele);
       }
      
       }
      
return Luck;
    }
}