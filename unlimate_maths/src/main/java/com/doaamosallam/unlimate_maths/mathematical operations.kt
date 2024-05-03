package com.doaamosallam.unlimate_maths

import kotlin.math.atan2
import kotlin.math.ln
import kotlin.math.pow
import kotlin.math.sqrt

// Basic mathematical
fun add(num1: Double, num2: Double): Double {
    return num1 + num2
}

 fun subtract(num1: Double, num2: Double): Double {
    return num1 - num2
}

 fun multiply(num1: Double, num2: Double): Double {
    return num1 * num2
}

 fun divide(num1: Double, num2: Double): Double {
    if (num2 == 0.0) {
        throw IllegalArgumentException("Division by zero")
    }
    return num1 / num2
}

 fun squareRoot(num: Double): Double {
    return Math.sqrt(num)
}

 fun sin(angle: Double): Double {
    return kotlin.math.sin(angle)
}

 fun cosh(value: Double): Double {
    return kotlin.math.cosh(value)
}

 fun tan(angle: Double): Double {
    return kotlin.math.tan(angle)
}

 fun log(value: Double): Double {
    return ln(value)
}

 fun exp(value: Double): Double {
    return kotlin.math.exp(value)
}

 fun power(base: Double, exponent: Double): Double {
    return Math.pow(base, exponent)
}

 fun factorial(num: Int): Double {
    var factorial = 1.0
    for (i in 1..num) {
        factorial *= i
    }
    return factorial
}

// Implement memory functions
private var storedResult: Double? = null

 fun storeResult(result: Double) {
    storedResult = result
}

 fun recallResult(): Double {
    return storedResult ?: throw IllegalStateException("No result stored")
}

data class Point(val x: Double, val y: Double) {

    fun calculatorDistanceT(point: Point): Double {
        return sqrt((x - point.x).pow(2) + (y - point.y).pow(2))
    }

    fun midpoint(otherPoint: Point): Point {
        val midX = (x + otherPoint.x) / 2
        val midY = (y + otherPoint.y) / 2
        return Point(midX, midY)
    }

    fun scalarMultiply(scalar: Double): Point {
        return Point(x * scalar, y * scalar)
    }


    fun translate(dx: Double, dy: Double): Point {
        return Point(x + dx, y + dy)
    }

    fun rotate(angleInRadians: Double, origin: Point = Point(0.0, 0.0)): Point {
        val translated = translate(-origin.x, -origin.y)
        val rotatedX =
            translated.x * kotlin.math.cos(angleInRadians) - translated.y * kotlin.math.sin(
                angleInRadians
            )
        val rotatedY =
            translated.x * kotlin.math.sin(angleInRadians) + translated.y * kotlin.math.cos(
                angleInRadians
            )
        return Point(rotatedX, rotatedY).translate(origin.x, origin.y)
    }

    fun dotProduct(other: Point): Double {
        return x * other.x + y * other.y
    }

    fun crossProduct(other: Point): Double {
        return x * other.y - y * other.x
    }



    fun areaOfTriangle(p1: Point, p2: Point, p3: Point): Double {
        return 0.5 * ((p2.x - p1.x) * (p3.y - p1.y) - (p3.x - p1.x) * (p2.y - p1.y))
    }

    fun toPolarCoordinates(): Pair<Double, Double> {
        val r = sqrt(x.pow(2) + y.pow(2))
        val theta = atan2(y, x)
        return Pair(r, theta)
    }

    fun distanceToLine(point1: Point, point2: Point): Double {
        val a = point2.y - point1.y
        val b = point1.x - point2.x
        val c = point2.x * point1.y - point1.x * point2.y
        return kotlin.math.abs(a * x + b * y + c) / sqrt(a.pow(2) + b.pow(2))
    }


    operator fun Point.minus(other: Point): Point {
        return Point(this.x - other.x, this.y - other.y)
    }

    operator fun Point.plus(other: Point): Point {
        return Point(this.x + other.x, this.y + other.y)
    }
}
