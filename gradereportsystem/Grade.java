package gradereportsystem;

public class Grade {
    int id;
    //int coures_id;
    char grade;
    String[] subname = new String[4];
    String[] gr = new String[4];
    //String[] code = new String[10];
    int[] credits = new int[4];
    int[] th_point = new int[4];
    int total_credit;
    double GPA;


    public Grade(int id,String[] sub,String[] gr, int[] cr,int t_credit)
    {
      this.id=id;
      this.subname = sub;
      this.gr=gr;
      this.credits=cr;
      this.total_credit=t_credit;
    }
    public int getStudentid()
    {
       return id;
    }
    public String[] getSubname()
    {
        return subname;
    }
    public String[] getGrade()
    {
        return gr;
    }
    public int[] getCredits()
    {
        return credits;
    }
    // public String toString()
    // {
    //     return 
    // }
}
