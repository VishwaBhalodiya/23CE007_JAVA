package studentmanagement;

public class Student_ {
    int id;
    String name;
    int age;
    String department;

   public Student_(int ID, String Name, int Age, String Department) {
        this.id = ID;
        this.name = Name;
        this.age = Age;
        this.department = Department;
    }

    public int getStudentID()
     {
        return id;
    }

    public String getName() 
    {
        return name;
    }

   public int getAge() 
    {
        return age;
    }

    public String getDepartment() 
    {
        return department;
    }
    public String toString()
    {
        return "ID : " + id + "\nName : " + name + "\nAge : " + age + "\nDepartment : " + department ;
    }
    

}