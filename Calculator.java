import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        double a, b, c = 0;   //Initialising variables
        

        Scanner sc = new Scanner(System.in);    //Taking input from user
        System.out.println("Enter the numbers:");
        
        a = sc.nextDouble();
        b = sc.nextDouble();

        System.out.println("Enter the operator:");

        char op = sc.next().charAt(0);
        

        if(op == '+')
        {
            c = a + b; //Adding two numbers

            System.out.println("Sum is: " + c);  
        }
        if(op == '-')
        {
            c = a - b; //Subtracting two numbers

            System.out.println("Difference is: " + c);  
        }
        if(op == '*')
        {
            c = a * b; //Multiplying two numbers

            System.out.println("Multiplication is: " + c); 
        }
        if(op == '/')
        {
            c = a / b; //Dividing two numbers
            
            System.out.println("Division is: " + c); 
        }

        sc.close();

    }
    
}
