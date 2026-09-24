
import java.util.Vector;

class area1 {

    public void area(Vector v2) {
        for (int i = 0; i < v2.size(); i++) {
            int r = (int) v2.get(i);
            double pi = 3.142;
            System.out.println(pi * r * r);
        }
    }

    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        System.out.println(v1);
        area1 a1 = new area1();
        a1.area(v1);  }
}
