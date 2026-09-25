import java.util.Stack;
class pq2{
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.add("max");
        s1.add("lucas");
        s1.add("Hopper");
        s1.add("jane");
        s1.add("dustine");

        System.out.println(s1);
        s1.push("eleven");
        s1.push("suzzie");
        System.out.println(s1);

        s1.pop();
        System.out.println(s1);
    }
}