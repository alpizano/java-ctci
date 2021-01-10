package chapters.three.stacks.stackmin;


import java.util.EmptyStackException;

// Design a stack which in addition to push and pop, has a function min
// which returns the minimum element. Push, pop, and min should all operate in O(1) time.
public class StackMin<T> {
    Node<T> head;

    static class Node<E> {
        E val;
        Node<E> next;

        public Node() {
        }

        public Node(E val) {
            this.val=val;
            next = null;
        }
    }

    public StackMin() {
        head = null;
    }

    public StackMin(T val) {
        head = new Node<>(val);
    }

    public StackMin<T> push(T val) {
        Node<T> newNode = new Node<>(val);

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
    }
}
