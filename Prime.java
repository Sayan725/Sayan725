public class Prime {
    public void prime()
     {
         
         for(int i = 15; i < 80; i++)
         {
           int c = 0;
           for(int j = 1; j <= i; j++)
           {
               if(i % j == 0)
               c = c + 1;
           }
           if(c == 2)
           {
               System.out.println(i);
           }
         }
     }
    public static void main(String[] args) {
        
        Prime p = new Prime();
        p.prime();
           
    }
}
