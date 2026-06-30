// Java program to implement
// the above approach

class Prog1 {

    // Function to find the sum
    static long sumOfSumSeries(int N)
    {

        long sum = 0L;

        // Calculate sum-series
        // for every natural number
        // and add them
        for (int i = 1; i <= N; i++) {
            sum = sum + (i * (i + 1)) / 2;
        }

        System.out.println(sum);
        return sum;
    }

    // Driver code
    public static void main(String[] args)
    {
        int N = 5;
        System.out.println(sumOfSumSeries(N));
    }
}