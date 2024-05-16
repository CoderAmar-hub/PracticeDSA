package dsa.DLL;

public class ConverArrtoDLL {
    public static void main(String[] args) {
        int[] arr = {5, 8, 7, 1, 10, 15, 2, 7};
        DLLNode head = convertToDLL(arr);
        printDLL(head);
        printDLLReverse(head);
    }

    public static DLLNode convertToDLL(int[] arr){
        DLLNode head = new DLLNode(arr[0]);
        DLLNode prev = head;
        for(int i = 1; i < arr.length; i++){
            DLLNode temp = new DLLNode(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void printDLL(DLLNode head){
        printDLL(head, "");
    }
    public static void printDLL(DLLNode head, String s){
        System.out.println("\nThe DLL nodes after " + s + " are: ");
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void printDLLReverse(DLLNode head){
        DLLNode temp = null;
        while(head != null){
            temp = head;
            head = head.next;
        }
        System.out.println("");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.back;
        }
    }
}
