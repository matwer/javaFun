public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();

        System.out.println("Trim both input strings and then concatenate them");
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); // HelloWorld
        System.out.println("");

        System.out.println("\nGet the index of the character the first time it appears in a string and return either the index or null");
        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null
        System.out.println("");

        System.out.println("\nGet the index of the start of the substring and return either the index or null");
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulator.getIndexOrNull(word, subString);
        Integer e = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // null

        System.out.println("\nGet a substring using a starting and ending index, and concatenate that with the second string input to our method");
        String sub = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(sub); // eworld
    }
}