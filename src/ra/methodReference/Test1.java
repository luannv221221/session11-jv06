package ra.methodReference;



public class Test1 {
    public static int action(int a,int b,ExecuteFunction executeFunction){
      return executeFunction.execute(a,b);
    }
    public static void main(String[] args) {
        IFunctionalInterface iFunctionalInterface = Integer::sum;
        int sum = action(30,70,MathUt::sum);
        System.out.println("Tong la "+sum);
    }
}
