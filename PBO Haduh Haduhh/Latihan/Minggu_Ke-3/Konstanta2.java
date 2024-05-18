/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realxeyez.Minggu_Ketiga;

/**
 *
 * @author pemvis
 */
public class Konstanta2{
    public static void main(String[]args){
        //Deklarasi Variabel
        final String NAMA="Anif";
        //inisialisai VAriabel
        //NAMA="Budi"
        //NAMA sudah final tidak boleh diisi nilai lain
        //Deklarasi+Inisialisasi
        String nama2="Anif";
        //String nama2=new String("Anif");
        //mencetak isi variabel
        System.out.println("Nama:"+NAMA);
        System.out.println("Nama2:"+nama2);
        nama2="Budi2";
        System.out.println("Nama2:"+nama2);
    }
}
