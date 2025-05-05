
class constructor
{public:
   String name="Nikita";
   int rollno=136;
   constructor(String n,int r)
   {
      name=n;
      rollno=r;
      System.out.println("Student display "+name+" "+rollno);

   }
}
public class construct {
   public static void main(String[] args) {
     constructor obj=new constructor("Trisha",224);
      System.out.println(obj.name);

   } 
}
