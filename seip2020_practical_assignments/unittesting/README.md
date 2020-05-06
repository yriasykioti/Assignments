## UnitTesting

The purpose of the second assignment is to get familiar with the tools of unit testing. For the continuous integration I used the services of TravisCI which will test and build the application after every git push.
In order to run all the unit tests of the project, use the command mvn test.

### How to build

1. Java JDK version 1.7(or later) and Maven 3.3(or later) are needed.
2. In the travis.yml, you need to replace in the command - bash <(curl -s https://codecov.io/bash) -t 92fd765d-91fa-4649-b5c9-ea2a3037b130, the number after -t with your token.
3. Use the command mvn clean install jacoco:report in order to build the project.

