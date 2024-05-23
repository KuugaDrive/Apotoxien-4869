package Minggu_Kesepuluh;

// import Minggu_Kesepuluh.PersegiPanjang;
    public class Balok extends PersegiPanjang {
     private double tinggi = 1.0;
      private double lebar = 1.0;
       private double panjang = 1.0;

       public Balok(){
          super(1.0,1.0);
       }

    public double getTinggi() {
    return tinggi;
    }
    
     public double getPanjang() {
    return panjang;
    }
     public double getLebar() {
    return lebar;
    }

    public void setTinggi(double tinggi) {
    this.tinggi = (tinggi > 1) ? tinggi : 1;
    }
    
     public void setPanjang(double panjang) {
    this.tinggi = panjang;
    }
     
      public void setLebar(double lebar) {
    this.tinggi = lebar;
    }

    public double getVolume() {
      return MencariLuasPP() * tinggi; 
}   
}