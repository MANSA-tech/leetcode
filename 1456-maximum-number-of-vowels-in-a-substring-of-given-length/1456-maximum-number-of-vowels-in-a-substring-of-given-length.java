class Solution {
    public int maxVowels(String s, int k) {
        int current=0;
        int max=0;
        for(int i=0;i<k;i++){ // bhai yha mistake ho rhi h br br k tk chlega loop na ki length tk r mansa babyyyyyyyy
            if(isvowel(s.charAt(i))) current++;
            max=current;
        }
        for(int i=1;i<=s.length()-k;i++){// last window ko v include krna h isl = lagaoo

         // old char agar vowel tha to minus karo
            if (isvowel(s.charAt(i - 1))) {
                current--;
            }

            // new char agar vowel hai to add karo
            if (isvowel(s.charAt(i + k - 1))) {
                current++;
            }

           
            if(current> max) max=current;
        }
        return max;

        /*Sliding window me karna hota hai:

old char agar vowel tha → current--

new char agar vowel hai → current++
*/
        
    }
    public boolean isvowel(char ch){
        return  ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}