
import java.util.*;
class student implements Comparable<student>{
    int age;
    String name;
    public student(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    public String  toString(){
        return age+" "+name;
    }
    public int compareTo(student s)
    {
          return this.age-s.age;
    }

}


public class quest1 {
    public static void main(String[] args) {
         ArrayList<student> list=new ArrayList<>();
        list.add(new student(20, "Nikita"));
        list.add(new student(20, "Trisha"));
        Collections.sort(list);
        for(student s:list)
        {
            System.out.println(s.toString());
        }
    }
}
