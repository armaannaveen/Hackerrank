package Hackerrank;

import java.util.Arrays;

public class Buying_show_tickets {
	public static long times( int[] tickets, int p) {
	    long times = 0;
	    int[] temp = Arrays.copyOf(tickets, tickets.length); //creating this array to check whether the *person i* buy tickets less than *person p*
	    for(int i = 0; i < tickets.length; i++ ) {
	       temp[i] = tickets[i] - tickets[p];
	    }
	    for(int i = 0; i < tickets.length; i++ ) {
	       if(temp[i] < 0) times += tickets[i];
	       else {
	          if(i <= p) times += tickets[p];
	          else times += tickets[p] - 1;
	       }
	    }
	    return times;
	} 
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myIntArray = {5,2,6,3,4,5,2};
		System.out.println(times((myIntArray), 2));
	}*/

}
