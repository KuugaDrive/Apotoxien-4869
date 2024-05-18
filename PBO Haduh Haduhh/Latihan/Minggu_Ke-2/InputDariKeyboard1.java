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
import java.io.*;
public class InputDariKeyboard1 {
    public static void main(String[]args){
       String   NIM="", nama="";
       BufferedReader objInput = new BufferedReader(
                                 new InputStreamReader(System.in));
       try{
           System.out.println("====================================");
           System.out.println("\t\tInput Data Mahasiswa            ");
           System.out.print("NIM\t\t:");         NIM=objInput.readLine();
           System.out.print("Nama\t\t:");        nama=objInput.readLine();
           System.out.println("====================================\n");
          
       }
       catch(Exception e){
           System.out.println("Error:"+e);
       }
           System.out.println("====================================");
           System.out.println("\t\tCetak Data Mahasiswa            ");
           System.out.println("====================================");
           System.out.println("NIM\t\t:"+NIM);
           System.out.println("Nama\t\t"+nama);
           System.out.println("====================================");
    }
}
