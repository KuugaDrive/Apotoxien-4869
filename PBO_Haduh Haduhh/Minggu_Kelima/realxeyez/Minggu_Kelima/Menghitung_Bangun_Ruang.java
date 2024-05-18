/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realxeyez.Minggu_Kelima;

/**
 *
 * @author root
 */
import java.util.Scanner;
public class Menghitung_Bangun_Ruang {
    public static void main(String[]args){
        int pilihan;
        double kubus;
        double tabung;
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. Kubus");
        System.out.println("2. Tabung");
        System.out.println("Masukkan Pilihan(1/2)");
        pilihan=scanner.nextInt();
        scanner.nextInt();
        if(pilihan==1){
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("Masukkan Pilihan(1/2)");
        int pilihanLuas_Keliling=scanner.nextInt();
        scanner.nextInt();
        if(pilihanLuas_Keliling==1){
            System.out.println("Masukkan Panjang Sisi Kubus");
            double sisi=scanner.nextDouble();
            double luas=6*(sisi*sisi);
            System.out.println("Panjang Luas Kubus Adalah : "+luas);
        }else if(pilihanLuas_Keliling==2){
            System.out.println("Masukkan Panjang Rusuk");
            double rusuk=scanner.nextDouble();
            double keliling=12*(rusuk);
            System.out.println("Panjang Luas Kubus Adalah : "+keliling);
        }else{
            System.out.println("Inputan Anda Tidak Valid");
        }
        }else if(pilihan==2){
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("Masukkan Pilihan(1/2)");
        int pilihanLuas_Keliling=scanner.nextInt();
        scanner.nextInt();
        if(pilihanLuas_Keliling==1){
            System.out.println("Masukkan Panjang Nilai Jari-Jari");
            double jari_jari=scanner.nextDouble();
            double luas=3.14*jari_jari*jari_jari;
            System.out.println("Panjang Luas Tabung Adalah : "+luas);
        }else if(pilihanLuas_Keliling==2){
            System.out.println("Masukkan Panjang Diameter");
            double diameter=scanner.nextDouble();
            double keliling=3.14*diameter;
            System.out.println("Panjang Luas Tabung Adalah : "+keliling);
        }else{
            System.out.println("Inputan Anda Tidak Valid");
           
        }
        }else{
            System.out.println("Inputan Anda Tidak Valid, Silahkan Coba Lagi");
            
    }
         System.out.println("Apakah Anda Ingin Mengulangnya?(ya/tidak)");
            String jawaban=scanner.nextLine();
            scanner.nextLine();
            if(!jawaban.equalsIgnoreCase("tidak"));{
            break;
        }
        }
    }

