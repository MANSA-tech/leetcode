import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String strs1 = strs[0];
        String strs2 = strs[strs.length-1]; // Lekin arrays me length method [length()] nahi hota, balki length property hoti hai.
        int index=0;
        while(index < strs1.length() && index < strs2.length()){
            if(strs1.charAt(index)== strs2.charAt(index)){
                index++;
            } else{
                break;
            }
        }
        if(index == 0){
            return "";
        }
          return strs1.substring(0, index);
        
    }
}
