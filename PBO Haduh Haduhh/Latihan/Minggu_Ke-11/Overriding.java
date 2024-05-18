package realxeyez.Minggu_Kesebelas;



import realxeyez.*;;

public class Overriding {
  public static void main(String[]args){
    Binatang b= new Binatang();
    Mamalia m= new Mamalia();
    Binatang bm= new Mamalia();
    b.bergerak(); m.bergerak();
    bm.bergerak();
    bm.berkembangBiak();
  }
}
