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
import javax.swing.*;
public class NilaiAkhir {
    public static void main(String[]args){
        Integer TUGAS=Integer.parseInt(JOptionPane.showInputDialog("Nilai Tugas:"));
        Integer UTS=Integer.parseInt(JOptionPane.showInputDialog("Nilai UTS:"));
        Integer UAS=Integer.parseInt(JOptionPane.showInputDialog("Nilai UAS:"));
        Double rataNilai=(TUGAS*0.3)+(UTS*0.3)+(UAS*0.4);
        
        if(rataNilai>=85){
            System.out.println("Grade anda adalah A");}
             else if(rataNilai>=80){
             System.out.println("Grade anda adalah A-");}
             else if(rataNilai>=75){
             System.out.println("Grade anda adalah B+");}
             else if(rataNilai>=70){
             System.out.println("Grade anda adalah B");}
             else if(rataNilai>=65){
             System.out.println("Grade anda adalah C");}
             else{System.out.println("Tidak Lulus");
       }
        System.out.println("Nilai Rata" + rataNilai);
    }
}
