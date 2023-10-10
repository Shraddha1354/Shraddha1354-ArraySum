public class ArraySum {
    /**
     * This method should return the sum of all ints in an array - this is a very useful trick to know!
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints
     * @return the sum of all values in arr.
     */
    public int sum(int[] arr) {
        // Initialize a variable to store the sum
        int sum = 0;

        // Iterate through the elements of the array
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the sum
            sum += arr[i];
        }

        // Return the calculated sum
        return sum;
    }
}
