package gradereportsystem;

public class GradingSystem {
    Students_1[] stu = new Students_1[100];
    Grade[] grade = new Grade[100];
    int[] course_credits = new int[4];
    int studentCount=0;
    int gradeCount=0;
    int i,j;
    int total=0;
    double GPA;
   
    public void adStudent(Students_1 st)
    {
        if(studentCount<100)
        {
            stu[studentCount]= st;
            studentCount++;
        }
        else
        {
         System.out.println("Not enough space available");   

        }

 
    } 
    public void addGrade(Grade gr)
    {
        
         if(gradeCount<100)
         {
            grade[gradeCount]=gr;
            gradeCount++;

         }
         else
         {
            System.out.println("not enough space ");
         }

    }
   
    public void calculateGPA(int id)
    {
        for(i=0;i<=studentCount;i++)
        {
            if(grade[i].getStudentid()==id)
            {
                for(j=0;j<4;j++)
                {
                    if((grade[i].gr[j])=="AA")
                    {
                         (grade[i].th_point[j])=10;
                    }
                    else if((grade[i].gr[j])=="AB")
                    {
                        (grade[i].th_point[j])=9;

                    }
                    else if((grade[i].gr[j])=="BB")
                    {
                        (grade[i].th_point[j])=8;

                    }
                    else if((grade[i].gr[j])=="BC")
                    {
                        (grade[i].th_point[j])=7;

                    }
                    else if((grade[i].gr[j])=="CC")
                    {
                        (grade[i].th_point[j])=6;

                    }
                    else if((grade[i].gr[j])=="CD")
                    {
                        (grade[i].th_point[j])=5;

                    }
                    else if((grade[i].gr[j])=="DD")
                        {
                            (grade[i].th_point[j])=4;

                        }
                        else if((grade[i].gr[j])=="FF")
                        {
                            (grade[i].th_point[j])=0;

                        }
                        total = total + ((grade[i].credits[j])* (grade[i].th_point[j]));
                    
                }
                GPA = (double)total / (double)(grade[i].total_credit);
                System.out.println(GPA);
                

            }
            break;
            
           
        }
      // return GPA;
        
        
        


        
      
    }
    public void display(int id)
    {
        for(i=0;i<=studentCount;i++)
        {
            if(grade[i].getStudentid()==id)
            {
                System.out.println("Name : "+stu[i].name);
                System.out.println("ID : "+stu[i].id);
                for(j=0;j<4;j++)
                {
                    System.out.println(grade[i].subname[j] + "      " + grade[i].credits[j] +"      " + grade[i].gr[j] );
                }
            } 
            System.out.println("GPA        " + grade[i].GPA);
            break;
        }

    }
    
    
}
