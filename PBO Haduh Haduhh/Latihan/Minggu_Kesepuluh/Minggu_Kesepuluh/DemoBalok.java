package Minggu_Kesepuluh;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import Minggu_Kesepuluh.Balok;

public class DemoBalok {
  public static void main(String[]args){
    DecimalFormat decimalFormat;
    JTextArea textArea;
    Balok balok;

    balok=new Balok();

    decimalFormat=new DecimalFormat("0,00");
    String string="Menggunakan Kelas Balok\n";

    string +="\nPanjang balok: "+
      decimalFormat.format(balok.getPanjang());
    string +="\nLebar Balok: "+
      decimalFormat.format(balok.getLebar());
    string +="\nTinggi Balok: "+
      decimalFormat.format(balok.getTinggi());
    string +="\nVolume Balok: "+
      decimalFormat.format(balok.getVolume());

    string +="\n\nMemodifikasi panjang=5 dan lebar =3";
      balok.setPanjang(5);
      balok.setLebar(3);
    string +="\nPanjang Balok: "+
      decimalFormat.format(balok.getPanjang());
    string +="\nLebar Balok: "+
      decimalFormat.format(balok.getLebar());
    string +="\nTinggi Balok: "+
      decimalFormat.format(balok.getTinggi());
    string +="\nVolume Balok"+
      decimalFormat.format(balok.MencariKelilingPP());

    textArea=new JTextArea();

    textArea.setText(string);
    JOptionPane.showMessageDialog(null, textArea, "Kelas Balok",
    JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);


  }

}
