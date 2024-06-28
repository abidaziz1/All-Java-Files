public class VowelChecker {
    public static boolean areAllVowels(String str) {
        str = str.toLowerCase();
        String vowels = "aeiou";
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) == -1) {
                return false;
            }
        }
        return true; }
    public static void main(String[] args) {
        System.out.println(areAllVowels("aeiou"));
        System.out.println(areAllVowels("AeIou"));
        System.out.println(areAllVowels("aeiouAEIOU"));
        System.out.println(areAllVowels("hello"));
        System.out.println(areAllVowels("aeioub"));
    }}
