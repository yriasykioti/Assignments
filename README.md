# SEIP2020 Practical Assignments

[![Build Status](https://travis-ci.com/yriasykioti/Assignments.svg?token=fxVCNPq89k4nXsgNxnUP&branch=development)](https://travis-ci.com/yriasykioti/Assignments)

The purpose of this repository is to deliver all my practical assignments which are written in Java for my course of Software Engineering in Practice.
i
## HistogramGenerator

The purpose of the first assignment is to make a parent Maven project and a module in order to get familiar with Maven and create an executable jar. The executable jar will read a file with grades from cmd and will generate a histogram with the grades' frequencies.
In order to make a fat jar, I added the maven-assembly-plugin in the pom.xml of the module.

### How to build
1. Set up Maven
2. Clone the repository 
3. Use the command mvn package in order to make a jar file 
4. java -jar histogramgenerator/target/histogramgenerator-0.0.1-SNAPSHOT-jar-with-dependencies.jar "the path and the name of the file with the grades" 

## UnitTesting

The purpose of the second assignment is to get familiar with the tools of unit testing. For the continuous integration I used the services of TravisCI which will test and build the application after every git push.
In order to run all the unit tests of the project, use the command mvn test.

### How to build

1. Java JDK version 1.7(or later) and Maven 3.3(or later) are needed.
2. Use the command mvn clean install jacoco:report in order to build the project.








