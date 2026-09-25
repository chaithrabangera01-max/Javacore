
class sumeven {

    public static int add(int num) {
        int sum = 0;
        while (num != 0) {
                int rem = num % 10;
                 if (rem % 2 == 0) {
                sum = sum + rem;
                 }
                num = num / 10;
            }
           
         return sum;
    }
    public static void main(String[] args) {
        System.out.println(add(123456));
        
    }
}
