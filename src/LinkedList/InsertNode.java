package LinkedList;

public class InsertNode {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 2, 6, 1, 5, 12, 10};
        Node<Integer> head = ConvertArrToLL.convertToLL(arr);
        ConvertArrToLL.printLL(head);
        head = insertHead(head, 19);
        ConvertArrToLL.printLL(head);
        head = insertTail(head, 27);
        ConvertArrToLL.printLL(head);
        head = insertAtPosition(head, 36, 10);
        ConvertArrToLL.printLL(head);
    }

    public static Node<Integer> insertHead(Node<Integer> head, int data){
        return new Node<Integer>(data, head);
    }

    public static Node<Integer> insertTail(Node<Integer> head, int data){
        if(head == null) return new Node<Integer>(data);
        Node<Integer> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node<Integer>(data);
        return head;
    }

    public static Node<Integer> insertAtPosition(Node<Integer> head, int data, int pos){
        if(head == null) {
            if(pos == 1)
                return new Node<>(data);
        }
        if(pos == 1){
            return new Node<Integer>(data, head);
        }
        int count = 0;
        Node<Integer> temp = head;
        while(temp.next != null){
            temp = temp.next;
            count++;
            if(count == pos-1){
                Node<Integer> newNode = new Node<Integer>(data, temp.next);
                temp.next = newNode;
            }
        }
        return head;
    }
}
