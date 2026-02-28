class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int result[]=  new int [nums1.length + nums2.length];
        int k =0;
         
         for(int i=0; i< nums1.length ; i++){
            result[k]= nums1[i];
            k++; 
         }

         for(int j=0; j<nums2.length ; j++){
            result[k]= nums2[j];
            k++;
         }

         Arrays.sort(result);
         int n = result.length;

         if(n%2 !=0){
           // return (n/2);
           return result[n/2];

         } else{
               double mid1 = result[ n/2];
                double mid2 = result[(n/2)-1];
                return (mid1+mid2)/2.0;
                         }
    }
}