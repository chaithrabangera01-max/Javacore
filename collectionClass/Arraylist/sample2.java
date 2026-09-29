
import java.util.ArrayList;

class sample2{
    static void square(ArrayList l2){
        for(int i=0;i<l2.size();i++){
            int a=(int)l2.get(i);
            int res=a*a;
            System.err.println("The square of the each num "+ a + " is " +res);
        }
    }
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        square(l1);
    }
}