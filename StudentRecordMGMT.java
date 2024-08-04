import studentmanagement.Student_;
import studentmanagement.StudentRecordSystemm;
import java.util.*;
public class StudentRecordMGMT {
    public static void main(String[] args) {
        StudentRecordSystemm record = new StudentRecordSystemm();
        Scanner sc = new Scanner(System.in);
        int id,age;
        String name;
        String department;
        

        int ch;
        do{
        System.out.println("Enter your choice");
        System.out.println("(1)Add new student\n(2)get student by id\n(3)Display all student data\n(4)Exit");
        ch = sc.nextInt();
        
        switch(ch)
        {
            case 1:
            System.out.print("Enter ID : ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name : ");
            name=sc.next();
            sc.nextLine();
            System.out.print("Enter Age : ");
            age=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Department : ");
            department = sc.nextLine();
            
            Student_  s  = new Student_(id,name,age,department); 
             record.addStudent(s);
            break;
            case 2:
            System.out.println("Enter student ID : ");
            int sid = sc.nextInt();
            Student_ findstu = record.getStudent(sid);
            if(findstu != null) 
            {
                System.out.println(findstu);
            }
            else
            {
                System.out.println("ID not found");
            }
            break;
            case 3:
            record.displayAllStudents(); 
            break;
            case 4:
            System.out.println("thank you!!....");
            break;
            default:
            System.out.println("Enter valid choice");
            break;

        }
    }while(ch != 4);


        
    }

    
}
