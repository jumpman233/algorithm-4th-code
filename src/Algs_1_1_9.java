import edu.princeton.cs.algs4.*;

public class Algs_1_1_9 {
	public static void main(String[] args){
		int n = 10;
		String str = "";
		for(; n > 0; n /= 2){
			str = (n % 2) + str;
		}
		
		StdOut.println(str);
	}
}
