
import java.util.ArrayList;

class sample5{
    static void side(ArrayList l2){
        for(int i=0;i<l2.size();i++){
            int side=(int)l2.get(i);
            int res=side*4;
            System.err.println("The square of the each num "+ side + " is " +res);
        }
    }
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        side(l1);
    }
}