public class Mutablestring {
     static public void main(String[] args) {

        StringBuilder str = new StringBuilder("hello");
        System.out.println(str.capacity());
        str.append("hiiiiii");
        System.out.println(str);

    }
}

