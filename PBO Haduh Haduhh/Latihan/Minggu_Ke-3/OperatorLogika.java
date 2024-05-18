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
public class OperatorLogika {
    public static void main(String[]args){
        String NIM="911500060";
        String nama="M.Anif";
        byte nilAkhir=85;
        System.out.println("MIM\t\t:"+NIM);
        System.out.println("Nama\t\t:"+nama);
        System.out.println("NilaiAkhir\t\t:"+nilAkhir);
        if(nilAkhir>=85&&nilAkhir<=100){
            System.out.println("Grade\t\t:A");
            
        }
        else{
            System.out.println("Grade\t\t:E");
        }
       
    }
}
