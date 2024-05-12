package LinkedList;

public class LinkedList {

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 6, 7};

        Node<Integer> node = new Node<>(arr[0]);
        System.out.println(node.data);
    }
}
