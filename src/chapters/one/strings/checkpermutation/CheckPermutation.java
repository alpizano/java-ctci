package chapters.one.strings.checkpermutation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Order matters for permutation
// combination - order doesn't matter
public class CheckPermutation {
    public static boolean checkIfPermutation(String str1, String str2) {
        String[] str1Split = str1.split("");
        String[] str2Split = str2.split("");

        // convert array to List
        List<String> str1List = Arrays.asList(str1.split(""));
        List<String> str2List = Arrays.asList(str2.split(""));

        Collections.sort(str1List);
        Collections.sort(str2List);

        return str1List.equals(str2List);

    }

    public static void main(String[] args) {

        String str1 = "Permutation";
        String str2=  "Permuatino";

        boolean ans1 = checkIfPermutation("Permutation","Permutatino");
        System.out.println(ans1);
        boolean ans2 = checkIfPermutation("Dogfood","Catfood");
        System.out.println(ans2);
        boolean ans3 = checkIfPermutation("taCfood","Catfood");
        System.out.println(ans3);



    }
}
