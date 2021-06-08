import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Puzzle {

    public ArrayList<Integer> getSum(int[] arr) {
        System.out.println("\nPuzzle #1 - Given array " + Arrays.toString(arr) + ", print the sum of all numbers in the array \nand return an array that only includes numbers greater than 10:");
        
        int sum = 0;
        ArrayList<Integer> results = new ArrayList<Integer>();

        // loop through the array
        for (int idx = 0; idx < arr.length; idx++) {
            // add the value of the current element in the array to sum
            sum += arr[idx];

            // if the value of the current is greater than 10, add it to results
            if (arr[idx] > 10) {
                results.add(arr[idx]);
            }
        }
        
        // print the sum of the array
        System.out.println("...the sum of the array is " + sum + "...");

        //return an ArrayList with values from the original array that are greater than 10 
        return results;
    }

    public ArrayList<String> getNames(String[] arr) {
        System.out.println("\nPuzzle #2 - Given array " + Arrays.toString(arr) + ", shuffle the array, print the name \nof each person and return an array with names over 5 characters:");

        ArrayList<String> shuffled = new ArrayList<String>();
        ArrayList<String> results = new ArrayList<String>();

        // loop through the array
        for (int idx = 0; idx < arr.length; idx++) {
            // add the value of the current element in the array to sum
            shuffled.add(arr[idx]);

            // if the value of the current is greater than 10, add it to results
            if (arr[idx].length() > 5) {
                results.add(arr[idx]);
            }
        }
        
        Collections.shuffle(shuffled);
        // print the sum of the array
        System.out.println("...the shuffled names are " + shuffled.toString() + "...");

        //return an ArrayList with the names that are greater than 5 characters 
        return results;
    }

    public void getChars(char[] alpha) {
        System.out.println("\nPuzzle #3 - Create an array that contains all 26 letters of the alphabet. Shuffle the array and, after shuffling, \ndisplay the first and last letters from the array. If the first letter in the array is a vowel, have it display a \nspecial message:");

        ArrayList<Character> scrambled = new ArrayList<Character>();

        // create an ArrayList with the characters of the alphabet
        for (int idx = 0; idx < alpha.length; idx++) {
            scrambled.add(alpha[idx]);
        }

        // shuffle the ArrayList
        Collections.shuffle(scrambled);
        
        // print the first and last character of the ArrayList
        System.out.println("...the first letter is " + scrambled.get(0) + " and the last letter is " + scrambled.get(25) + "...");

        // display a special message if the first character is a vowel
        if (scrambled.get(0) == 'a') {
            System.out.println("...and the first letter is a vowel...");
        } else if (scrambled.get(0) == 'e') {
            System.out.println("...and the first letter is a vowel...");
        } else if (scrambled.get(0) == 'i') {
            System.out.println("...and the first letter is a vowel...");
        } else if (scrambled.get(0) == 'o') {
            System.out.println("...and the first letter is a vowel...");
        } else if (scrambled.get(0) == 'o') {
            System.out.println("...and the first letter is a vowel..."); 
        }
    }

    public int[] getRandomArray() {
        System.out.println("\nPuzzle #4 - Generate and return an array with 10 random numbers between 55-100:");

        //set up an int[] to hold the random numbers
        int[] ran = new int[10];

        // instantiate the random class
        Random r = new Random();

        for (int idx = 0; idx < ran.length; idx++) {
            // generate an array with 10 random numbers between 55-100
            ran[idx] = r.nextInt(100-55) + 55;
        }

        //return the array
        return ran;
    }

    public ArrayList<Integer> getSortedArray() {
        System.out.println("\nPuzzle #4 - Generate an array with 10 random numbers between 55-100, sort the array, return the sorted array, and \nprint the first and last numbers in the array:");

        //set up an int[] to hold the random numbers
        int[] ran = new int[10];
        ArrayList<Integer> sorted = new ArrayList<Integer>();

        // instantiate the random class
        Random r = new Random();

        for (int idx = 0; idx < ran.length; idx++) {
            // generate an array with 10 random numbers between 55-100
            ran[idx] = r.nextInt(100-55) + 55;
        }

        // create an ArrayList with the characters of the alphabet
        for (int idx = 0; idx < ran.length; idx++) {
            sorted.add(ran[idx]);
        }

        Collections.sort(sorted);

        // print the first and alst element of the array
        System.out.println("...the first number in the sorted array is " + sorted.get(0));
        System.out.println("...the last number in the sorted array is " + sorted.get(9));

        //return the array
        return sorted;
    }

    public void getRandomString() {
        System.out.println("\nPuzzle #6 - Create a random string that is 5 characters long:");
        char[] str = new char[5];
        Random rnd = new Random();
        
        for (int idx = 0; idx < str.length; idx++) {
            char c = (char) ('a' + rnd.nextInt(26));
            str[idx] = c;
        } 

        System.out.println("...the random string is " + Arrays.toString(str) + "...");
    }

    public void getRandomArrayOfStrings() {
        System.out.println("\nPuzzle #7 - Generate an array with 10 random strings that are each 5 characters long");
        
        char[] str = new char[5];
        Random rnd = new Random();

        for (int ctr = 0; ctr < 10; ctr++) {
            for (int idx = 0; idx < str.length; idx++) {
                char c = (char) ('a' + rnd.nextInt(26));
                str[idx] = c;
            } 
            System.out.println("...the random string is " + Arrays.toString(str) + "...");
        }
    }
}