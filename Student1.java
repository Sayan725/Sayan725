public class Student1 {
    int n;
    String name;
    String l;

   public Student1( int studentId, String fname, String lname )
   {
       n = studentId;
       name = fname;
       l = lname;

   }

     public static void main(String[] args) {
         
          Student1 s = new Student1(1, "Sayan", "Sinharoy");

          System.out.println(s.n + " " + s.name + " " + s.l);

     }

}
