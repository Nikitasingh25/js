public class PrintSmallLetters {
    static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int ch = (int) (arr[i].charAt(0) + 32);
            System.out.println((char) ch);

        }
        /*
         * for(String i:arr)
         * {
         * System.out.println(i);
         * }
         * System.out.println((char)(ch+32));
         */
    }

    public static void main(String[] args) {
        String[] str = { "B", "A", "C" };

        print(str);

    }
}
