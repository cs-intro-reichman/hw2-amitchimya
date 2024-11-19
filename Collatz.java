// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		int reach = 0;
		int counter = 0;
		String print = args[1];
		for (int i=1; i<=num ; i++) {
			reach = i;
			if (print.equals("v")) {
				System.out.print (reach + " ");
			}
			counter = 1;
			while (reach != 1 || counter==1) {
				if ( (reach%2==0)) {
				reach=reach/2;
				}
				else reach = (reach*3) + 1;
				if (print.equals("v")) {
					System.out.print (reach + " ");
				}
			counter++;
			}
			if (print.equals("v")) {
				System.out.print ("(" + counter + ")");
				System.out.println();
			}
		}
		System.out.print ("Every one of the first " + num + " hailstone sequences reached 1.");
		
	}
}
