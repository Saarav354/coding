class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        int n = s.length();
        boolean isPalindrome = true;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                isPalindrome = false;
                break;

            }
            
            }
            return isPalindrome;

        }
    }