public class DuplicateArr {
    public static void main(String[] args) {
        int[] a = {1,5,8,9,6,7,9,1};
        int i,j;

        for(i = 0; i < a.length; i++)
        {
            for(j = i + 1; j < a.length; j++)
            {
                if(a[i] == a[j])
            {
                  System.out.println(a[j]);
            }
            }
        }

    }
    
}
