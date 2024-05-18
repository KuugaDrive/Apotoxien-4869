public class F {
  public static void main(String[]args){
    try{
      throw new J();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
class J extends Exception
{
  J()
  {
  }
  public String toString()
{return "object dengan tipe kelas J";

}
}
