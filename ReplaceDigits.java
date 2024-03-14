import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceDigits {
    public static String replaceAllDigits(String s){
        List<Character> temp = Arrays.asList('a','b','c','d','e','f','g',
                'h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

        char[] input = s.toCharArray();
        for(int i=1; i<s.length(); i=i+2){
            char ch = input[i-1];
            int index = temp.indexOf(ch) + Character.getNumericValue(input[i]);
            input[i] = temp.get(index);
        }

        System.out.println(Arrays.toString(input));
        String out = new String(input);
        return out;
    }

    public static void main(String[] args) {
        replaceAllDigits("a1b2c3d4e");
    }
}
