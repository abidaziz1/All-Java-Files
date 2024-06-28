public class MiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddleCharacter("hello"));
        System.out.println(getMiddleCharacter("bangladesh"));
    }
    public static String getMiddleCharacter(String str){
        if(str==null || str.isEmpty()){
            return "";
        }
        int len = str.length();
        int middle= len/2;
        if(len%2==0){
            return str.substring(middle-1, middle+1);
        }else{
            return String.valueOf(str.charAt(middle));
        }}}
