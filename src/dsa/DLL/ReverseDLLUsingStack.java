package dsa.DLL;

import java.util.Stack;

/**
 * two pass reversal of doubly linked list using stack
 * T(n) -> O(2n)
 * S(n) -> O(n)
 */
public class ReverseDLLUsingStack {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        DLLNode head = ConverArrtoDLL.convertToDLL(arr);
        ConverArrtoDLL.printDLL(head, "no operation");
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.data);
            head = head.next;
        }
        DLLNode newHead = new DLLNode(stack.pop());
        DLLNode prev = newHead;
        while(!stack.isEmpty()){
            DLLNode node = new DLLNode(stack.pop(), null, prev);
            prev.next = node;
            prev = node;
        }
        ConverArrtoDLL.printDLL(newHead, "reverse operation");
    }
}
