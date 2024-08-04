package studentmanagement;

public class StudentRecordSystemm
{
   private Student_[] students = new Student_[100];
    private int count=-1;
    int i;
    public void addStudent(Student_ student)
    {
        count++;
        if(count<100)
        {
          students[count]= student;
         
        }
        else{
            System.out.println("you can't add more data due to memory over flow");
               
        }

    }
    public Student_  getStudent(int s_id)
    {
        for(i=0;i<=count;i++)
        {
            if(students[i].getStudentID() == s_id)
            {
                return students[i];
            }

        }
        return null;


    } 
    public void displayAllStudents()
    {

        if(count == -1)
        {
            System.out.println("No data found .Enter data first");  
        }
        else
        {
        for(i=0;i<=count;i++)
        {
            System.out.println(students[i]);
        }
        }

    }
}