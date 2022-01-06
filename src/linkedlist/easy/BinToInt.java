package linkedlist.easy;

// Problem no 1: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

public class BinToInt {

    //    Definition for singly-linked list, provided by LeetCode.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //    Method 1 - Not so optimized.
    public int getDecimalValue(ListNode head) {
        StringBuilder num = new StringBuilder();
        while (head != null) {
            num.append(head.val);
            head = head.next;
        }
        return binToInt(num.toString());
    }

    private int binToInt(String num) {
        int ans = 0;
        String number = "";
        StringBuilder sb = new StringBuilder();
        for (int i = num.length() - 1; i >= 0; i--) sb.append(num.charAt(i));
        number = sb.toString();

        for (int i = 0; i < number.length(); i++) {
            int base = 2;
            base = (int) Math.pow(2, i);
            if (number.charAt(i) != '0') {
                ans += (base * Integer.parseInt(String.valueOf(number.charAt(i))));
            } else ans += 0;
        }
        return ans;
    }

    //    Method 2 - Using bits manipulation
    public int getDecimalValue2(ListNode head) {
        StringBuilder num = new StringBuilder();
        while (head != null) {
            num.append(head.val);
            head = head.next;
        }
        return binToInt(num.toString());
    }

    /**
     * It converts a binary string to decimal number.
     *
     * @param s A binary String which contains either 1 or 0.
     * @return Decimal representation of given binary string.
     */
    private int binToInt2(String s) {
        if (s.length() == 0) return 0;
        int base = 2, ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '0') {
                ans += Math.pow(base, (s.length() - i - 1));
            }
        }
        return ans;
    }
}
