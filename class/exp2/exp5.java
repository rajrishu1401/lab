import java.util.*;

public class exp5 {
    
    public void reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;

            int j = i;
            while (i >= 0 && s.charAt(i) != ' ') i--;
            word.insert(word.length(), s.substring(i + 1, j + 1) + " ");
        }
        System.out.println(word.toString().trim());
    }

    public static void main(String[] args) {
        exp5 obj = new exp5();
        String s = "This is decent";
        System.out.println("Original: " + s);
        System.out.print("Reversed: ");
        obj.reverseWords(s);
    }
}
