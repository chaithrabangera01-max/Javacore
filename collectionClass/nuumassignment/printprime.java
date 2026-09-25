class printprime{
    public static void main(String[] args) {
        int[] a={1,2,4,5,7,8,11,13};
        for(int i=0;i<a.length;i++){
            int num=a[i];
            boolean isPrime=true;
            if(num<=1){
                isPrime=false;
            }else{
                for(int j=2;j<num;j++){
                    if(num%j==0){
                        isPrime=false;
                        break;

                    }
                }
                if(isPrime){
                    System.out.println(num);
                }
            }
        }
    }
}