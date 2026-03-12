class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.trim().split("\\s+"); // ek he br s likhte h br br s. s. nhi
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1 ;i>=0; i--){

            if(words[i].isEmpty()) continue;
            if(sb.length()>0) sb.append(" ");

            sb.append(words[i]);
        }
         return sb.toString();
            }
}