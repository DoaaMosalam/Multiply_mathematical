package com.doaamosallam.unlimateprocessingmath

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.doaamosallam.unlimate_maths.Point
import com.doaamosallam.unlimate_maths.add
import com.doaamosallam.unlimate_maths.cosh
import com.doaamosallam.unlimate_maths.divide
import com.doaamosallam.unlimate_maths.multiply
import com.doaamosallam.unlimate_maths.sin
import com.doaamosallam.unlimate_maths.squareRoot
import com.doaamosallam.unlimate_maths.subtract

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        println("Point is add: ${add(30.0,20.0)}")
        println("subtraction is: ${subtract(100.0,50.0)}")
        println("multiplay is: ${multiply(100.0,50.0)}")
        println("divide is: ${divide(100.0,50.0)}")
        println("squareRoot is: ${squareRoot(100.0)}")
        println("sin is: ${sin(100.0)}")
        println("cosh is: ${cosh(100.0)}")


        println("Point is : ${Point(30.9,32.9).calculatorDistanceT(Point(50.5,60.5))}")
        val point1 = Point(1.0, 2.0)
        val point2 = Point(4.0, 6.0)
        val scalar = 2.0

        println("Scalar Multiplication: ${point1.scalarMultiply(scalar)}")
        println("Translation: ${point1.translate(3.0, 4.0)}")
        println("Rotation: ${point1.rotate(Math.PI / 2)}")
        println("Dot Product: ${point1.dotProduct(point2)}")
        println("Cross Product: ${point1.crossProduct(point2)}")
        println("Area of Triangle: ${point1.areaOfTriangle(Point(0.0, 0.0), Point(3.0, 0.0), Point(0.0, 4.0))}")
        println("Polar Coordinates: ${point1.toPolarCoordinates()}")
        println("Distance to Line: ${point1.distanceToLine(Point(0.0, 0.0), Point(1.0, 1.0))}")


    }
}