package dsa.LinkedList;

public class Node<T> {
    public T data;
    public Node<Integer> next;

    public Node(T data1, Node<Integer> next1) {
        this.data = data1;
        this.next = next1;
    }

    public Node(T data1) {
        this.data = data1;
        this.next = null;
    }
}
