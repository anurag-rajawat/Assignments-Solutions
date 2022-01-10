package searching.hard;

// Problem 6: https://leetcode.com/problems/find-in-mountain-array/


// This is mountainArrayay's API interface.
// You should not implement it, or speculate about its implementation
interface MountainArray {
    int get(int index);

    int length();
}

public class MountainArr {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = getPeakIndex(mountainArr);
        int ans = index(mountainArr, target, 0, peak);
        if (ans != -1) {
            return ans;
        }
        return index(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    private int index(MountainArray array, int target, int start, int end) {
        // If array is in ascending order
        if (array.get(start) < array.get(end)) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (array.get(mid) == target) return mid;
                else if (array.get(mid) < target) start = mid + 1;
                else end = mid - 1;
            }
        } else {
            // If array is in descending order
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (array.get(mid) == target) return mid;
                else if (array.get(mid) < target) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }

    // This is just same as previous get peak element in mountain array
    public int getPeakIndex(MountainArray array) {
        int start = 0;
        int end = array.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            // This check means that we're in the ascending part of the array, that's why we've to check next element
            if (array.get(mid) < array.get(mid + 1)) {
                start = mid + 1;
            } else {
                // This check means that we're in the descending part of the array, that's why we've to check previous element
                end = mid;
            }
        }
        // At this point, start and end both are same, i.e., we can return any of these.
        return start;
    }

}
