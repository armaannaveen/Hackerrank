package Hackerrank;

public class TwoCircles {
	static int circle(int x1, int y1, int x2, int y2,
            int r1, int r2)
{
int distSq = (x1 - x2) * (x1 - x2) +
(y1 - y2) * (y1 - y2);
int radSumSq = (r1 + r2) * (r1 + r2);
if (distSq == radSumSq)
return 1;
else if (distSq > radSumSq)
return -1;

else
return 0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = -10, y1 = 8;
        int x2 = 14, y2 = -24;
        int r1 = 30, r2 = 10;
        int t = circle(x1, y1, x2, y2, r1, r2);
        if (t == 1)
            System.out.println ( "Touching Circles");
        else if (t < 0)
            System.out.println ( "Disjoint Circles");
       
        else
            System.out.println ( "Intersecting Circles");
             
    }
	}

