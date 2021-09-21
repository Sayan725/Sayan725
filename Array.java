import java.util.Arrays;

public class Array{
    public static void main(String[] args) {
        int[] x = {12,17,6,9,3,0,87,60};
        Arrays.sort(x);
        System.out.println("Minimum = " + x[0]);
        System.out.println("Maximum = " + x[x.length-1]);

        }
    }
