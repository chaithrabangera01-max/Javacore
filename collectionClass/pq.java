
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


             PriorityQueue p2=new PriorityQueue();
             p2.add(100);
             p2.add(200);
             p2.add(300);
             p2.add(400);
             p2.add(-1000);
             System.out.println(p2);

            p1.addAll(p2);
               System.out.println(p1.size());

               while(!p1.isEmpty()){
                System.out.println(p1.poll());
               }



    }
}