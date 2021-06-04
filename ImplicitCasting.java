class ImplicitCasting {
    public static void main(String[] args) {
        int i = 35;
        float f = i; // casting up - a float has a larger range than an int
        System.out.println("The number is: " + f);
    }
}