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

    public static boolean oldSchoolMethod(String str) {
        Set<String> set = new HashSet<>();

        for(int i=0; i<str.length(); i++) {
            if(!set.add(str.charAt(i) + "")) return false;

        }

        System.out.println(set);
        return true;
    }

    public static void main(String[] args) {

        boolean ans1 = java8StreamMethod("Helloword");
        System.out.println(ans1);
        boolean ans2 = java8StreamMethod("abcdefghijklmnopqrstuvwxyz");
        System.out.println(ans2);

        boolean ans3 = oldSchoolMethod("Helloword");
        System.out.println(ans3);
        boolean ans4 = oldSchoolMethod("abcdefghijklmnopqrstuvwxyz");
        System.out.println(ans4);

    }
}
