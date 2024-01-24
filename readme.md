## Introduction 

In this repository, you can find all the solutions to the
course: **Selenium WebDriver with Java** from the Test
Automation University. 

In the main branch, we are going to save the same activities
done in the theoretical classes.Each commit is going to have
the name of the class finished (available from chapter 4.2).

Each **Optional Independent Exercise** from each chapter is going to 
have a separate branch.

### Chapter 8 Nested Frames
For your option independent exercise, go to the-internet page and click on the Frames link.
Then click on the Nested Frames link and verify two of these frames.
The two that I would like for you to verify is the left frame and then also the bottom frame, but do these both inside of one test.
So, your test should click to this page, and then verify that the text inside of this particular frame says "Left" 
and that the text inside of this particular frame says "Bottom".

### Solution

To solve this problem:
* First we add the clickNestedFramesPage() in the HomePage.java class
* Created the NestedFramesPage.java
* Doe that we have to use switchTo() we created 3 String to access each frame:
  * frameBottom, frameTop, frameUpperLefInsideFrameTop
* Created a By body to access by tagName() to the body in each html frame.
* Created 4 methods:
  * witchToFrame(String frameId) that get inside a frame with it id
  * leaveFrame() that get back to the parent frame
  * getTextFromBottom() that get the text from the bottom frame using the previous methods.
  * getTextFromUpperLeft() that get the text from the upper left frame using the previous methods.
* The chapter8test package was created
* Finally, the NestedFramesTest.java was created and the test does the following:
  1. Get the text from the bottom and compare it to the BOTTOM word.
  2. Get the text from the upper left and compare it to the LEFT word.