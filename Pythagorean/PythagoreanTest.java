public class PythagoreanTest {
    public static void main(String[] args) {
        int legA = 10;
        int legB = 20;
        Pythagorean testPyth = new Pythagorean();
        double legC = testPyth.calculateHypotenuse(legA, legB);

        System.out.println("Given a = " + legA + " and b = " + legB + ", the hypotenuse = " + legC);
    }
}