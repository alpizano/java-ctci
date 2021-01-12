package chapters.one.strings.isunique;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class isUnique {
    public static boolean java8StreamMethod(String str) {
        String result = Arrays.stream(str.split(""))
                .distinct()
                .collect(Collectors.joining());

        return result.length() == str.length();
    }

    public static void main(String[] args) {

        boolean ans1 = java8StreamMethod("Helloword");
        System.out.println(ans1);
        boolean ans2 = java8StreamMethod("abcdefghijklmnopqrstuvwxyz");
        System.out.println(ans2);

    }
}
