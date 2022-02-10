package easy;

// Problem 1: https://leetcode.com/problems/happy-number/
public class HappyNum {
    // This question uses fast and slow pointer approach of linked-list concepts under the hood.
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;

        do{
            slow=square(slow);
            fast=square(square(fast));
        }while(slow != fast);

        return slow == 1;
    }

    private int square(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans+=(rem*rem);
            num/=10;
        }
        return ans;
    }
}
