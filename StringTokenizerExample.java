import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String str = "Hello,World,Java";
        StringTokenizer tokenizer = new StringTokenizer(str, ",");
        int tokenCount = tokenizer.countTokens();
        System.out.println("Token count: " + tokenCount);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}