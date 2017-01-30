package com.moya.triangletypeprogram;

import java.util.*;
/**
 *
 */
public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    //constructor
    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {

        if (side1<=0.0 || side2<=0.0 || side3<=0.0) throw new IllegalArgumentException("triangle length or sides can not be negative or zero...");
        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    // getter and setter methods
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // helper method
    public TriangleType getTriangleType(double side1, double side2, double side3)
            throws IllegalArgumentException, NumberFormatException, InputMismatchException, Exception {

            if (side1<=0.0 || side2<=0.0 || side3<=0.0) {
                return TriangleType.INVALID;
            }

            //Spcial case: The sum of two smaller sides must be greater than the longest (side1+side2 > side3)
            //Equilateral Triangle:  three equal sides and three equal angels are 60 degree
            if ( (side1 == side2) && (side2 == side3) ) {
                return TriangleType.EQUILATERAL;

            // Isosceles Triangle : two equal sides and two equal angels
            }else if ((side1 == side2 && side2 != side3  ||
                       side2 == side3 && side3 != side1  ||
                       side1 == side3 && side1 != side2) && side1+side2 > side3) {
                    return TriangleType.ISOSCELES;

            // Scalene Triangle: No equal sides
            } else if (side1 != side2 && side2 != side3 && side1+side2 > side3) {
                return TriangleType.SCALENE;
            }
            else {
                return TriangleType.INVALID;
            }
   }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
