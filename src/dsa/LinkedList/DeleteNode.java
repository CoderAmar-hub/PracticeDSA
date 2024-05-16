package dsa.LinkedList;

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

    /**
     * Definition for singly-linked list.
     * public class Node<Integer> {
     *     int val;
     *     Node<Integer> next;
     *     Node<Integer>() {}
     *     Node<Integer>(int val) { this.val = val; }
     *     Node<Integer>(int val, Node<Integer> next) { this.val = val; this.next = next; }
     * }
     */

    public static class AddTwoNum {
        public static Node<Integer> addTwoNumbers(Node<Integer> l1, Node<Integer> l2) {
            Node<Integer> dummyNode = new Node<Integer>(-1);
            Node<Integer> temp = dummyNode;
            int carry = 0, sum = 0;
            while(l1 != null || l2 != null){
                sum = carry;
                if(l1 != null){
                    sum += l1.data;
                    l1 = l1.next;
                }
                if(l2 != null){
                    sum += l2.data;
                    l2 = l2.next;
                }
                Node<Integer> node = new Node<Integer>(sum%10, null);
                carry = sum/10;
                temp.next = node;
                temp = temp.next;
            }
            if(carry > 0){
                Node<Integer> node = new Node<Integer>(carry, null);
                temp.next = node;
                temp = temp.next;
            }
            return dummyNode.next;
        }

        public static void main(String[] args) {
            int[] arr1 = {5, 9, 7};
            int[] arr2 = {6, 8, 21};
            Node<Integer> list1 = ConvertArrToLL.convertToLL(arr1);
            Node<Integer> list2 = ConvertArrToLL.convertToLL(arr2);
            Node<Integer> head = addTwoNumbers(list1, list2);
            ConvertArrToLL.printLL(head);
        }
    }
}
