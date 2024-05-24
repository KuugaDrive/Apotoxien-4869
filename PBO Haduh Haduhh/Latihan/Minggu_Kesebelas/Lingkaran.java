package Minggu_Kesebelas;


// import java.lang.Math;

abstract class BangunDatar{
  abstract float luas();
  abstract float keliling();
}
public class Lingkaran extends BangunDatar{
  float r;
  public Lingkaran(){
    this.r=1.0f;
  }
  public Lingkaran(float r){
    this.r=r;
  }


@Override
float luas(){
float luas = (float) (3.14 * r * r);
System.out.println("Luas lingkaran: " + luas);
 return luas;
 }

 @Override
 float keliling(){
 float keliling = (float) (2 *3.14 * r);
 System.out.println("Keliling Lingkaran: " + keliling);
 return keliling;
 }
}