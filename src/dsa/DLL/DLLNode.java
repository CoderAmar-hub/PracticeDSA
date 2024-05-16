package dsa.DLL;

public class DLLNode {
    int data;
    DLLNode next;
    DLLNode back;

    DLLNode(int data, DLLNode next, DLLNode back){
        this.data = data;
        this.next = next;
        this.back = back;
    }

    DLLNode(int data){
        this(data, null, null);
    }
}
