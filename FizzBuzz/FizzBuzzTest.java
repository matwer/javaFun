public class FizzBuzzTest {
    public static void main (String[] args) {
        FizzBuzz test = new FizzBuzz();
        for (int i = 1; i < 16; i++) {
            String output = test.fizzBuzz(i);
            System.out.println(output);
        }
    }
}