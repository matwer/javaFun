public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        double a = legA;
        double b = legB;
        double c = Math.hypot(a,b);

        return c;
    }
}

