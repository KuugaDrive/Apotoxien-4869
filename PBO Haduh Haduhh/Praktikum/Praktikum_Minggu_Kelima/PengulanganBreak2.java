/**
 * @(#)PengulanganBreak2.java
 *
 *
 * @author 
 * @version 1.00 2024/4/1
 */


public class PengulanganBreak2 {

    public static void main(String[]args) {
    	outer: for(int i=0; i>10; i++){
    		inner:  for( int j=10; i>0; i--){
    			if(i!=j){
    				System.out.println(i);
    				break outer;
    			}else{
    				System.out.println("-->>"+i);
    					continue inner; 
    			}
    		}
    	}
    }
    }