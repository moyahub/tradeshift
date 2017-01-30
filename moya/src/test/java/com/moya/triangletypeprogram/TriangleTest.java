package com.moya.triangletypeprogram;

import com.moya.triangletypeprogram.Triangle;
import com.moya.triangletypeprogram.TriangleType;
import junit.framework.TestCase;

/**
 * Test Assumaptions: I think there is no correct answer to any testing problem. It depends on assumptions and
 * judgement that test planner makes:
 *
 * Minimal test:
 * -invalid input vaule such as string character like "A" or special character like "?"
 * -sides or length of a triangle can not be zero or negative number
 * -The sum of the two sides must be greater than the longest
 */
public class TriangleTest extends TestCase {

    public void testGetTriangleType() throws Exception {
        Triangle triangle = new Triangle();

        assertEquals("EQUILATERAL", TriangleType.EQUILATERAL, triangle.getTriangleType(5,5,5));
        System.out.println("TriangleType is: EQUILATERAL");

        assertEquals("ISOSCELES", TriangleType.ISOSCELES, triangle.getTriangleType(5,5,6));
        System.out.println("TriangleType is: ISOSCELES");

        assertEquals("SCALENE", TriangleType.SCALENE, triangle.getTriangleType(5,6,7));
        System.out.println("TriangleType is: SCALENE");

        // length is zero or negative
        assertEquals("INVALID", TriangleType.INVALID, triangle.getTriangleType(5,5,0));
        System.out.println("TriangleType is: INVALID, length is zero");

        assertEquals("INVALID", TriangleType.INVALID, triangle.getTriangleType(5,5,-5));
        System.out.println("TriangleType is: INVALID, length is negative number");

        // The sum of two smaller sides must be greater than the longest
        System.out.println("Triangle type is side1+side2 > side3 ? : " + triangle.getTriangleType(5,5,15));

        // length is a character like 'A' , '?'
        assertEquals("INVALID", TriangleType.INVALID, triangle.getTriangleType(5,5,'A'));
        System.out.println("TriangleType is: INVALID, length is a character like 'A' and not same as number");

        assertEquals("INVALID", TriangleType.INVALID, triangle.getTriangleType(5,5,'?'));
        System.out.println("TriangleType is: INVALID, length is a character like '?' and not same as number");
    }
}