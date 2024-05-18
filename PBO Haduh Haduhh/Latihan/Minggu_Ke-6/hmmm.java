import java.util.Scanner;
public class hmmm {
    public static void main(String[]args){
        Scanner noor=new Scanner(System.in);
        
         try{
            int i=0;

            System.out.print("Masukkan Bilangan N : ");
            int N=noor.nextInt();
            for(i=1; i<=N; i++){
                    System.out.println("Perulangan yang ke"+i);
            }
        }
        catch(Exception xx){
        System.out.println("Data yang diinput harus Integer");
        }
        finally{
            System.out.println("Terima kasih sudah melakukan perulangan");
        }
    }
}
