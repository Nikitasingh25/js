class full{
    String FirstName="Nikita";
    String LastName="Singh";
    void Name()
    {
        System.out.println(FirstName+" "+LastName);
    }
} 
public class MultipleClass {
    public static void main(String[] args) {
        full obj=new full();
        obj.Name();
    }
}
