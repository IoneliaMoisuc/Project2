 package org.example;
public class Main {
    public static void main(String[] args) {
        printMyName();
        printSum();
        printDivision();
        printCalcul();


        System.out.println("Rezultatul adunarii este: " + addition(5,3));
        System.out.println("Rezultatul scaderii este: " + substraction(5,3));
        System.out.println("Rezultatul inmultirii este: " + multiplication(5,3));
        System.out.println("Rezultatul impartirii este: " + division(5,3));
        System.out.println("Media celor trei numere este: " + average(3,5,4));
        System.out.println("Restul impartirii a doua numere este: " + reminder(15,6));
        System.out.println("Rezultatul convertirii temperaturii din Faherenheit in Celsius este: " + covertFahrenheitToCelsius(131));
        System.out.println("Rezultatul convertirii din inchi in metri este: " + covertdistance(5));
    }



    //1. For the exercises in the main() class from last time, create separate methods for each,
    // still in the Main.java class, and then call them in the main() method.

    public static void printMyName() {
        System.out.println("Buna");
        System.out.println("Ionelia");
    }
    public static void printSum (){
        int x = 5 + 3;
        System.out.println(x);
    }
    public static void printDivision (){
        float y = (float) 8 / 3;
        System.out.println(y);
    }
    public static void printCalcul(){
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c =  20 + -3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }



    //2. Write a Java method for each of the following mathematical operations: addition, subtraction, multiplication, and division.
    //Each method should take two number parameters, perform the operation, and return the result.
    // Then call the method in main with the values you want to operate with.

    public static int addition(int firstNum, int secondNum){
       int result = firstNum + secondNum;
       return result;
    }
    public static int substraction(int firstNum, int secondNum){
        int result = firstNum - secondNum;
        return result;
    }
    public static int multiplication(int firstNum, int secondNum){
        int result = firstNum * secondNum;
        return result;
    }
    public static float division(float firstNum, float secondNum){
        float result = firstNum / secondNum;
        return result;
    }



    //3. Write a Java method that takes 3 number parameters and returns the average of the numbers.

    public static int average(int num1, int num2, int num3){
        int result = (num1 + num2 + num3) /3;
        return result;
    }




    //4. Write a Java method that returns the remainder of the division of two numbers.

    public static int reminder(int num1, int num2){
        int remainder = num1 % num2;
        return remainder;
    }



//5. Write a Java method that takes a number parameter representing the temperature in Fahrenheit,
// and returns the temperature in Celsius.
// The conversion formula is: C = 5/9 * (F - 32)

    public static double covertFahrenheitToCelsius(double fahrenheit) {
        return (double ) 5/9 * (fahrenheit - 32);
    }




//6. Write a Java method that takes a real number parameter
// representing the distance in inches, and returns the distance in meters.

    public static double covertdistance( double inches) {
        final double meters = inches * 0.0254;
        return meters;
    }

}