package medium;

import java.util.HashMap;

// https://leetcode.com/problems/copy-list-with-random-pointer/
public class CopyListRandPtr {

    // Definition for a Node.
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        HashMap<Node, Node> oldToCopy = new HashMap<>();
        oldToCopy.put(null, null); // if curr.next is null then in that case our map will return null

        Node curr = head;
        while (curr != null) {
            Node copiedNode = new Node(curr.val);
            oldToCopy.put(curr, copiedNode);
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            Node copy = oldToCopy.get(curr);
            copy.next = oldToCopy.get(curr.next);
            copy.random = oldToCopy.get(curr.random);
            curr = curr.next;
        }
        return oldToCopy.get(head);
    }

}
