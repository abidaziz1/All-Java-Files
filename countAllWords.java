public class countAllWords {
    public static void main(String[] args) {
        String str = "this is an example string to count words.";
        int wordCount = countWords(str);
        System.out.println(wordCount);
    }
    public static int countWords(String str){
        String[] words = str.trim().split("\\s+"); //splits the string based on one or more whitespace characters (\\s+). This regular expression ensures that multiple spaces between words do not result in empty tokens.
        return words.length;//The split method returns an array of words, and words.length gives the number of words in the array.
    }
}
