import java.util.Vector;

class area2{
    public void area(Vector v2){
        for(int i=0;i<v2.size();i++){
        int a=(int)v2.get(i);
        System.out.println(a*a*a);

    }

}
public static void main(String[] args) {
    Vector v1=new Vector();
    v1.add(3);
    v1.add(6);
    v1.add(9);
    v1.add(12);
    v1.add(15);
    System.out.println(v1);
    area2 a2=new area2();
    a2.area(v1);
}
}
