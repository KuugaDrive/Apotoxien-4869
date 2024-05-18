/**
 * @(#)PengulanganContinue.java
 *
 *
 * @author 
 * @version 1.00 2024/4/1
 */


public class PengulanganContinue {

    public static void main(String[]args) {
    	System.out.println("Cetak Bilangan Ganjil:");
    	for(int S=1; S<=10; S++){
    		if(S%2==0){
    			continue;
    		}
    		System.out.println(S);
    	}
    }
    
    
}