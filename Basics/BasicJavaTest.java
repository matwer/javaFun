import java.util.ArrayList;

public class BasicJavaTest {
    public static void main(String[] args) {
        // instantiate a BasicJava object & use it to call the 
        // desired methods
        BasicJava loops = new BasicJava();

        // a method that prints all the numbers from 1 to 255
        loops.getAll();

        // a method that prints all the odd numbers from 1 to 255
        loops.getOdds();

        // a method that prints the numbers from 0 to 255 and the  
        // sum of the numbers printed so far
        loops.getSum();

        // iterate through an array and print the value of each member
        // to the screen
        int[] x = {1,3,5,7,9,13};
        loops.getElements(x);

        // a method (sets of instructions) that takes any array and 
        // prints the maximum value in the array (the method needs to  
        // work with any numbers (positive, negative and/or zero)
        int[] test1 = {-3,-5,-7};
        System.out.println("Given array " + java.util.Arrays.toString(test1) + ", the max value in the array is " + loops.getMax(test1));
        
        int[] test2 = {-3,-5,-7,0};
        System.out.println("Given array " + java.util.Arrays.toString(test2) + ", the max value in the array is " + loops.getMax(test2));

        int[] test3 = {-3,-5,-7,0,1,3,5,7};
        System.out.println("Given array " + java.util.Arrays.toString(test3) + ", the max value in the array is " + loops.getMax(test3));

        // a methoid that returns the average of the members of an array
        int[] ave = {2,10,3};
        System.out.println("Given array " + java.util.Arrays.toString(ave) + ", the average of the numbers in the array is " + loops.getAve(ave));

        // a method that creates an array with odd numbers from 1 to 255 
        loops.createArr();

        // a method that takes an array and returns the number of values 
        // in that array whose value is greater than a given value y
        int[] test4 = {1,3,5,7};
        int y = 3;
        int z = loops.getGreaterThan(test4,y);
        System.out.println("Given array " + java.util.Arrays.toString(test4) + " with y = " + y + ", the number of elements greater than " + y + " is " + z);

        // a method that returnms the square of each element in the array
        int[] test5 = {1,5,10,-2};
        int[] squares = loops.getSquared(test5);
        // why is test5 getting overwritten with squares in the print statement? it doesn't happen for any other method...
        System.out.println("\n\nGiven array " + java.util.Arrays.toString(test5) + " ,the squared array is " + java.util.Arrays.toString(squares));

        // a method that replaces any negative number with the value of 0
        int[] test6 = {1, 5, 10, -2, 6, -5, 17};
        int[] noNegs = loops.removeNegatives(test6);
        System.out.println("Given array " + java.util.Arrays.toString(test6) + " ,the new array is " + java.util.Arrays.toString(noNegs));

        // a method that returns the min, max and ave of an array
        int[] test7 = {1,5,10,-2};
        int[] minMaxAve = loops.getMinMaxAve(test7);
        System.out.println("Given array " + java.util.Arrays.toString(test7) + " , the new array[max,min,ave] is " + java.util.Arrays.toString(minMaxAve));

        // a method that makes no sense...
        int[] test8 = {1,5,10,7,-2};
        ArrayList<Integer> shift = new ArrayList<Integer>();
        shift = loops.shiftValues(test8);
        System.out.println("\n\nGiven array " + java.util.Arrays.toString(test8) + ", the shifted array is " + shift.toString());


    }
}
