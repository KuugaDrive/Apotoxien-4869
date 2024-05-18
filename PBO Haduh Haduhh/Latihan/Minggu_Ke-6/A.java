/**
 * TestException3
 */
public class A {

  public static void main(String[]args){
    try{
      int nilai=1/0;
      System.out.println("Perintah Selanjutnya");
    }catch(Exception kesalahan){
      System.err.println("Kesalahan");
    }
  }
}