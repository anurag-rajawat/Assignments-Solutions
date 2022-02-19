package easy;

import java.util.HashSet;

// https://leetcode.com/problems/unique-email-addresses/
public class UniqueEmailAddr {
    public static void main(String[] args) {
        System.out.println(numUniqueEmails(new String[]{"a@leetcode.com", "test.email+alex@leetcode.com", "test.email+alex@leetcode.com", "test.email+alex@leetcode.com", "alice.z@leetcode.com"}));
    }

    // Not so good, but satisfy the judge
    public static int numUniqueEmails(String[] emails) {
        HashSet<String> unique = new HashSet<>();
        String[] local = {};
        String[] local2 = {};
        for (String email : emails) {
            local = email.split("@");
            local2 = local[0].split("\\+");
            local[0] = local2[0].replace(".", ""); // First rule
//            unique.add((local[0]) + local2[0] + "@" + local[1]);
            unique.add(local[0] + "@" + local[1]);
        }
//        System.out.println(local[0]);
//        System.out.println(local[1]);
        System.out.println(unique);
        return unique.size();
    }
}
