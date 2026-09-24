
import java.util.Vector;

class area6 {

    public void area(Vector<Integer> v2) {
        for (int i = 0; i < v2.size(); i++) {
            int l = v2.get(i);
            int b = v2.get(i+1);
            System.out.println(2*l*b); 
            
        }
    }

    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        System.out.println(v1);
        area6 a4 = new area6();
        a4.area(v1);  }
}
