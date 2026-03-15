class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n= blocks.length();
        int current=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W')
            current++;
        }
            int min=current;
        
        for(int i=1;i<=n-k;i++){
            if(blocks.charAt(i-1)=='W'){
            current--;
            }
             if(blocks.charAt(i+k-1)=='W'){
            current++;
        }
        if(current<min)
        min= current;
        }
        return min;
    }
}