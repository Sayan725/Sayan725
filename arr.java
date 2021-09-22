public class arr {
    public static void main(String[] args) {
        int[] b = {2,5,9,0,3,12,7};
        int num = 7;
        for(int i = 0; i <= b.length; i++)
        {
            if(b[i] == num)
            {
                System.out.println(num);
            }
            else{
                System.out.println("Not Found");
            }
        }
}
}
