package Minggu_Kesebelas;

public class Siswa {
  private int Nilai;
  public String nama;

  public void setNilai(int n){
    if (n>=0 && n<=100) 
      Nilai=n;
    else
      System.out.println("Error...");
    }
    public int getNilai(){
      return Nilai;
    }
    public void Info(){
      System.out.println("Saya Mahasiswa UBL");
    }
  }

