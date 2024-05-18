package realxeyez.Minggu_Keempat;


import javax.swing.*;
public class nyoba_swing {
    public static void main(String[] args) {

    String nama="", NIM="", keinginan="";

        try{
            nama=JOptionPane.showInputDialog("Masukkan Nama Anda :");
            NIM=JOptionPane.showInputDialog("Masukkan NIM Anda: ");
            keinginan=JOptionPane.showInputDialog("Masukkan Lagu Kesukaan Anda :");
            
        }
        catch(Exception e){
            System.out.println("Error"+e);
        }
        
        System.out.println("Nama\t\t\t\t: "+nama);
        System.out.println("NIM\t\t\t\t: "+NIM);
        System.out.println("Lagu Kesukaan Anda Adalah\t: "+keinginan);
    }
}