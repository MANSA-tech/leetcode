class Solution {
    public int trap(int[] height) {
        int n= height.length;

        int LeftMax []= new int[n];
        LeftMax[0]= height[0];
        for(int i =1 ; i<n ; i++){
            LeftMax[i] = Math.max(height[i],LeftMax[i-1]);
        }

        int RightMax[]= new int[n];
        RightMax[n-1] = height[n-1];
        for(int i=n-2 ; i>=0 ; i--){ //...........................................
            RightMax[i]= Math.max(height[i],RightMax[i+1]);
        }
        
        int trap =0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(LeftMax[i],RightMax[i]);
            trap += waterLevel - height[i];
        }
        return trap;
    }
}