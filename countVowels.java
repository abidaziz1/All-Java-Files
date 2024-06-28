public class countVowels {
    public static void main(String[] args) {
        String str = "Ami Banglay Gan Gai";
        int count = 0;
        for(int i=0;i<str.length();i++){
            char c = Character.toLowerCase(str.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        {count++;}}
     System.out.println(count);}
}
