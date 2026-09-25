class smallLarge {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 7, 8, 11, 13};

        int sPrime = Integer.MAX_VALUE;
        int LPrime = Integer.MIN_VALUE;
        boolean foundPrime = false;

        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            boolean isPrime = true;

            // Check if num is prime
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // If it is prime, update smallest and greatest
            if (isPrime) {
                foundPrime = true;
                
                if (num < sPrime) {
                    sPrime = num;
                }
                
                if (num > LPrime) {
                    LPrime = num;
                }
            }
        }

        // Print results
        if (foundPrime) {
            System.out.println("Smallest prime number: " + sPrime);
            System.out.println("Greatest prime number: " + LPrime);
        } else {
            System.out.println("No prime numbers found in the array.");
        }
    }
}