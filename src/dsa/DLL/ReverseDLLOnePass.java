package dsa.DLL;

public class ReverseDLLOnePass {
    public static void main(String[] args) {
        int[] arr = {5, 8, 7, 1, 10, 15, 2, 7};
        DLLNode head = ConverArrtoDLL.convertToDLL(arr);
        ConverArrtoDLL.printDLL(head);
        head = reverseDLL(head);
        ConverArrtoDLL.printDLL(head);
    }

    public static DLLNode reverseDLL(DLLNode head){
        if(head == null || head.next == null) return head;
        DLLNode curr = head;
        DLLNode temp = null;
        while(curr != null){
            temp = curr.back;
            curr.back = curr.next;
            curr.next = temp;
            curr = curr.back;
        }
        return temp.back;
    }
}
