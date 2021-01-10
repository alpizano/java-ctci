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

    public void push(int val1, int val2, int val3) {
        pushS1(val1);
        pushS2(val2);
        pushS3(val3);

    }

    public void pushS1(int val) {
        array[index1] = val;
        size1++;
        index1++;

    }

    public void pushS2(int val) {
        array[index2] = val;
        size2++;
        index2++;
    }

    public void pushS3(int val) {
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

    public T popS3() {
        array[index3] = null;
        size3--;
        index3--;
        return (T) array[index3];
    }



}
