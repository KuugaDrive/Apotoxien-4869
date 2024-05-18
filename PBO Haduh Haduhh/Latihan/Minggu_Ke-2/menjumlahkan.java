/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realxeyez.Minggu_Kedua;

/**
 *
 * @author root
 */
import javax.swing.*;
public class menjumlahkan {
    public static void main(String[]args){
        int angkasatu=0, angkadua=0, total=0;
        try{
            angkasatu= Integer.parseInt(JOptionPane.showInputDialog("Masukkan angkasatu :")); 
            angkadua= Integer.parseInt(JOptionPane.showInputDialog("Masukkan angkadua :"));
            total = angkasatu+angkadua;
        }
        catch(Exception e){
            System.out.println("Error"+e);
            
        }
           System.out.println("Hasil Angka:"+ total);
    }
    
}
