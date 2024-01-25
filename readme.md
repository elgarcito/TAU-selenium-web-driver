## Introduction 

In this repository, you can find all the solutions to the
course: **Selenium WebDriver with Java** from the Test
Automation University. 

In the main branch, we are going to save the same activities
done in the theoretical classes.Each commit is going to have
the name of the class finished (available from chapter 4.2).

Each **Optional Independent Exercise** from each chapter is going to 
have a separate branch.

### Chapter 9 Wait Strategies exercise
1. For your optional exercise, click on the Dynamic Loading page from the application home page
2. And this time click “Example 2” where the element is rendered after the fact
3. Click on the “Start” button

This looks like a similar scenario to the one we've done. 
However, this text is not in the DOM until the loading indicator has disappeared.
So, figure out what's the best strategy to use for this scenario.
But the catch is I want you to wait until this “Hello World!” is available. 
So, I don't want you to use the waiting strategy on the loading indicator, but on this text itself.

### Solution
### Solution
To solve this problem:
* First we add the clickDynamicLoadingPage() in the HomePage.java class
* Created the clickExample2() in DynamicLoadingPage.java 
* Created the DynamicLoadingExample2Page.java
* Created the By elements: startButton, finishMessage
* Created 2 methods:
    * clickStartButton() using WebElement and click. This clicks the start button.
  and wit FluentWait waits untilt the text appears. This uses the 
  ExpectedConditions.visibilityOf(driver.findElement(finishMessage))
    * getLoaderText() that gets the text of the message that appears
* The chapter9test package was created
* Finally, the WaitTestExample2.java was created in that package and the test does the following:
    1. Enter the page Dynamic Loading 
    2. Click example 2
    3. Click on the start button
    4. Wait until a message appears on screen and get the message.
    5. Compare the message retrieved with the 'Hello world!' message that we expected.
    6. If both messages are equals the test pass, otherwise the test fails. 