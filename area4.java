
import java.util.Vector;

class area4 {

    public void area(Vector v2) {
        for (int i = 0; i < v2.size(); i++) {
            int r = (int) v2.get(i);
            System.out.println(r+r); //adding the same vector
            
        }
    }

    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        System.out.println(v1);
        area4 a1 = new area4();
        a1.area(v1);  }
}
