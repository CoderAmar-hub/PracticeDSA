package dsa.DLL;

public class DeleteNode {
    public static void main(String[] args) {
        int[] arr = {5, 8, 7, 1, 10, 15, 2, 7};
        DLLNode head = ConverArrtoDLL.convertToDLL(arr);
        ConverArrtoDLL.printDLL(head);
        head = deleteHeadNode(head);
        ConverArrtoDLL.printDLL(head, "deleting head node");
        head = deleteTailNode(head);
        ConverArrtoDLL.printDLL(head, "deleting tail node");
        head = removeKthNode(head, 3);
        ConverArrtoDLL.printDLL(head);
        deleteNode(head.next.next.next.next.next);
        ConverArrtoDLL.printDLL(head);
    }

    public static DLLNode deleteHeadNode(DLLNode head){
        DLLNode prev;
        if(head != null){
            prev = head;
            head = head.next;
            head.back = null;
            prev.next = null;
        }
        return head;
    }

    public static DLLNode deleteTailNode(DLLNode head){
        if(head == null) return head;
        DLLNode headNode = head;
        while(head.next != null){
            head = head.next;
        }
        DLLNode newTail = head.back;
        head.back = null;
        newTail.next = null;
        return headNode;
    }

    public static DLLNode removeKthNode(DLLNode head, int k){
        int count = 0;
        DLLNode temp = head;
        while(temp != null){
            count++;
            if(count == k){
                break;
            }
            temp = temp.next;
        }
        DLLNode prevNode = temp.back;
        DLLNode fwdNode = temp.next;
        if(prevNode == null && fwdNode == null)
            return null;
        else if(prevNode == null)
            return deleteHeadNode(temp);
        else if(fwdNode == null)
            return deleteTailNode(head);
        prevNode.next = fwdNode;
        fwdNode.back = prevNode;
        temp.next = null;
        temp.back = null;
        return head;
    }

    /**
     * This method will never be sought to delete the headNode.
     * @param node
     */
    public static void deleteNode(DLLNode node){
        if(node == null) return;
        DLLNode prevNode = node.back;
        DLLNode fwdNode = node.next;
        if(fwdNode == null){
            deleteTailNode(node);
            return;
        }
        prevNode.next = fwdNode;
        fwdNode.back = prevNode;
        node.next = node.back = null;
        return;
    }
}
