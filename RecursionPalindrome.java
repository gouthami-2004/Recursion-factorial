class RecursionPalindrome{
    static boolean ispalindrome(String S,int start,int end){
        if(start>=end){ // base case
        return true;
        }
        if(S.charAt(start)!=S.charAt(end)){
            return false;
        }
        return ispalindrome(S,start+1,end-1);//recursion call
    }
    public static void main(String[]args){
        String S="madam";
        if(ispalindrome(S,0,S.length()-1)){
            System.out.println(S+" is palindrome");
        }else{
            System.out.println(S+"is not palindrome:");
        }
    }
}