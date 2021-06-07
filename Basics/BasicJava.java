import java.util.ArrayList;
import java.util.Collections;

public class BasicJava {
    // print 1-255
    public void getAll() {
        System.out.println("#1 - Print all numbers from 1 to 255:");

        for (int idx = 1; idx < 256; idx++) {
            System.out.println(idx);
        }
    }

    // print odd numbers between 1-255
    public void getOdds() {
        System.out.println("\n\n#2 - Print odd numbers from 1-255:");

        for (int idx = 1; idx < 256; idx = idx+2) {
            System.out.println(idx);
        }
    }

    // print the sum of numbers from 0 to 255
    public void getSum() {
        System.out.println("\n\n#3 - Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers \nthat have been printed so far:");

        int sum = 0;
        for(int idx = 0; idx < 256; idx++) {
            sum += idx;
            System.out.println("New number: " + idx + " Sum: " + sum);
        }
    } 

    public void getElements(int[] arr) { 
        System.out.println("\n\n#4 - Given an array, write a method that would iterate through each member of the array and \nprint each value on the screen:");

        System.out.println("Given array " + java.util.Arrays.toString(arr) + ":");
        for (int idx=0; idx < arr.length; idx++) {
            System.out.println("...the element at index[" + idx + "] is " + arr[idx]);
        }
    }

    public int getMax(int[] arr) {
        System.out.println("\n\n#5 - Write a method that takes any array and prints the maximum value in the array:");

        int max = arr[0];
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] < 0) {
                if (arr[idx] < max) {
                    max = arr[idx];
                }
            } else if (arr[idx] > max) {
                max = arr[idx];
            }
        }
        return max;
    }

    public int getAve(int[] arr) {
        System.out.println("\n\n#6 - Write a method that takes an array and prints the AVERAGE of the values");

        int sum = 0;
        int ave = 0;
        int len = arr.length;

        for (int idx = 0; idx < arr.length; idx++) {
            sum += arr[idx];
        }
        ave = sum/len;

        return ave;
    }

    public void createArr() {
        System.out.println("\n\n#7 - Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255:");
        ArrayList<Integer> odds = new ArrayList<Integer>();

        for (int idx = 0; idx < 256; idx++) {
            if(idx % 2 != 0) {
                odds.add(idx);
            }
        }
        System.out.println(odds.toString());
    }

    public int getGreaterThan(int[] array, int limiter) {
        System.out.println("\n\n#8 - Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y:");
        int ctr = 0;

        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] > limiter) {
                ctr++;
            }
        }
        return ctr;
    }

    public int[] getSquared(int[] array) {
        System.out.println("\n\n#9 - Given any array, write a method that multiplies each value in the array by itself:");

        for (int idx = 0; idx < array.length; idx++) {
            array[idx] = array[idx] * array[idx];
        }
        return array;
    }

    public int[] removeNegatives(int[] array) {
        System.out.println("\n\n#10 - Given any array, write a method that replaces any negative number with the value of 0:");
        
        int[] noNegs = new int[array.length];

        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] < 0) {
                noNegs[idx] = 0;
            } else {
                noNegs[idx] = array[idx];
            }
        }
        return noNegs;
    }

    public int[] getMinMaxAve(int[] array) {
        System.out.println("\n\n#11 - Given any array, write a method that returns the max value, min value and average of the array:");
        
        int min = 0, max = 0, ave = 0, sum = 0, len = 0;
        len = array.length;
        int[] minMaxAve = new int[3];

        for (int idx = 0; idx < array.length; idx++) {
            sum += array[idx];

            // can I call the getMax() & getAve() methods here? 
            if (array[idx] > max) {
                max = array[idx];
            }
            
            if (array[idx] < min) {
                min = array[idx];
            }
        }
        ave = sum/len;

        minMaxAve[0] = max;
        minMaxAve[1] = min;
        minMaxAve[2] = ave;

        return minMaxAve;
    }

    public ArrayList<Integer> shiftValues(int[] array) {
        System.out.println("\n\n#12 - Given an array, write a method that shifts each number, one by one to the front (replacing any missign numbers with a 0)");
        
        ArrayList<Integer> shifted = new ArrayList<Integer>();

        for (int idx = 1; idx < array.length; idx++) {
            shifted.add(array[idx]);
        }

        return shifted;
    }
}