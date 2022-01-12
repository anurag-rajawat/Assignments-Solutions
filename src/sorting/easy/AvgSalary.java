package sorting.easy;

import java.util.Arrays;

// Problem 23:https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class AvgSalary {
    // Pretty straight forward, no need to explain
    public double average(int[] salary) {
        double avgSalary;
        double totalSalary = 0;

        Arrays.sort(salary);

        for (int i = 1; i < salary.length - 1; i++) {
            totalSalary += salary[i];
        }
        avgSalary = totalSalary / (salary.length - 2);
        return avgSalary;
    }
}