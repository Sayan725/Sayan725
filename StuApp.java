public class StuApp {
    
   public static void main(String[] args) {
       
     Student sayan = new Student();
        
        sayan.setstudentId(1);
        sayan.setfname("Sayan");
        sayan.setlname("Sinharoy");

     Student rahul = new Student();
     
        rahul.setstudentId(2);
        rahul.setfname("Rahul");
        rahul.setlname("Sharma");

     Student karan = new Student();
     
        karan.setstudentId(3);
        karan.setfname("Karan");
        karan.setlname("Singh");

      Student vikram = new Student();
      
        vikram.setstudentId(4);
        vikram.setfname("Vikram");
        vikram.setlname("Pandey");

      Student rohit = new Student();

        rohit.setstudentId(5);
        rohit.setfname("Rohit");
        rohit.setlname("Srivastava");



        System.out.println(sayan.getstudentId());
        System.out.println(sayan.getfname());
        System.out.println(sayan.getlname());

        System.out.println(rahul.getstudentId());
        System.out.println(rahul.getfname());
        System.out.println(rahul.getlname());

        System.out.println(karan.getstudentId());
        System.out.println(karan.getfname());
        System.out.println(karan.getlname());

        System.out.println(vikram.getstudentId());
        System.out.println(vikram.getfname());
        System.out.println(vikram.getlname());

        System.out.println(rohit.getstudentId());
        System.out.println(rohit.getfname());
        System.out.println(rohit.getlname());

   }

}
