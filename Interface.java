// To use methods of interface through implements keyword with the child class 
//Multiple inheritance is achieved through interface concept
//Abstract classes contain  both normal as we as abstract methods whereas interface contains only abstract methods .

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
