package realxeyez.Minggu_Kesebelas;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    Scanner noor=new Scanner(System.in);

 // membuat objek bangun datar
 BangunDatar bangunDatar = new BangunDatar();
    
     // membuat objek persegi dan mengisi nilai properti
     Persegi persegi = new Persegi();
     persegi.sisi = 2;
    
     // membuat objek Lingkaran dan mengisi nilai properti
     Lingkaran lingkaran = new Lingkaran();
     lingkaran.r = noor.nextInt();
    
     // membuat objek Persegi Panjang dan mengisi nilaiproperti
     PersegiPanjang persegiPanjang= new PersegiPanjang();
     persegiPanjang.panjang = noor.nextInt();
     persegiPanjang.lebar = noor.nextInt();

     // membuat objek Segitiga dan mengisi nilai properti
     Segitiga mSegitiga = new Segitiga();
     mSegitiga.alas = noor.nextInt();
     mSegitiga.tinggi = noor.nextInt();
    
    
     // memanggil method luas dan keliling
     bangunDatar.luas();
    bangunDatar.keliling();
    
     persegi.luas();
     persegi.keliling();
    
     lingkaran.luas();
     lingkaran.keliling();
    
     persegiPanjang.luas();
     persegiPanjang.keliling();
    
     mSegitiga.luas();
     mSegitiga.keliling();
     }
}
