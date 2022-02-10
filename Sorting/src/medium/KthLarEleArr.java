package medium;

public class KthLarEleArr {

    // I'm sorting the array by using quick sort, but you can definitely use builtin sort function
    // I'm using it just to check the runtime of my program using quicksort, and it gives better than builtin sort
    // method, in my case.

    public int findKthLargest(int[] nums, int k) {
        quickSort(nums,0,nums.length-1);
        return nums[nums.length-k];
    }

    private void quickSort(int[]a,int low,int high)
    {
        if (low >= high) // Base Condition
            return;


        int start=low,end=high;
        int mid=start+((end-start)/2);
        int pivot=a[mid];

        while(start<=end)
        {
            while(a[start]<pivot) start++;

            while(a[end]>pivot) end--;

            if(start<=end)
            {
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
        }

        quickSort(a,low,end);
        quickSort(a,start,high);
    }
}
