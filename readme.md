## Introduction 

In this repository, you can find all the solutions to the
course: **Selenium WebDriver with Java** from the Test
Automation University. 

In the main branch, we are going to save the same activities
done in the theoretical classes.Each commit is going to have
the name of the class finished (available from chapter 4.2).

Each **Optional Independent Exercise** from each chapter is going to 
have a separate branch.

### Chapter 5 and 6 
For your optional exercise for this chapter, 
click on the Horizontal Slider link on the home page of The 
Internet site,You'll see this numeric slider here.
You're going to sendKeys to this slider until it gets to the number 4. 
And then you'll verify that this text actually equals 4.
To actually move this slider, you'll just need to send some arrow keys to the slider itself.
So, send enough of those arrow keys to get to the number 4.
Good luck!

### Solution
The class HorizontalSliderPage.java contains the method to achieve this. 
Also in the HomePage.java class, we can find the method to access this page.
Finally, the test is in the sliderPackage in the SliderTest.java class, there
you can try with different values and see if the result is what you expected.