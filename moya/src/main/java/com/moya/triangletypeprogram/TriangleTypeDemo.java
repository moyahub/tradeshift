package com.moya.triangletypeprogram;

import java.util.InputMismatchException;


/**
 *Output:
 Triangle type is ==>: INVALID
 Triangle type is: EQUILATERAL
 Triangle type is: ISOSCELES
 Triangle type is: ISOSCELES
 Triangle type is side1+side2 > side3 ? : INVALID
 Triangle type is: SCALENE
 Triangle type is side1+side2 > side3 ?: INVALID
 Triangle type is --->: INVALID
 Triangle type is --->: INVALID
 */
public class TriangleTypeDemo {

    public static void main(String[] args) {


        Triangle triangle = new Triangle();
        try {

            // one or more than one side is zero or negative
            System.out.println("Triangle type is ==>: " + triangle.getTriangleType(0,0,0));
            System.out.println("Triangle type is ==>: " + triangle.getTriangleType(5,5,-5));

            // Assumuing that side1, side2 , side3 entered in increasing order when caling getTriangleType() method.
            // Another option is using Scanner class to get user input and collect them in array then use
            // Arrays.sort(arr); and then call the getTriangleType() method.
            // I used System.out.print for clarity purpose we can replaced it with Log

            //EQUILATERAL
            System.out.println("Triangle type is: " + triangle.getTriangleType(5,5,5));

            //ISOSCELES
            System.out.println("Triangle type is: " + triangle.getTriangleType(5,6,5));
            System.out.println("Triangle type is: " + triangle.getTriangleType(5,6,6));
            // The sum of two smaller sides must be greater than the longset
            System.out.println("Triangle type is side1+side2 > side3 ? : " + triangle.getTriangleType(5,5,15));

            //SCALENE
            System.out.println("Triangle type is: " + triangle.getTriangleType(5,6,7));
            System.out.println("Triangle type is side1+side2 > side3 ?: " + triangle.getTriangleType(5,6,17));

            //INVALID length such as '?' , 'A' , Scientific notation such as 2.123E6 or 2.123D6
            System.out.printf("Triangle type is --->: %s%n", triangle.getTriangleType(5, 6, '?'));
            System.out.printf("Triangle type is --->: %s%n", triangle.getTriangleType(5, 6, 'A'));
            System.out.printf("Triangle type is --->: %s%n", triangle.getTriangleType(5,5,2.1d));

        } catch(InputMismatchException ime){
            ime.printStackTrace();
            System.out.println("Obs: It is not valid number. " + ime.getMessage());
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            System.out.println("Obs: It is not valid number. " + nfe.getMessage());
        } catch (IllegalArgumentException iae) {
            iae.printStackTrace();
            System.out.println("You have entered non-positive number ... try again" + iae.getMessage() );
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
