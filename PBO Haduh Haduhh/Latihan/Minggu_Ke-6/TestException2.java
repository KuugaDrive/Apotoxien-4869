public class TestException2 {
  public static void main(String[]args){
  try{
    System.out.println(args[1]);
  }catch(ArrayIndexOutOfBoundsException ex){
    System.out.println("Data pada array tidak ditemukan");
  }
}
}
