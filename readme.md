## Introduction 

In this repository, you can find all the solutions to the
course: **Selenium WebDriver with Java** from the Test
Automation University. 

In the main branch, we are going to save the same activities
done in the theoretical classes.Each commit is going to have
the name of the class finished (available from chapter 4.2).

Each **Optional Independent Exercise** from each chapter is going to 
have a separate branch.

### Chapter 11 Application Navigation
For your optional exercise for this chapter, click on the Dynamic Loading link and you will have two links here.

Take either one, maybe let's go with the Example 2, and simulate a right click.

For example, if I were to hold down my command key and click on this link, 
then it would open this in a new tab. 
You may know other shortcuts as well. 
So, if you need to use the Keys or the Action classes to help you out, then do so.

After opening this link in a new tab, switch over to it and verify that the “Start” button is there.

### Solution
To solve this problem:

We have already created the DynamicLoadingPage.java so in that class added the
* Created the openLink2InNewTab() method: that opens the example 2 in a new tab  
* We have already created DynamicLoadingExample2Page.java so we copy in this example and
added the getStartButtonText() that retrieve us the text of the start button
* Created the switchToNewTab() in WindowManager.java that switch to the new tab opened
without giving a tab name.

Finally, the DynamicLoadingNavigationTest.java was created in chapter11exercise package and the test does the following:
1. Enter the page Dynamic Loading page.
2. Perform a CTR+ENTER on the Example 2 link
3. Go to the new tab opened
4. Compare the result of the getStartButtonText() method with "Start," if it fails, the test stops.
If the message is equal, the test passes.