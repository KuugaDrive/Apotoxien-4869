package Praktikum;

public class DemoTanpaThis {
  String Nama;
  int id;

  void setSiswa(int ID, String nama){
    id=ID;
    Nama=nama;
  } 
  void tampil(){
    System.out.println("ID : "+id);
    System.out.println("Nama : "+ Nama);
  }
  public static void main(String[] args) {
    DemoTanpaThis demoThis= new DemoTanpaThis();

    demoThis.setSiswa(1, "Ucup");
    demoThis.tampil();
  }
}
