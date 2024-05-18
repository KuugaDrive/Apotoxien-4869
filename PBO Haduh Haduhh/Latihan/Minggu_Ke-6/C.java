public class C {
  public static void main(String[]args){
    try{
      int nilai=1/0;
    }catch(Exception e){
      System.out.println("Ada kesalahan yang muncul");
    }
    finally{
      System.out.println("Terima Kasih Telah Menjalankan Program");
    }
  }
}
