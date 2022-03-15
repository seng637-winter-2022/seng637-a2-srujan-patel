**SENG 637 - Dependability and Reliability of Software Systems**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:  08     |     |
| --------------    | --- |
| Student Names:    |     |
|Mit Patel          |     |
|Dishantkumar Patel |     |
|Srujan Patel       |     |
|Jairath Chopra     |     |
# 1 Introduction
-Unit testing is a software development technique in which the smallest testable pieces of a program, referred to as units, are examined separately and independently for proper operation. Software developers and, on occasion, QA employees use this testing methodology during the development process. Unit testing's major goal is to separate written code to test and verify if it works as intended.
- Unit testing is a crucial phase in the development process because, if done correctly, it can assist uncover early defects in code that would otherwise be difficult to find in later stages of testing.
- JUnit is a Java programming language unit testing framework. A computer program's smallest functional module is called a unit. These are frequently presented in the form of a procedure. As a result, JUnit is frequently used to test the functionality of single methods.
- This concept has found a home in unit testing, where mock objects are produced to resemble real things in a controlled manner. Mock objects are a programmatically constructed mimicked version of the original object that is used to test the behavior of another object.
- Mockito is one of the most well-known mocking frameworks available on the Java market. Recently, unit testing with mocking frameworks has shown to be quite useful. Mockito has evolved into a distinct and substantial mocking framework over time.

# 2 Detailed description of unit test strategy

- In the assignment we used Mockito for creating the mock objects.
- At first, we did sort of exploratory testing. In the initial part, we tested the methods for the nominal values inputs present in the function domain. In this bugs were encountered in getCumulativePercentages(KeyedValues data) and calculateRowTotal(Values2D data, int row) methods of DataUtilities class while no bugs were encountered in Range Class. 

![alt text](media/img1.png)
![alt text](media/img2.png)

- In the next phase of testing we encountered we tested the SUT at the boundaries ie at values close to null and large values. In this phase, one more bug is found in the method calculateRowTotal(Values2D data, int row, int[] col) and four more bugs are encountered in four methods of Range class.

![alt text](media/img3.png)
![alt text](media/img4.png)
# 3 Test cases developed
The test cases can be inferred from the test folder of the project file

# RangeTest methods:
shiftTest()
isNaNRangeTest()
expandToIncludeTest()
combineIgnoringNaNTest()
intersectsTest()

# DataUtilities methods:
testcalculateColumnTotal_1()
testcalculateRowTotal_1()
testcalculateColumnTotal_2()
testcalculateRowTotal_2()
getCumulativePercentages()

# 4 How the team work/effort was divided and managed
We are four group members in this course. Firstly, we read whole assignment and discussed what should we do to complete this assignment and we all understood about different types of testing frameworks unit testing. Srujan has created repository in git hub and sent invitation link to others. We shared test cases among us. Every member did one test case from Range class and one from DataUtilities Class
# 5 Difficulties encountered, challenges overcome, and lessons learned

We didn’t encounter much trouble in doing testing. Through the lab we learned how to do testing in a structured manner and got to know how the whole process is executed by industry professionals.
# 6 Comments/feedback on the lab itself

The lab proved to be very informative exerciser in terms of an introductory exercise to writing unit tests using junit and using test frameworks like Mockito