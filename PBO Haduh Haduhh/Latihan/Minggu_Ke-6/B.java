public class B {
  public static void main(String[]args){
    try{
      int nilai=1/0;
      System.out.println("perintah selanjutnya");
    }catch(NullPointerException e){
    }
    catch(ArrayIndexOutOfBoundsException e){
    }
    catch(Exception e){
    }
  }
}
