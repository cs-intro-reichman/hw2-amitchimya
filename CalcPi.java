// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	   int num = Integer.parseInt(args[0]);
	   double sum = 1.0;
	   int demo = 1;
		for (int i=1; i<num; i++) {
			demo = demo + 2;
			if (i%2!=0) {
				sum = sum - (double)(1.0/demo);
			}
			else sum = sum + (double)(1.0/demo);
	   }
	   System.out.println("pi according to Java: " + Math.PI);
	   sum = sum * 4;
	   System.out.println("pi, approximated:     " + sum);
	}
}
