package ra.lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        IFunctionInterface iFunctionInterface = new IFunctionInterface() {
            @Override
            public void hello() {
                System.out.println("Hello");
            }
        };
        iFunctionInterface.hello();
        IFunctionInterface iFunctionInterface1 = ()->System.out.println("Xin chao");
        iFunctionInterface1.hello();
        // lam co tham so
        IFunctionInterface2 iFunctionInterface2 = (a,b)->a+b;
        System.out.println(iFunctionInterface2.addTwoNumber(10,10));
    }
}
