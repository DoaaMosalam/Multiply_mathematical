<h1 align="center">
Multiply Processing Mathematical library
</h1>
<p align="center">
<img src="https://thehope-tech.com/images/posts/middle/2022/12/638da4aa65923.png" alt="AndroidLibray"/>
</p>

[![](https://jitpack.io/v/mohamedtamer0/Compose-Curved-Scroll-library.svg)](https://jitpack.io/#mohamedtamer0/Compose-Curved-Scroll-library)
![Message](https://img.shields.io/static/v1?label=Android&message=Library&color=green)

Multiply processing mathematical is a Kotlin library made with ❤️.

## Preview
<div align="center">
<br/>

![img_4](https://github.com/DoaaMosalam/Multiply_mathematical/assets/40686512/a51c9d01-9a4e-42d7-81b1-f1bd2abc8dfc)
</div>
<br/>
<br/>


# Installation

## Step 1: Add jitpack in your `settings.gradle`(project)
```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri ("https://jitpack.io") }
    }
}
```

## Step 2: Add the dependency in your `build.gradle`(app)

```groovy
dependencies {
    ...
      implementation ("com.github.DoaaMosalam:Multiply_mathematical:1.0.0")
}
```

# Getting Started

## Prepare your data: you can call the mathematical operation you want.
```Kotlin
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
```

# License
```
