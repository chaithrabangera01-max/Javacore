
import java.util.PriorityQueue;

class pq{
    public static void main(String[] args) {
        PriorityQueue p1=new PriorityQueue();
        p1.add(10);
        p1.add(5);
        p1.add(6);
        p1.add(12);
        p1.add(-10);
        System.out.println(p1);
        //methods

        //p1.add(2,33);this operation cannot be done
           

            p1.remove(10);
             System.out.println(p1);

             System.out.println(p1.size());
             System.out.println(p1.contains(12));
    }
}