package com.moya.triangletypeprogram;

/**
 *  Classifying triangletype in 4 category by their side
 *  EQUILATERAL, ISOSCELES, SCALENE,   // triangle's classified by their side
 *
 *  we can also add for feature by using following:
 *  ACUTE, RIGHT, OBTUSE, //triangle's classified by their angel
 *  RIGHTISOSCELES,       //Combining the Names RIGHT and ISOSCELES: Has a right angle (90°), and also two equal angles
 *  INVALID
 *
 *  or we can develope ShapeType which includes ShapeType such as RECTANGLE, CIRCLE, SQUARE, TRIANGLE,
 *  and all the above triangle type. and let the class Shape be defined as abstract:
 *  abstract class Shape{ with minimum one method defined as abstract ...} and then
 *  Triangle and the others shape types is defined as subclass of Shape that is:
 *  class Triangle extends Shape {... must implements all abstract methods ...}
 */
public enum TriangleType {
    EQUILATERAL, ISOSCELES, SCALENE,   // triangels classified by their side
    INVALID,
    TRIANGLE_IS_NOT_POSSIBLE
}
