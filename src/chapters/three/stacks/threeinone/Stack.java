package chapters.three.stacks.threeinone;

// Describe how you could use a single array to implement three stacks
public class Stack<T> {
    Object[] array;
    int capacity1 = 0;
    int capacity2 = 0;
    int capacity3 = 0;
    int size1;
    int size2;
    int size3;
    int index1;
    int index2;
    int index3;

    public Stack(int capacity1, int capacity2, int capacity3) {
        array = new Object[capacity1 + capacity2 + capacity3];
        this.capacity1 = capacity1;
        this.capacity2 = capacity2;
        this.capacity3 = capacity3;
        size1 = 0;
        size2 = 0;
        size3 = 0;
        index1 = 0;
        index2 = capacity1;
        index3 = capacity1 + capacity2;
    }

    public void push(T val1, T val2, T val3) {
        pushS1(val1);
        pushS2(val2);
        pushS3(val3);

    }

    public void pushS1(T val) {
        array[index1] = val;
        size1++;
        index1++;

    }

    public void pushS2(T val) {
        array[index2] = val;
        size2++;
        index2++;
    }

    public void pushS3(T val) {
        array[index3] = val;
        size3++;
        index3++;
    }

    public T popS1() {
        array[index1] = null;
        size1--;
        index1--;
        return (T) array[index1];
    }

    public T popS2() {
        array[index2] = null;
        size2--;
        index2--;
        return (T) array[index2];
    }

    @SuppressWarnings("unchecked")
    public T popS3() {
        array[index3] = null;
        size3--;
        index3--;
        return (T) array[index3];
    }

    // Needs formal type parameter <T> for static method
    public static <T> void print(T val) {
        System.out.println(val);
    }

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
