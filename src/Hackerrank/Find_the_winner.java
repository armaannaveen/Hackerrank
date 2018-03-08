package Hackerrank;

import java.util.Arrays;

public class Find_the_winner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] andrea = {5, 7, 2, 4, 9}; /*Change the array for different o/p*/
		int[] maria = {5, 7, 2, 4, 2};  /*Change the array for different o/p*/
		String game = "even";  /*Change odd or even according to game*/
		int andr_even = 0, andr_odd = 0;
		int mar_even = 0, mar_odd = 0;
		
		    
	    for(int i = 0; i < andrea.length; i++) {
	        if(andrea[i] % 2 == 0)
			{         
	          andr_even++;
			}
			else
			   andr_odd++;	
	    } 
	    
	    for(int i = 0; i < maria.length; i++) {
	        if(maria[i] % 2 == 0)
			{         
	        	mar_even++;
			}
			else
				mar_odd++;	
	    } 
	    if(game=="even"){
	  /*  System.out.printf("\nNumber of even elements in Andrea lot: %d",andr_even);
	    System.out.printf("\nNumber of even elements in Maria lot: %d",mar_even);
	   System.out.printf("\n");
		System.out.printf("\n");*/
	    if(andr_even>mar_even){
			System.out.printf("Andrea is the Winner");	
		}
	    else if(andr_even==mar_even){
			System.out.printf("Tie");	
		}
		else 
			System.out.printf("Maria is the Winner");	
	    }
		System.out.printf("\n");
		if(game=="odd"){
	/*	System.out.printf("\nNumber of odd elements in Andrea lot: %d",andr_odd);
		System.out.printf("\nNumber of odd elements in Maria lot: %d",mar_odd);
		System.out.printf("\n");
		System.out.printf("\n");*/
		if(andr_odd>mar_odd){
			System.out.printf("Andrea is the Winner");	
		}
	    else if(andr_odd==mar_odd){
			System.out.printf("Tie");	
		}
		else 
			System.out.printf("Maria is the Winner");	
		}
	}

}
