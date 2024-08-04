import gradereportsystem.Students_1;
import gradereportsystem.Grade;
import gradereportsystem.GradingSystem;
import java.util.*;
public class GradingSystemMGMT
{
    public static void main(String[] args) {
        int i;
        GradingSystem system = new GradingSystem();
        Scanner sc = new Scanner(System.in);
        int choice;
        String[] subn = new String[4];
        String[] gr = new String[4];
        int[] credit = new int[4];
        int total_credit= 0;
        do{
        System.out.println("Enter your choice");
        System.out.println("(1)add grades\n(2)calculate GPA\n(3)display report\n(4)exit");
        choice = sc.nextInt();
        switch(choice)
        {

            case 1:
            System.out.print("Enter student ID : ");
            int student_id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name : ");
            String name= sc.nextLine();
            Students_1 s = new Students_1(student_id, name);
            
            system.adStudent(s);
           
            sc.nextLine(); 
            System.out.println(" Your Subjects : (1)DSA (2)JAVA (3)Maths (4)COA ");
            for(i=0;i<4;i++)
            {
                System.out.print("Enter Subject " + (i + 1) +  " : ");
                subn[i] = sc.nextLine();
                sc.nextLine();
                System.out.print("Enter the grade : ");
                gr[i] =sc.nextLine();
                sc.nextLine();
                System.out.print("Enter credit : ");
                credit[i]=sc.nextInt();
                total_credit= total_credit + credit[i];

                sc.nextLine();

            }
           Grade g = new Grade(student_id, subn, gr, credit,total_credit);
           system.addGrade(g);

            
            break;
            case 2:
            System.out.println("Enter your ID : ");
            int ID = sc.nextInt();
            //System.out.println( system.calculateGPA(ID));    ;
              system.calculateGPA(ID);    ;


           
            break;
            case 3:
            System.out.println("Enter id : ");
            int id = sc.nextInt();

            system.display(id);
            break;
            case 4:
            break;
            default:
            System.out.println("Ener valid input");
            break;

        }
    }while(choice!=4);

    }
}