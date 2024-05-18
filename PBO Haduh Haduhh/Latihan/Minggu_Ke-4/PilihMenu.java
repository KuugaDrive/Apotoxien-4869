import java.util.Scanner;
public class PilihMenu {
    public static void main(String[]args){
        String pulsa="Rp.30.000";
        String paket_data="4GB";
        String point="50";
        int untuk_apa;
        Scanner scanner=new Scanner(System.in);
        System.out.println("==========Pilih Menu==========");
        System.out.println("1. Cek Pulsa");
        System.out.println("2. Cek Paket Data");
        System.out.println("3. Cek Point");
        System.out.println("4. Promo");
        System.out.println("Masukkan Pilihan Anda(1/2/3/4)");
        untuk_apa=scanner.nextInt();
        if (untuk_apa==1) {
            System.out.println("Sisa Pulsa Anda Adalah Sebesar "+pulsa);
        }else if (untuk_apa==2) {
            System.out.println("Sisa Kuota Anda Adalah Sebesar "+paket_data);            
        }else if(untuk_apa==3){
            System.out.println("Sisa Point Anda Adalah Sebesar "+point);
        }else if(untuk_apa==4){
            System.out.println("Tidak Ada Promo Untuk Bulan Ini");
        }else{
            System.out.println("Permintaan Anda Tidak Valid, Silahkan Coba Lagi");
        }

    }
}
