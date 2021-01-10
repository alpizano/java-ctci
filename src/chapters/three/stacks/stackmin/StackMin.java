package chapters.three.stacks.stackmin;


import java.util.EmptyStackException;

// Design a stack which in addition to push and pop, has a function min
// which returns the minimum element. Push, pop, and min should all operate in O(1) time.
public class StackMin<T> {
    private Node<T> head;
    private int min;

    private static class Node<E> {
        private E val;
        private Node<E> next;

        public Node() {
        }

        public Node(E val) {
            this.val=val;
            next = null;
        }
    }

    // default constructor
    public StackMin() {
        head = null;
        min = 0;
    }

    // constructor
    public StackMin(T val) {
        head = new Node<>(val);
        min = (Integer) val;
    }

    public StackMin<T> push(T val) {
        Node<T> newNode = new Node<>(val);

        if((Integer)val < min) {
            min = (Integer) val;
        }

        newNode.next = head;
        head = newNode;

        return this;
    }

    public T pop() {
        if(head == null) {
            throw new EmptyStackException();
        }

        Node<T> temp = head;
        head = head.next;

        // Clean up deleted node
        temp.next = null;

       return temp.val;
    }

    public int min() {
        return min;
    }

    public void print() {
        for(Node<T> cursor=head; cursor != null; cursor = cursor.next) {
            System.out.print(cursor.val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackMin<Integer> stackMin = new StackMin<>();
        System.out.println(stackMin.head);
        //System.out.println(stackMin.head.val); // NPE
        //System.out.println(stackMin.head.next); // NPE

        stackMin.push(1).push(2).push(3).push(4).push(5);

        //System.out.println(stackMin.head); // chapters.three.stacks.threeinone.StackMin$Node@1b6d3586
        //System.out.println(stackMin.head.val);  // 5
        //System.out.println(stackMin.head.next.val); // 4
        stackMin.print();
        System.out.println(stackMin.pop());
        System.out.println(stackMin.pop());
        stackMin.print();

        stackMin.push(55).push(42).push(99).push(12).push(-5).push(0).push(21).push(30);
        stackMin.print();
        System.out.println(stackMin.min());


    }
}
