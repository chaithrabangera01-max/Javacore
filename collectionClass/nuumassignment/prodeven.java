
class prodeven {

    public static int prod(int num) {
        int product = 1;
        while (num != 0) {
                int rem = num % 10;
                 if (rem % 2 == 0`) {
                product = product * rem;
                 }
                num = num / 10;
            }
           
         return product;
    }
    public static void main(String[] args) {
        System.out.println(prod(123456));
        
    }
}
