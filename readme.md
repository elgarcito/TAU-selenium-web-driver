## Introduction 

In this repository, you can find all the solutions to the
course: **Selenium WebDriver with Java** from the Test
Automation University. 

In the main branch, we are going to save the same activities
done in the theoretical classes.Each commit is going to have
the name of the class finished (available from chapter 4.2).

Each **Optional Independent Exercise** from each chapter is going to 
have a separate branch.

### Chapter 10 Using JavaScript
For your optional exercise for this chapter,
go to the Dropdown link, and we're going to use JavaScript to change this element.
If we inspect this element, we can get the JSpath, here.


That's just so I can show you what this looks like in the dev tools. If I do this, 
I can get the element, but we already know how to get the element in Selenium WebDriver.
Don't copy that part.

However, this is the part that I want you to use.
We call setAttribute.
Let's change that dropdown to allow for multiple selections. The way we do that is by adding a multiple attribute to the element.
We can then say “multiple”, and this doesn't take a value, so we'll just leave it blank, and then enter.
Notice this dropdown has now changed so that you can select more than one option.

In your test automation code:
Add JavaScript to change that dropdown, and then select both Option 1 and Option 2

In your test, verify that you have those two selected, and that they're “Option 1” and “Option 2”

Javascript script given:

arguments[0].setAttribute('multiple', '')

### Solution
To solve this problem:

We have already created the DropdownPage.java so in that class
* Created the By elements: option1,option2
* Created 3 methods:
  * javaScriptSelectMultiple(): This uses a javaScript script and the dropdown By previously created.
  This method allows us to have available the two options
  * getOptionOneText(): retrieves the text of the option one to compare later (can only be used
  after javaScriptSelectMultiple() is called)
  * getOptionTwoText(): retrieves the text of the option two to compare later (can only be used
      after javaScriptSelectMultiple() is called)
* Finally, the DropDownWithJavaScriptTest.java was created in javascript package and the test does the following:

1. Enter the page Dropdown page.
2. Click on the dropdown list.
3. Compare the result of the getOptionOneText() method with "Option 1", if it fails, the test stops.
4. If it is ok, compare the result of the getOptionTwoText() method with "Option 2" if it fails, the test stops.
5. If both messages are equals, the test pass.