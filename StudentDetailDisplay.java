    
class Student{
    String Name;
    long Roll;
    int Marks;
    void Details()
    {
        System.out.println("Name "+Name);
        System.out.println("Roll "+Roll);
        System.out.println("Marks "+Marks);
    }
}
public class StudentDetailDisplay {
    public static void main(String[] args) {
        Student obj=new Student();
        System.out.println("For Student 1 = ");
        obj.Name="Nikita Singh";
        obj.Roll=136;
        obj.Marks=100;
        obj.Details();
        System.out.println("For student 2 = ");
        obj.Name="Trisha Thakur";
        obj.Roll=224;
        obj.Marks=100;
        obj.Details();
        System.out.println("For student 3 = ");
        obj.Name="Abhya puri";
        obj.Roll=11;
        obj.Marks=100;
        obj.Details();

    }
}



