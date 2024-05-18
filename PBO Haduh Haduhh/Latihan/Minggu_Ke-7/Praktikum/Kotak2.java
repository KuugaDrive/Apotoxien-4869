package Praktikum;

public class Kotak2 {
  int panjang;
  int lebar;
  int tinggi;
  int volume;
  public int HitungVolume(){
    volume=panjang*lebar*tinggi;
    return volume;    
  }
  public void SetData(int p, int l, int t){
    panjang=p;
    lebar=l;
    tinggi=t;
  }
  public static void main(String[]args){
    Kotak2 obj=new Kotak2();
    obj.SetData(10, 20, 5);
    System.out.println("Volume Balok Adalah : "+ obj.HitungVolume());
  }
}
