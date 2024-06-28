public class PalindromeCheck {
    public static void main(String[] args){
        String str = "madam";
        if(isPalindrome(str)){
            System.out.println("Palindrome");   
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        str= str.toLowerCase();
        int start=0; int end= str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true; }
    
    }
