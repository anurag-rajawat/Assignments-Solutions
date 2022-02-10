package easy;

// Problem 1: https://leetcode.com/problems/defanging-an-ip-address/
public class DefangingIPAddr {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
