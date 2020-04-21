# SEIP2020 Practical Assignments

The purpose of this repository is to deliver all my practical assignments which are written in Java for my course of Software Engineering in Practice.
[HistogramGenerator](##HistogramGenerator)
[UnitTesting](##UnitTesting)

## HistogramGenerator

The purpose of the first assignment is to make a parent Maven project and a module in order to get familiar with Maven and create an executable jar. The executable jar will read a file with grades from cmd and will generate a histogram with the grades' frequencies.
In order to make a fat jar, I added the maven-assembly-plugin in the pom.xml of the module.

### How to build
1. Set up Maven
2. Clone the repository 
3. Use the command mvn package in order to make a jar file 
4. java -jar histogramgenerator/target/histogramgenerator-0.0.1-SNAPSHOT-jar-with-dependencies.jar "the path and the name of the file with the grades" 

## UnitTesting

The purpose of the second assignment is to get familiar with unit testing. 
1. The ArithmeticOperationsTest class is used to test the exceptions that should be thrown at the multiply and divide methods.
2. The MyMath_factorial_Parameterized class tests the functionality of the factorial method.
3. The MyMathTest class tests the exceptions that should be thrown at the factorial method.
4. The MyMathTestSuite class is a test suite for MyMath_factorial_Parameterized and MyMathTest classes.






