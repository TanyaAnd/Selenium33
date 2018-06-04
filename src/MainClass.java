import org.junit.Assert;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main (String[] args)
    {
        Methods methods = new Methods();

        int a = 324;
        int b = 4756;
        int[] mass = new int[10];
        int[] mass1 = {1,2,3,4,5,2,3,2};
        double[] mass2 = {30.5,32.5,33.6,31.5};
        int[] mass3 = {4,3,3,0,5,0,3,2};
        int[] mass4 = {-1,-2,3,-4,5,2,3,2};
        int[] mass5 = {-1,-2,3,4,5,2,0,0,0,0,0,0};
        int[] mass6 = {5,4,7,6,11,12};
        int[] mass7 = {2,12,3,3,4,4,12,5,5};

        List chess = new ArrayList();
        chess.add (new Queen());
        chess.add (new Queen());
        chess.add (new King());
        chess.add (new Knight());

        for(Object c: chess)
        {
            if(c instanceof ChessClass)
            {
                ChessClass chessF = (ChessClass) c;
                try
                {
                    chessF.drawChess();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }

        int sum = methods.sumTwoNumbers(a,b);
        //Assert.assertEquals("Is not equil", 15, sum);
        Assert.assertEquals("Is not equil", -2, methods.sumTwoNumbers(-1,-1));
        Assert.assertEquals("Is not equil", 29, methods.sumTwoNumbers(-1,30));
        System.out.println("The sum of two numbers is: " + sum);
        System.out.println("");

        int division = methods.divideTwoNumbers(a,b);
        System.out.println("The division of two numbers is: " + division);
        System.out.println("");

        int minNumbers = methods.minNumbers(a,b);
        Assert.assertEquals("Error detected", 0, methods.minNumbers(0, 1));
        Assert.assertEquals("Error detected", -3, methods.minNumbers(-2, -3));
        System.out.println("The min number is: " + minNumbers);
        System.out.println("");

        System.out.println("Homework1 > 1 task: The factorial number is: " + methods.getFactorial(3));
        System.out.println("");

        System.out.println("Homework1 > 2 task: The distance number is: " + methods.getDistance(2, 4, 4, 8));
        System.out.println("");

        System.out.println("Homework1 > 3 task: Makes a triangle: " + methods.isTriangle(7,10,5));
        System.out.println("");

        methods.getRectangularTriangle(5);
        System.out.println("");

        System.out.println("Homework1 > 5 task: The Body Mass Index (BMI) is: " + methods.getBodyMassIndex(54.0, 1.7));
        System.out.println("");

        boolean SameNumbers = methods.isSameNumbers(769);
        System.out.println("Homework1 > 6 task: The algorithm to define the same numbers: " + SameNumbers);
        System.out.println("");

        System.out.println("Homework1 > 7 task: How many liters of water in my pool? " + methods.fillThePool(5, 6, 7));
        System.out.println("");

        System.out.println("Homework1 > 8 task: The number of students that didn't pass the first exam is " + methods.getLoosers(mass1));
        System.out.println("");

        System.out.println("Homework1 > 9 task: The best bank in the city is the bank with exchange rate: " + methods.getExchangeRate(mass2));
        System.out.println("");

        methods.printHelloGuys(5, "Hello Guys :)");
        System.out.println("");

        System.out.println("Homework1 > 11 task: The sum of min and max numbers is " + methods.sumOfMinAndMax(5,3,7));
        System.out.println("");

        System.out.println("Homework1 > 12 task: The area of triangle is " + methods.triangle(4,5,6));
        System.out.println("");

        System.out.println("Homework1 > 13 task: The area of hexagon is " + methods.hexagon(5));
        System.out.println("");

        System.out.println("Homework1 > 14 task: The sum of odd factorials is " + methods.getSumFactorial());
        System.out.println("");

        System.out.println("Homework1 > 15 task: The price with discount is " + methods.returnDiscount(1500));
        System.out.println("");

        methods.fillArray(mass);
        System.out.println("");

        System.out.println("Homework2 > 1 task: The min number among two numbers is " + methods.minNumber(2,5));
        System.out.println("");

        int sumOfEl = methods.sumOfElements(mass, 4);
        System.out.println(sumOfEl);
        System.out.println("");

        System.out.println("Homework2 > 3 task: The array of zero indexes is " + methods.getArrayFromIndex(mass3));
        System.out.println("");

        System.out.println("Homework2 > 4 task: The first number in array is " + methods.getPositiveOrNegativeNumber(mass4));
        System.out.println("");

        boolean flag = methods.isSorted(mass1);
        System.out.println(flag);
        System.out.println("");

        System.out.println(methods.getArrayFromEvenNumbers(mass3).isEmpty()? "Homework2 > 6 task: The array of even numbers is empty" :
                "Homework2 > 6 task: The array of even numbers: " + methods.getArrayFromEvenNumbers(mass3));
        System.out.println("");

        System.out.println("Homework2 > 7 task: The amount of replacement in array is " + methods.amountOfReplacement(mass3, 3));
        System.out.println("");

        System.out.println("Homework2 > 8 task: The number of negatives " + methods.getAmountOfPositiveAndNegativeAndZeroNumbers(mass5)[0]);
        System.out.println("Homework2 > 8 task: The number of positives " + methods.getAmountOfPositiveAndNegativeAndZeroNumbers(mass5)[1]);
        System.out.println("Homework2 > 8 task: The number of zeros " + methods.getAmountOfPositiveAndNegativeAndZeroNumbers(mass5)[2]);
        System.out.println("");

        System.out.println("Homework2 > 9 task: The swapped array numbers are :");
        for (int i : methods.replaceMinNumberWithMax(mass1))
        {
            System.out.println(i);
        }

        System.out.println("Homework2 > 10 task: The new index_array is " + methods.indexArray(mass1));
        System.out.println("");

        System.out.println("Homework2 > 11 task: The new  remainder_array is " + methods.remainderArray(mass6, 2,1));
        System.out.println("");

        System.out.println("Homework2 > 12 task: The new array replacement of adjacent number is ");
        for (int i : methods.replaceAdjacentNumber(mass6))
        {
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("Homework2 > 13 task: The new array that consists of all numbers before zero is " + methods.getAllNumbersBeforeZero(mass5));
        System.out.println("");

        System.out.println("Homework2 > 14 task: The sum of min and max numbers: " + methods.sumOfMinAndMax(mass));
        System.out.println("");

        long multipleOfElements = methods.multiple(mass, 52);
        System.out.println(multipleOfElements);

        methods.zeroReplacement(mass1);
        System.out.println("");

        System.out.println("Homework2 > 17 task: The max of two modules is: " + methods.biggerSumOfNumbers(mass4));
        System.out.println("");

        System.out.println("Homework2 > 18 task: The first max number in the array is changed to zero: ");
        for (int i : methods.getFirstMax(mass7))
        {
            System.out.println(i);
        }
        System.out.println("");

        methods.arrayWhichEndsOnNumber(mass,2);
        System.out.println("");
    }
}
