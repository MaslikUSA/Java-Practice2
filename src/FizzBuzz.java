public class FizzBuzz {
    public static void main(String[] args) {
        int i = 0;

        do {
            i++;
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
            } while (i <= 100);
    }
}
