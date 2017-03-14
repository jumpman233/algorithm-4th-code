import edu.princeton.cs.algs4.StdOut;

public class Main{
    public static void main(String[] args){
        if(args.length != 3) {
            StdOut.println("input is wrong!");
            return;
        }
        int i1, i2, i3;
        i1 = Integer.parseInt(args[0]);
        i2 = Integer.parseInt(args[1]);
        i3 = Integer.parseInt(args[2]);
        
        if(i1 == i2 && i1 == i3 && i2 == i3){
            StdOut.println("equal");
        } else{
            StdOut.println("not equal");
        }
    }
}