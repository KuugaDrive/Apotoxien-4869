package Minggu_Kesebelas;

import java.util.Scanner;

class Persegi {
    double sisi;

    double luas() {
        return sisi * sisi;
    }

    double keliling() {
        return 4 * sisi;
    }
}

class Lingkaran {
    double r;

    double luas() {
        return 3.14* r * r;
    }

    double keliling() {
        return 2 * 3.14 * r;
    }
}

class PersegiPanjang {
    double panjang;
    double lebar;

    double luas() {
        return panjang * lebar;
    }

    double keliling() {
        return 2 * (panjang + lebar);
    }
}

class Segitiga {
    double alas;
    double tinggi;

    double luas() {
        return 0.5 * alas * tinggi;
    }

    double keliling() {
        // Tidak dapat menghitung keliling segitiga hanya dengan alas dan tinggi.
        return -1;
    }


// public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan panjang sisi persegi:");
        double sisiPersegi = input.nextDouble();
        
        System.out.println("Masukkan jari-jari lingkaran:");
        double jariJari = input.nextDouble();
        
        System.out.println("Masukkan panjang persegi panjang:");
        double panjangPersegiPanjang = input.nextDouble();
        
        System.out.println("Masukkan lebar persegi panjang:");
        double lebarPersegiPanjang = input.nextDouble();
        
        System.out.println("Masukkan alas segitiga:");
        double alasSegitiga = input.nextDouble();
        
        System.out.println("Masukkan tinggi segitiga:");
        double tinggiSegitiga = input.nextDouble();
        
        Persegi persegi = new Persegi(); 
        persegi.sisi = sisiPersegi;
        Lingkaran lingkaran = new Lingkaran(); 
        lingkaran.r = jariJari; 
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = panjangPersegiPanjang; 
        persegiPanjang.lebar = lebarPersegiPanjang; 
        Segitiga segitiga = new Segitiga(); 
        segitiga.alas = alasSegitiga; 
        segitiga.tinggi = tinggiSegitiga; 
        
        System.out.println("Luas dan Keliling masing-masing bangun datar:");
        System.out.println("Luas Persegi: " + persegi.luas() + ", Keliling Persegi: " + persegi.keliling());
        System.out.println("Luas Lingkaran: " + lingkaran.luas() + ", Keliling Lingkaran: " + lingkaran.keliling());
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas() + ", Keliling Persegi Panjang: " + persegiPanjang.keliling());
        System.out.println("Luas Segitiga: " + segitiga.luas()); // Perhatikan bahwa kita tidak dapat menghitung keliling segitiga hanya dengan alas dan tinggi.
    }
}