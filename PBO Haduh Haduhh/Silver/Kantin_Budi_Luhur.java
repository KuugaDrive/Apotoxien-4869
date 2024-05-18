//Karena keterbatasan nama "Syukranda" dalam penamaan variabel, di dalam
//program ini akan banyak digunakan penamaan variabel dengan
//diikuti "underscore_Lirik Lagu/Judul Lagu" demi menignkatkan kerahasiaan 
//programmer dalam menggunakan variabel-variabelnya seperti yang dikatakan oleh buk Jay :)

import java.io.IOException;
import java.util.Scanner;
public class Kantin_Budi_Luhur {
    public static void main(String[] args) {
        Scanner Syukranda = new Scanner(System.in);
        String sYUkranda="Ya";
        String Syukranda_BalonkuAdaLima, Syukranda_RupaRupaWarnanya, Syukranda_DariSabangSampaiMarauke;
        int syUkranda, syuKranda, syukRanda, Syukranda_GarudaPancasila, Syukranda_BandungLautanApi, Syukranda_HaloHaloBandung,SYUKRANDA;
        int Syukranda_MerahKuningKelabu = 0, SYUKranda=0;
        // boolean SyukLama = false;


do {
    int Syukranda1=0, Syukranda2=0, Syukranda3=0;
    System.out.print("Nama Pelanggan\t\t : ");
    Syukranda.nextLine();
    System.out.print("NIM/NIP\t\t\t : ");
    String SyUkRaNdA = Syukranda.nextLine();
    String substringNIM = SyUkRaNdA.substring(0, 2);

    int SyUK = Integer.parseInt(substringNIM);
    if (SyUK<=23) {
        SyUK+=2000;
    }else if (SyUK>=23) {
        SyUK+=1900;
    }
    System.out.println("Angkatan\t\t : " + SyUK);

    System.out.println("Stasus\t\t\t : a.Mahasiswa, b. Karyawan");
    Syukranda_BalonkuAdaLima=Syukranda.nextLine();
    if (Syukranda_BalonkuAdaLima.equalsIgnoreCase("a")) {
        Syukranda_RupaRupaWarnanya = "Mahasiswa";
    } else if (Syukranda_BalonkuAdaLima.equalsIgnoreCase("b")) {
        Syukranda_RupaRupaWarnanya = "Karyawan";
    }else{
        System.out.println("Inputan Anda Tidak Valid, Silahkan Coba Lagi");
        return;
    }
    
    
do{
    System.out.println("Pilih Makanan : ");
    System.out.println("1. Nasi Goreng(Rp.15.000)");
    System.out.println("2. Mie Goreng(Rp.13.000)");
    System.out.println("3. Mie Rebus(Rp.10.000)");
    System.out.println("4. Soto Ayam(Rp.12.000)");
    System.out.println("5. Soto Daging(Rp.15.000)");
    System.out.println("6. Tidak Makan");
    System.out.print("Masukkan Pilihan \t: ");
    syUkranda = Syukranda.nextInt();

    System.out.print("Masukkan Jumlah \t: ");
    Syukranda_GarudaPancasila = Syukranda.nextInt();
    if(syUkranda==1){
        Syukranda1=15000*Syukranda_GarudaPancasila;
    }else if (syUkranda==2) {
        Syukranda1=13000*Syukranda_GarudaPancasila;
    }else if (syUkranda==3) {
        Syukranda1=10000*Syukranda_GarudaPancasila;
    }else if (syUkranda==4) {
        Syukranda1=12000*Syukranda_GarudaPancasila;
    }else if (syUkranda==5) {
        Syukranda1=15000*Syukranda_GarudaPancasila;
    }else if (syUkranda==6) {
        Syukranda1=0;
    }else{
        System.out.println("Inputan Anda Tidak Valid, Silahkan Coba Lagi");
    }

    System.out.println("Pilih Snack : ");
    System.out.println("1. Chiki (Rp.2.000)");
    System.out.println("2. Lidi-lidian (Rp.1.000)");
    System.out.println("3. Kerupuk (Rp.1.000)");
    System.out.println("4. Tidak ngemil");
    System.out.print("Masukkan Pilihan \t: ");
    syuKranda = Syukranda.nextInt();
    System.out.print("Masukkan Jumlah \t: ");
    Syukranda_HaloHaloBandung = Syukranda.nextInt();

    System.out.println("Pilih Minuman : ");
    System.out.println("1. Es Teh Manis (Rp.5.000)");
    System.out.println("2. Minuman Saset Seduh (Rp.5.000)");
    System.out.println("3. Kopi Panas (Rp.5.000)");
    System.out.println("4. Teh Panas (Rp.5.000)");
    System.out.println("5. Aqua(Rp.4.000/Rp.3.000)");
    System.out.println("6. Tidak Minum");
    System.out.print("Masukkan Pilihan \t: ");
    syukRanda = Syukranda.nextInt();
    System.out.print("Masukkan Jumlah \t: ");
    Syukranda_BandungLautanApi = Syukranda.nextInt();
    
    Syukranda.nextLine();
    System.out.println("\nBarang Kali Ada Kesalahan(Kelebihan/Kekurangan) Dalam Pesanan Anda, Jika Anda Ingin Mengubah Peasanan, Anda Dapat Mengulanginya(Ya/Tidak)");
    Syukranda_DariSabangSampaiMarauke=Syukranda.nextLine();

}while (Syukranda_DariSabangSampaiMarauke.equalsIgnoreCase("ya"));

    switch (syuKranda) {
        case 1:
            Syukranda2 += 2000 * Syukranda_HaloHaloBandung;
            break;
        case 2:
            Syukranda2 += 1000 * Syukranda_HaloHaloBandung;
            break;
        case 3:
            Syukranda2 += 1000 * Syukranda_HaloHaloBandung;
            break;
        default:
            
            break;
    }

    switch (syukRanda) {
        case 1:
            Syukranda3 += 5000 * Syukranda_BandungLautanApi;
            break;
        case 2:
            Syukranda3 += 5000 * Syukranda_BandungLautanApi;
            break;
        case 3:
            Syukranda3 += 5000 * Syukranda_BandungLautanApi;
            break;
        case 4:
            Syukranda3 += 5000 * Syukranda_BandungLautanApi;
            break;
        case 5:
        if(Syukranda_RupaRupaWarnanya.equalsIgnoreCase("mahasiswa")){
            Syukranda3 += 4000 * Syukranda_BandungLautanApi;
        }else if(Syukranda_RupaRupaWarnanya.equalsIgnoreCase("karyawan")){
            Syukranda3 += 3000 * Syukranda_BandungLautanApi;
        }
            break;
        case 6:

            break;
        default:
            
            break;}


    SYUKRANDA=Syukranda1+Syukranda2+Syukranda3;
    
    int RANDA;
    System.out.println("\nTotal Harga \t: Rp." + SYUKRANDA);
    RANDA=SYUKRANDA;
    int RAN, da;
    System.out.print("Uang Pembeli \t: Rp.");

    int DA=0;
    if(SyUK>=23){
         DA=RANDA*2/100;
    }
    
    int Syukranda_MatkulFavoritnyaPBO=2000*Syukranda_GarudaPancasila;
   if (Syukranda_RupaRupaWarnanya.equalsIgnoreCase("mahasiswa")) {
    SYUKranda=2000*Syukranda_GarudaPancasila;
   }
   RANDA=Syukranda1+Syukranda2+Syukranda3-SYUKranda-Syukranda_MerahKuningKelabu;
   

   if (SYUKRANDA>=100000) {
    Syukranda_MerahKuningKelabu=2000;
   }
 String syukranda1945=" ";
 if (Syukranda_GarudaPancasila>=10) {
    if (syUkranda==1) {
        syukranda1945="Yeaayy, Kamu Dapet Voucher Sebesar Rp.15000 Nihh!!!";
    }else if (syUkranda==2) {
        syukranda1945="Yeaayy, Kamu Dapet Voucher Sebesar Rp.13000 Nihh!!!";
    }else if (syUkranda==3) {
        syukranda1945="Yeaayy, Kamu Dapet Voucher Sebesar Rp.10000 Nihh!!!";
    }else if (syUkranda==4) {
        syukranda1945="Yeaayy, Kamu Dapet Voucher Sebesar Rp.12000 Nihh!!!";
    }else if (syUkranda==5) {
        syukranda1945="Yeaayy, Kamu Dapet Voucher Sebesar Rp.15000 Nihh!!!";
    }
 }
   
    RANDA -= Syukranda_MerahKuningKelabu;

    RAN = Syukranda.nextInt();
    da = RAN - RANDA;


            
    Syukranda.nextLine(); 
    System.out.println("\n====================================");
    System.out.println("\tSTRUK PEMBELIAN");
    System.out.println("====================================");
    System.out.println("Jumlah Pesanan \t: " + (Syukranda_BandungLautanApi + Syukranda_HaloHaloBandung + Syukranda_GarudaPancasila));
    System.out.println("Total Harga \t: Rp." + SYUKRANDA);
    System.out.println("Diskon \t\t: Rp." + Syukranda_MerahKuningKelabu);
    System.out.println("Bonus Voucer \t: " +syukranda1945);
    System.out.println("Potongan \t: Rp."+ Syukranda_MatkulFavoritnyaPBO);
    System.out.println("\n------------------------------\n");
    System.out.println("Total Bayar \t: Rp." + (RANDA));
    System.out.println("Uang \t\t: Rp." + (RAN));
    if (da>=0) {
    System.out.println("Kembalian \t: Rp." + (da));
    }else{
        System.out.println("Kembalian \t: Rp."+ (da));
        System.out.println("\n\n Yaahh, Uangmu Ga Cukup Nihh :(");
    }
    
    System.out.println("\n------------------------------");

    System.out.println("Programmer  ");
    System.out.print("NIM \t: ");
    String Syukranda_CintaPBO=Syukranda.nextLine();
    if (Syukranda_CintaPBO.equals("2311500546")) {
        System.out.print("Nama \t: Syukranda");
    } else {
        System.out.println("Data tidak ditemukan.");
    }System.out.println("\nApakah Anda Ingin Mengulang Program?(Ya/Tidak)");
    sYUkranda = Syukranda.nextLine();
    try {

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } catch (IOException | InterruptedException e) {
        e.printStackTrace();
    }
}while (sYUkranda.equalsIgnoreCase("ya"));
System.out.println("\n\nTerima Kasih Sudah Berbelanja, Kami Menunggu Kedatanganmu Kembali :)\n\n");

}
    }


