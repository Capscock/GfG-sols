class Solution {
    // Method to print an array
    public void printArr(int n, int arr[]) {
        // Loop through the array and print each element
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // Print a newline character after printing the array
        System.out.println();
    }

    // Method to set all elements of the array to zero
    public void setToZero(int n, int arr[]) {
        // Loop through the array and set each element to zero
        for(int i = 0; i < n; i++) {
            arr[i] = 0;
        }
    }

    // Method to perform XOR operation with index on each element of the array
    public void xor1ToN(int n, int arr[]) {
        // Loop through the array
        for(int i = 0; i < n; i++) {
            // Perform XOR operation with the index and assign the result to the element
            arr[i] ^= i;
        }
    }
}
