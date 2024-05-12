package LinkedList;

import java.util.Objects;

public class ConvertArrToLL {

    public static Node<Integer> convertToLL(int[] arr){
        if(arr.length == 0) return null;
        Node<Integer> head = new Node<>(arr[0]);
        Node<Integer> temp = head;
        for(int i = 1; i < arr.length; i++){
            Node<Integer> node = new Node<>(arr[i]);
            temp.next = node;
            temp = node;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {9, 4, 1, 7, 8};
        Node<Integer> head = convertToLL(arr);
        printLL(head);
        searchLL(head, 12);
        searchLL(head, 8);
        System.out.println("Head of the LL is at : "+ Objects.requireNonNull(head).data);
    }

    public static void printLL(Node<Integer> head){
        int count = 0;
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
            count++;
        }
        System.out.println("\nLength of this LL is: "+count);
    }

    public static void searchLL(Node<Integer> head, int findIt){
        while(head != null){
            if(head.data == findIt){
                System.out.println(findIt + " is present in the LL.");
                return;
            }
            head = head.next;
        }
        System.out.println(findIt + " is not present in the LL.");
    }
}
