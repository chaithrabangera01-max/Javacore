
import java.util.ArrayList;

class sample1{
    static void area(ArrayList l2){
        for(int i=0;i<l2.size();i++){
            int r=(int)l2.get(i);
            final double pi=3.14;
            double res=pi*r*r;
            System.out.println("The radius of the " +r+" is "+res);
        }
    }
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        area(l1);
    }
}