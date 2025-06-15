class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length + 1; // n is the total count of numbers from 1 to n (including the missing one)

        // Calculate the expected sum of numbers from 1 to n
        long expectedSum = (long) n * (n + 1) / 2;

        // Calculate the actual sum of elements in the array
        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return (int) (expectedSum - actualSum);
    }
}