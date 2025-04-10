public class CheckPrimeNo {
    public static void main(String[] args) {
        int Number = 3;
        boolean isprime = true;
        for (int i = 2; i <= Number / 2; i++) {
            if (Number % i == 0) {
                isprime = false;
                break;
            }
        }
        // System.out.println(isprime);
        System.out.println(isprime ? "prime" : "Not prime.");
    }
}
