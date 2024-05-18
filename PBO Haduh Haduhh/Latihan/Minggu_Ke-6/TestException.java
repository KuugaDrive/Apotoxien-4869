public class TestException {
  public static void main(String[]args){
    try{
      int  nilai=10;
      System.out.println(nilai/0);
    }
    catch(Exception hmmmmm){
      System.out.println(hmmmmm.getMessage());
    }
  }
}
