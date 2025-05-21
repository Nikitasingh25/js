// To use methods of interface through implements keyword with the child class 
//Multiple inheritance is achieved through 

interface InnerInterface {
    abstract void print();

    abstract void show();

}

class Dev implements InnerInterface {
    public void print() {
        System.out.println("Bill");
    }

    public void show() {
        System.out.println("please");

    }
}

public class Interface {
    public static void main(String[] args) {
        Dev obj = new Dev();
        obj.print();
        obj.show();

    }

}
