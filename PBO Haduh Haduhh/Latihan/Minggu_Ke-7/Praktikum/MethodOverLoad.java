package Praktikum;

class Manusia {
  String nama;
  String jenkel;
   void setNilai(String Param1){
      nama=Param1;
   }
   void setNilai(String Param1,String Param2){
    nama=Param1;
    jenkel=Param2;
   }
   void tCetak(){
    System.out.println(nama+" adalah "+jenkel);

   }
}
class MethodOverLoading{
   public static void main(String[]args){
      Manusia m1,m2;
      m1= new Manusia();
      m2= new Manusia();

      m1.setNilai("Zamzam");
      m2.setNilai("Zamzam","Laki-Laki");

      m1.tCetak();
      m2.tCetak();
   }

  
}