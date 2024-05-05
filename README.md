<h1 align="center">
Multiply Processing Mathematical Library
</h1>
<p align="center">
<img src="https://thehope-tech.com/images/posts/middle/2022/12/638da4aa65923.png" alt="AndroidLibray"/>
</p>

[![](https://jitpack.io/v/DoaaMosalam/Multiply_mathematical.svg)](https://jitpack.io/#DoaaMosalam/Multiply_mathematical)
![Message](https://img.shields.io/static/v1?label=Android&message=Library&color=green)

 Multiply processing Mathematical is a Kotlin library made with ❤️.
 It is a comprehensive mathematical library designed to provide various mathematical operations and functionalities for developers across various programming languages and platforms. This versatile library offers a rich set of mathematical tools to support diverse applications, from basic arithmetic calculations to advanced mathematical modeling.

## Preview
<div align="center">
<br/>

<img src="https://github.com/DoaaMosalam/Multiply_mathematical/assets/40686512/a51c9d01-9a4e-42d7-81b1-f1bd2abc8dfc" width="500" height="500"/>

ScreenShoot     

Screen 1          |  screen 2    
:-------------------------:|:-------------------------:
<img src="https://github.com/DoaaMosalam/Multiply_mathematical/assets/40686512/b6a0ca38-1d1c-4908-8508-d7b9c1a0347a" width="600" height="600" />  | <img src="https://github.com/DoaaMosalam/Multiply_mathematical/assets/40686512/4898bd7c-1b46-4ae5-ab5c-78319306c428" width="600" height="600" /> 

Screen 3          |  screen 4    
:-------------------------:|:-------------------------:
<img src="https://github.com/DoaaMosalam/Multiply_mathematical/assets/40686512/dee3980d-2723-4bef-bd85-1294e6714426" width="600" height="600" /> | <img src="https://github.com/DoaaMosalam/Multiply_mathematical/assets/40686512/6ee5b0e0-a705-4544-bccd-bf97ff51b282" width="600" height="600" /> 
</div>
<br/>
<br/>

# Explaining: The mathematical operations in the library
1. Simple arithmetic operations such as (addition, subtraction, multiplication, and division)
2. Advanced arithmetic operations such as (square, sin, cosh and tan)
3. Scalar Multiplication: Multiply the coordinates of a point by a scalar value.
4. Translate: Move a point by a certain offset in the x and y directions.
5. Rotate: Rotate a point around the origin or another point by a given angle.
6. Dot Product: Calculate the dot product of two points, treating them as vectors.
7. Cross Product: Calculate the cross product of two points, treating them as vectors (useful in 3D geometry).
8. Reflect: Reflect a point about a given line or axis.
9. Area of Triangle: Calculate the area of a triangle formed by three points.
10. Polar Coordinates: Convert Cartesian coordinates to polar coordinates and vice versa.
11. Distance to Line: Calculate the shortest distance from the point to a given line.

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
زز
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
MIT License

Copyright (c) 2024 Doaa Mosalam

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
