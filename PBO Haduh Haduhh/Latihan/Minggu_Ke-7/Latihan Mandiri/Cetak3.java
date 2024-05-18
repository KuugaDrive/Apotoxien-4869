public class Cetak3 {
  int no;
  String nama;

  void Cetak(int no, String nama){
    this.no=no;
    this.nama=nama;

  }
  void tampil(){
    System.out.println(no+" , "+nama);
  }
  public static void main(String[]okedroid){
    Cetak c1=new Cetak(43, "Faturrahman");
    c1.tampil();
  }
}
