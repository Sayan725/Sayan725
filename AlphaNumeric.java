import java.util.*;

public class AlphaNumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        String a = "^[a-zA-Z0-9]+$";        
        boolean result = s.matches(a);
        if(result)
        {
            System.out.println("String is AlphaNumeric");
        }
        else{
            System.out.println("Not AlphaNumeric");
        }

        sc.close();


    }
}
