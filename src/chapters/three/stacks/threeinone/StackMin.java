package chapters.three.stacks.threeinone;


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

    public void print() {
        for(Node<T> cursor=head; cursor != null; cursor = cursor.next) {
            System.out.print(cursor.val + " ");
        }
    }

    public static void main(String[] args) {
        StackMin<Integer> stackMin = new StackMin<>();
        stackMin.push(1).push(2).push(3).push(4).push(5);
        stackMin.print();
    }
}
