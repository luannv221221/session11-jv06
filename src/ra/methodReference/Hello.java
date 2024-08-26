package ra.methodReference;

public class Hello implements SayHello{

    public Hello(String string) {

    }

    @Override
    public void display(String say) {
        System.out.println(say);
    }
}
