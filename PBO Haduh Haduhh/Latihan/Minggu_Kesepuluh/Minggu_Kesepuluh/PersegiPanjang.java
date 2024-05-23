package Minggu_Kesepuluh;

public class PersegiPanjang {
  // Data Field PersegiPanjang
  double panjang=10;
  double lebar=1.0;
  // Konstruktur Pertama
  PersegiPanjang(double x){
    panjang=x;
  }
  // Konstruktur Kedua
  PersegiPanjang(double x, double y){
    panjang=x;
    lebar=y;
  }
  // Metoda mencari keliling
  double MencariKelilingPP(){
    return 2*(panjang*lebar);
  }
  // Metoda mencari luas
  double MencariLuasPP(){
    return panjang*lebar;
  }

}
