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
public class OperatorPembanding2 {
    public static void main(String[]args){
        String NIM="9111500060";
        String nama="M.Anif";
        byte nilAkhir=80;
        System.out.println("NIM\t\t:"+NIM);
        System.out.println("Nama\t\t:"+nama);
        System.out.println("Nilai Akhir\t\t:"+nilAkhir);
        if(nilAkhir>=85){
            System.out.println("Predikat\t:Sangat Memuaskan");
                             }
        else{
            System.out.println("Predikat\t:Tidak Memuaskan");
        }
        
    }
}
