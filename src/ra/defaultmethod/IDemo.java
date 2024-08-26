package ra.defaultmethod;

public interface IDemo {
//    public void hello();

    default void hello(){
        System.out.println("Xin chao ");
    }
}
