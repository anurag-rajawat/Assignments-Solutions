package linkedlist.medium;

public class LLCycle2 {

    //    Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public ListNode detectCycle(ListNode head) {
        // Find the length of cycle, if present, else return null( LeetCode ask us to do that)
        // Two Pointers to detect cycle

        ListNode slow = head;
        ListNode fast = head;

        int len = 0; // Length of cycle.
//        Detecting cycle present or not.
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
//            Cycle is present then, just find the length and come out.
            if (fast == slow) {
                len = cycleLen(head);
                break;
            }
        }

        if (len == 0) return null;

//      Finding the start of cycle
        ListNode first = head;
        ListNode second = head;

        while (len > 0) {
            second = second.next;
            len--;
        }

//        Keep moving both forward and they will meet at start of cycle
        while (first != second) {
            first = first.next;
            second = second.next;
        }
        return second;
    }

    //   Finding the length of cycle
    private int cycleLen(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode trav = slow;
                int len=0;
                do {
                    trav = trav.next;
                    len++;
                } while (trav != slow);
                return len;
            }
        }
        return 0;
    }
}