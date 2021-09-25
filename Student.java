public class Student{
    
    private int studentId;
    private String fname;
    private String lname;

    public void setstudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public void setfname(String fname)
    {
        this.fname = fname;
    }

    public void setlname(String lname)
    {
        this.lname = lname;
    }

    public int getstudentId()
    {
        return this.studentId;
    }

    public String getfname()
    {
        return this.fname;
    }

    public String getlname()
    {
        return this.lname;
    }
    
    
}