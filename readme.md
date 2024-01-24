## Introduction 

In this repository, you can find all the solutions to the
course: **Selenium WebDriver with Java** from the Test
Automation University. 

In the main branch, we are going to save the same activities
done in the theoretical classes.Each commit is going to have
the name of the class finished (available from chapter 4.2).

Each **Optional Independent Exercise** from each chapter is going to 
have a separate branch.

### Chapter 7
For your optional exercise for this chapter, go to the Context Menu link.
Click on it, and then on this box, do a context click, meaning a right click.
You'll need to use the Actions class in order to do this.
But once you do the right click, you see a pop-up here.


Verify that this text “You selected a context menu” is correct and click the “OK” button on the pop-up.
Once you do that, this context menu will appear. Don't worry about that.
As long as you verify the text and click the “OK” button, then your test is complete.

### Solution
To solve this problem:
* First we add the clickContextMenuPage() in the HomePage.java class
* Created the ContextMenuPage
* Created the By element box
* Created 3 methods:
  * rightClickBox() using WebElement and Actions classes that do the right click in the box
  * alertGetText() that gets the text of the alert
  * acceptAlert() that click the accepted button in the alert.
* The chapter7test package was created
* Finally, the ContextMenuTest.java was created and the test does the following:
  1. Move the mouse to the right box and click the right click
  2. Save the message of the alert
  3. Click on the accept button of the alert
  4. Compare the message of the alert with the message of the alert that we expected.