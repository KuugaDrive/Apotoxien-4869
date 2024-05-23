public class Naga extends Hewan {
  public void setName(){
      System.out.println("Nama Hewan Adalah \"Naga\"\n");
  }public void setMakanan(){
      System.out.println("Makanan Naga Adalah \"Batagor\"\n");
  }public void setWarna(){
      System.out.println("Warna Naga \"Merah\"\n");
  }
  public static void main(String[]args){
      Naga n= new Naga();
      n.setName();
      n.setMakanan();
      n.setWarna();
  }
}