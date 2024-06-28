public class StringExp {
    public static void main(String[] args) {
        char char_arr[]={'G','e','e','k','s'};
        String str = new String(char_arr);
        System.out.println("String: "+str);

        String w1= "Hello";
        String w2= w1.toLowerCase();
        System.out.println(w2);
        String w3 = w2.toUpperCase();
        System.out.println(w3);

        String s1 = "Nihal";
        String s2 = "Nih";
        System.out.println(s1.contains(s2));
        char []ch = s1.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
        String s3 = "Nihal".replace('N', 'n');
        System.out.println(s3);
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append("Java"); System.out.println(sb1);
        sb1.insert(1, "Okay"); System.out.println(sb1);
        sb1.delete(1, 3); System.out.println(sb1);
        sb1.reverse(); System.out.println(sb1);
        System.out.println(sb1.capacity());

        String a1 = "Azizar";
        System.out.println(a1.length());
        System.out.println(a1.charAt(2));
        System.out.println(a1.indexOf('z'));
        System.out.println(a1.lastIndexOf('z'));
        System.out.println(a1.substring(2));
        System.out.println(a1.startsWith("Az"));
        System.out.println(a1.endsWith("ar"));
        System.out.println(a1.equals("Azizar"));
        System.out.println(a1.equalsIgnoreCase("azizar"));
        System.out.println(a1.compareTo("Azizar"));
        System.out.println(a1.compareToIgnoreCase("azizar"));
        System.out.println(a1.concat(" Azizar"));
        System.out.println(a1.replace('z', 'Z'));
        System.out.println(a1.replaceFirst("Az", "az"));
        System.out.println(a1.replaceAll("z", "Z"));
        System.out.println(a1.trim());
        System.out.println(a1.toLowerCase());
        System.out.println(a1.toUpperCase());
    }
}
