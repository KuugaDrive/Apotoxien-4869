package Minggu_Kesebelas;
public class ContohOverloading {
  public void jumlah(int a, int b){
    System.out.println("Jumlah 2 Angka ="+ (a+b));
  }
  public void jumlah(int a, int b, int c){
    System.out.println("Jumlah 3 Angka="+ (a+b+c));
  }
  public void jumlah(double a, int b){
    System.out.println("Jumlah 2 Angka(double+int)= "+(a+b));
  }
  public void jumlah(int b, double a){
    System.out.println("Jumlah 2 Angka (int+double)="+(a+b));
  }
  
}