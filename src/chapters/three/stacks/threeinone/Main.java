package chapters.three.stacks.threeinone;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>(2, 4 , 4);
        intStack.push(1,2,3);
        intStack.push(2,4,6);

        Stack<String> strStack = new Stack<>(2, 4, 4);
        strStack.push("1", "2", "3");
        strStack.push("2","4","6");

        System.out.println(intStack.popS1());
        System.out.println(intStack.popS2());
        System.out.println(intStack.popS3());

        // testing static generic
        //Stack.print(5);
        //Stack.print(new String("HelloWorld"));

    }
}
