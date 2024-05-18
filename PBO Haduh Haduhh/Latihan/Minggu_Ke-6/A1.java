import java.lang.reflect.Array;

public class A1 {
  public static void dmain(String[]args){
    try{
      f();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }public static void f() throws NullPointerException, ArrayIndexOutOfBoundsException{
    throw new ArrayIndexOutOfBoundsException();
  }
}
