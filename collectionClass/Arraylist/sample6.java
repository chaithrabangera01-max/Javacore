
import java.util.ArrayList;

class sample6{
    static void doublevalue(ArrayList l2){
        for(int i=0;i<l2.size();i++){
            int num=(int)l2.get(i);
            int res=num*2;
            System.err.println("The square of the each num "+ num + " is " +res);
        }
    }
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        doublevalue(l1);
    }
}