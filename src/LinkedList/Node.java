package LinkedList;

class Node<T> {
    T data;
    Node<Integer> next;

    Node(T data1, Node<Integer> next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(T data1) {
        this.data = data1;
        this.next = null;
    }
}
