import java.util.*;


/*class student implements Comparable<student>{
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

}*/
class student {
    int age;
    int rollno;
    String name;
    public student(int age,int rollno,String name){
        this.age=age;
        this.rollno=rollno;
        this.name=name;
    }
    public String toString()
    {
          return age+" "+rollno+" "+name;
    }

}
class less implements Comparator<student>{
  public int compare(student s1,student s2)
  {
    return s1.name.compareTo(s2.name);
  }
}
public class quest  {
    public static void main(String[] args) {

       /*  ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(18);
        list.add(16);
        list.add(14);
        list.add(15);
        list.add(13);
        Collections.sort(list); // collections.sort built in function is used to sort the arraylist for primitives.
        System.out.println(list);*/
        
        ArrayList<student> list=new ArrayList<>();
        list.add(new student(20, 136,"Nikita"));
        list.add(new student(20,224, "Trisha"));
      /* Collections.sort(list);
        for(student s :list);
        {
            System.out.println(s.toString());
        }*/
            Collections.sort(list,new less());
            for(student s:list)
            {
                System.out.println(s.toString());
            }


        
    }
}

