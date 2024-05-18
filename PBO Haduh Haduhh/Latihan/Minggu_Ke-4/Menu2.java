/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realxeyez.Minggu_Keempat;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

/**
 *
 * @author root
 */
public class Menu2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        double pulsaBalance=50.000;
        int noor;
        String cekKuota="50 GB";
        String cekPromo="Promo MegaDiskon...";
        String cekPoint="50";
       
        
            System.out.println("Menu Pilihan");
            System.out.println("1. Cek Pulsa");
            System.out.println("2. Cek Paket Data");
            System.out.println("3. Cek Promo");
            System.out.println("4. Cek Point");
            System.out.println("Pilih 1-4 : ");
            noor=scanner.nextInt();
            scanner.nextLine();
            
            if(noor==1){
                System.out.println("Sisa Pulsa Anda Adalah RP."+ pulsaBalance);
                System.out.print("Apakah Anda Ingin Membeli Pulsa? (ya/tidak) : ");
                String beliPulsa=scanner.nextLine();
                if(beliPulsa.equalsIgnoreCase("ya")){
                    System.out.println("Pilih Nominal Pulsa Yang Anda Inginkan : ");
                    System.out.println("1. Rp.10.000 ");
                    System.out.println("2. Rp.15.000 ");
                    System.out.println("3. Rp.20.000 ");
                    System.out.println("4. Rp.25.000 ");
                    System.out.println("Masukkan Pilihan Anda(1-4): ");
                int pilihanPulsa=scanner.nextInt();
                scanner.nextLine();
                if(pilihanPulsa==1){
                    System.out.println("Anda Memilih Pulsa Rp.10.00");
            }
                else if(pilihanPulsa==2){
                    System.out.println("Anda Memilih Pulsa Rp.15.00");
                }
                else if(pilihanPulsa==3){
                    System.out.println("Anda Memilih Pulsa Rp.20.00");
                }
                else if(pilihanPulsa==4){
                    System.out.println("Anda Memilih Pulsa Rp.25.00");    
                }else{
                    System.out.println("Not Found");
                }           
            }else{
                    System.out.println("Anda Memilih Untuk Tidak Membeli Pulsa");
                }
            }else if(noor==2){
                    System.out.println("Sisa Kuota Anda Sebesar : "+cekKuota);
                    System.out.print("Apakah Anda Ingin Membeli Kuota(Ya/Tidak) : ");
                    String beliKuota=scanner.nextLine();
                    if(beliKuota.equalsIgnoreCase("Ya")){
                    System.out.println("Pilih Nominal Harga Kuota Yang Ingin Anda Beli");
                    System.out.println("1. 15GB/7 Hari Rp.50.000");
                    System.out.println("2. 17GB/7 Hari Rp.60.000");
                    System.out.println("3. 20GB/7 Hari Rp.65.000");
                    System.out.println("4. 22GB/7 Hari Rp.70.000");
                    System.out.println("Masukkan Pilihan Anda(1-4)");
                    int pilihanKuota=scanner.nextInt();
                    scanner.nextLine();
                    if(pilihanKuota==1){
                        System.out.println("Anda Telah Berhasil Membeli Kuota Seharga Rp.50.000");
                }   else if(pilihanKuota==2){
                        System.out.println("Anda Telah Berhasil Membeli Kuota Seharga Rp.60.000");
                }   else if(pilihanKuota==3){
                        System.out.println("Anda Telah Berhasil Membeli Kuota Seharga Rp.65.000");
                }   else if(pilihanKuota==4){
                        System.out.println("Anda Telah Berhasil Membeli Kuota Seharga Rp.70.000");    
                }else{
                    System.out.println("Not Found");
                }
                }else {
                System.out.println("Anda Tidak Memilih Untuk Membeli Kuota");
                }
        }else if(noor==3){
        System.out.println(cekPromo);
        System.out.println("Apakah Anda Tertarik Dengan Promo Ini?(Ya/Tidak)");
        String SyukrandatertarikPromo=scanner.nextLine();
        if (SyukrandatertarikPromo.equalsIgnoreCase("ya")) {
            System.out.println("Pilih Promo Yang Anda Inginkan");
            System.out.println("1. Paket Kuota 5GB/7 Hari Rp.15.000");
            System.out.println("2. Paket Kuota 10GB/7 Hari Rp.20.000");
            System.out.println("3. Paket Kuota 15GB/14 Hari Rp.25.000");
            System.out.println("4. Paket Kuota 20GB/14 Hari Rp.35.000");
            System.out.println("5. Paket Kuota 25GB/30 Hari Rp.55.000");
            System.out.println("Silahkan Masukkan Pilihan Anda (1-5)");
            int pilihanPromo=scanner.nextInt();
            if (pilihanPromo==1) {
                System.out.println("Selamat Anda Mendapatkan Kuota Sebesar 5GB");
            }else if (pilihanPromo==2) {
                System.out.println("Selamat Anda Mendapatkan Kuota Sebesar 10GB");                    
            }else if (pilihanPromo==3) {
                System.out.println("Selamat Anda Mendapatkan Kuota Sebesar 15GB");
            }else if(pilihanPromo==4){
                System.out.println("Selamat Anda Mendapatkan Kuota Sebesar 20GB");
            }else if(pilihanPromo==5){
                System.out.println("Selamat Anda Mendapatkan Kuota Sebesar 25GB");
            }else{
                System.out.println("Not Found");
            }                
            }else{
                System.out.println("Anda Tidak Memilih Untuk Membeli Promo");
            }
                
        }else if(noor==4) {
            System.out.println("Point Anda Adalah Sebanyak : "+cekPoint);
                }
        else{
            System.out.println("Permintaan Anda Tidak Valid, Silahkan Coba Lagi");
        }
            scanner.close();
 
        }        
        
}       

