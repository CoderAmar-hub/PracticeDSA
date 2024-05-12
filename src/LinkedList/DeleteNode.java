package LinkedList;

public class DeleteNode {
    public static void main(String[] args) {
        int[] arr = {9, 1, 5, 2, 8, 12, 6};
        Node<Integer> head = ConvertArrToLL.convertToLL(arr);
        head = removeHead(head);
        ConvertArrToLL.printLL(head);
        head = removeTail(head);
        ConvertArrToLL.printLL(head);
        head = removeK(head, 3);
        ConvertArrToLL.printLL(head);
        head = removeK(head, 4);
        ConvertArrToLL.printLL(head);
        head = removeElem(head, 5);
        ConvertArrToLL.printLL(head);
        head = removeElem(head, 9);
        ConvertArrToLL.printLL(head);
    }

    public static Node<Integer> removeHead(Node<Integer> head){
        if(head == null) return null;
        head = head.next;
        return head;
    }

    public static Node<Integer> removeTail(Node<Integer> head){
        Node<Integer> node = head;
        if(head == null || head.next == null) return null;
        while(head.next.next != null){
            head = head.next;
        }
        head.next = null;
        return node;
    }

    public static Node<Integer> removeK(Node<Integer> head, int k){
        if(head == null) return null;
        if(k == 1){
            return head.next;
        }
        Node<Integer> node = head;
        Node<Integer> prev = null;
        int count = 0;
        while(node != null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = node;
            node = node.next;
        }
        return head;
    }

    public static Node<Integer> removeElem(Node<Integer> head, int k){
        if(head == null) return null;
        if(head.data == k){
            return head.next;
        }
        Node<Integer> node = head;
        Node<Integer> prev = null;
        int count = 0;
        while(node != null){
            count++;
            if(node.data == k){
                prev.next = prev.next.next;
                break;
            }
            prev = node;
            node = node.next;
        }
        return head;
    }
}
