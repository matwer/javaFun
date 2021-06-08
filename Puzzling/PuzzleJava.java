import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public static void main(String[] args) {

        Puzzle p = new Puzzle();

        // 1st Puzzle
        int[] puzzle1 = {3,5,1,2,7,9,8,13,25,32};
        System.out.println("...the new array with values over 10 is " + p.getSum(puzzle1).toString() + "...");

        // 2nd puzzle
        String[] puzzle2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        System.out.println("...the list of names with more than 5 characters is " + p.getNames(puzzle2).toString() + "...");

        // 3rd puzzle
        char[] puzzle3 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        p.getChars(puzzle3);

        // 4th puzzle
        System.out.println("...the array is " + Arrays.toString(p.getRandomArray()));

        // 5th puzzle
        System.out.println("...the array is " + p.getSortedArray().toString());

        // 6th puzzle
        p.getRandomString();

        // 7th puzzle
        p.getRandomArrayOfStrings();
    }
}