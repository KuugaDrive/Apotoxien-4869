package realxeyez.Minggu_Kedua;

import javax.swing.*;
public class InputDariKeybord2{
    public static void main(String[]args){
        String NIM="", nama="";
        try{
            NIM=JOptionPane.showInputDialog("Masukkan NIM :"); 
            nama=JOptionPane.showInputDialog("Masukkan nama :"); 
        }
        catch(Exception e){
            System.out.println("Error"+e);
            
        }
           System.out.println("====================================");
           System.out.println("\t\tCetak Data Mahasiswa            ");
           System.out.println("====================================");
           System.out.println("NIM\t\t:"+NIM);
           System.out.println("Nama\t\t:"+nama);
           System.out.println("====================================");
    }
    
}
