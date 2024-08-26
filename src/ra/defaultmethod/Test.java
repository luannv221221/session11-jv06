package ra.defaultmethod;

public class Test {
    public static void main(String[] args) {
        IDemo iDemo = new Demo1();
        iDemo.hello();

        IDemo iDemo1 = new Demo2();
        iDemo1.hello();
    }
}
