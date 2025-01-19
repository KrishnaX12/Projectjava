import java.lang.*;
public class Main {
    public static void main(String[] args) {
        String spacey = "           Spacey            ";
        String a1=new String("KRishna");
        String b1=new String ("KRishna");
        String c1= (a1==b1)?"Same":"Not same";
        System.out.println(c1);
        String c2= (a1.equals(b1))?"Same":"Not same";
        System.out.println(c2);
        String a2="KRishna";
        String b2="KRishna";
        String c3= (a2==b2)?"Same":"Not same";
        System.out.println(c3);
        String c4= (a2.equals(b2))?"Same":"Not same";
        System.out.println(c4);
        System.out.println(a1.equals(b2)?"Same":"Not same");
        System.out.println((a1==b2)?"Same":"Not same"); // String ( pool X heap ) & ( .equals() Vs == )
        String str = "www.krishna.com";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(spacey.trim());
        System.out.println(str.substring(12));
        System.out.println(str.substring(12,15));
        System.out.println(str.replace('w','x'));
        System.out.println((str.startsWith("www"))?"True":"False");
        System.out.println((str.endsWith("com"))?"True":"False");
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf('.'));
        System.out.println(str.indexOf('.',4,9)); // search from left to right
        System.out.println(str.lastIndexOf('.'));
        System.out.println(str.lastIndexOf('.',4)); // search from right to left
        String s1 = "python";
        String s2 = "PYTHON";
        String s3 = "C++";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2)); // return unicode value of s1[0] - s2[1]
        System.out.println(s1.compareToIgnoreCase(s3)); // same but if s1 = 'a' & s2 = 'A' then return 0;
        System.out.println(s1.contains("Pyth"));
        System.out.println(String.valueOf(3.14159265359)); // any type of data to string
        System.out.println(("&").matches("."));
        System.out.println(("a").matches("[abcd]"));
        System.out.println(("ab").matches("[abcd]")); //Not like this
        System.out.println(("a77").matches("[a-z][0-9][0-9]")); //Like this
        System.out.println(("y").matches("[a-z0-9A-Z]"));
        System.out.println(("a").matches("A|B"));
        System.out.println(("abcd").matches("abcd"));
        System.out.println(("6").matches("\\d")); // 0-9
        System.out.println(("6").matches("\\D")); // true if(not(0-9))
        System.out.println((" ").matches("\\s")); // true string = one space
        System.out.println(("d").matches("\\S")); // true string = one char
        System.out.println(("&").matches("\\w")); // true string = one char or one digit
        System.out.println(("324ccc").matches("\\W")); // true if the entire string contains only one single non-word character. alsotrue for space
        System.out.println(("a").matches("[^a-z]"));
        //                          Quantifiers
        System.out.println("#@D FS44".matches(".*")); // 0 or more times
        System.out.println("abDGSSGGSksjbkvu".matches("[a-zA-z]*")); // 0 or more time
        System.out.println("abcabc".matches("[ab]*")); // 0 or more times of ab
        System.out.println("Pewds".matches("[ab]+")); // 1 or more times of ab
        System.out.println("ababa".matches("[ab]{5}")); // the letter can be a or b or c but exactly 5 char
        System.out.println("ababababa".matches("[ab]{5,10}")); // the letter can be a or b or c but exactly between ( 5 - 10 ) char
        System.out.println("Pewds@gmail.com".matches(".*@.*")); // anything b4 @ any times and anything after @ any times
        System.out.println("Pewds@gmail.com".matches("[a-z0-9A-Z]*@[a-zA-z]*.[a-zA-z]*")); // anything b4 @ any times and anything after @ any times
    }
}