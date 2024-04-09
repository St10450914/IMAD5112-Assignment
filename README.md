# IMAD5112-Assignment
In the scenario given we are tasked with helping a family friend who is a history teacher create an app for students. Her hope is that the app compares the ages of her students to that of the historical figure when they died. The purpose of the app is to inspire the students to want to learn more about history thus it’s important to keep the scenario in mind when coming up with the objective and planning of the code for the app. 

  

Objective 

The main purpose of the app is to compare the ages of the user to that of a historical figure when they died but it is also important to keep in mind that the app is going to be used by mostly students. For this reason, the app has to be entertaining enough to grab and keep the student's attention while being very easy to use so they do not get confused by the interface. 

  

Planning 

The first step in planning for my app is to find the 10 historical figures to include in my app for the user to compare the age with 

  

I decided to use: 

    Aaliyah - American singer, dancer, and actress who has the nickname      "princess of  R&B. She passed away on August 25, 2001, from a plane crash, at the age of 22. 

    Lebo Mathias - South African Kwaito singer and song writer. She died in a car accident at the age of 29 in 2006. 

    Princess Diana - A member of the British royal family. She passed away in a car accident in 1997 at the age of 36. 

    Whitney Houston - American singer, actress, and film producer who died due to a drug overdose in 2006, at the age of 48. 

    Michael Jackson - Also known as "The king of pop, Michael Jackson was an iconic singer, songwriter, dancer and entertainer. he died at the age of 50 in 2009. 

    David Bowie - English musician and actor who passed in 2016 at the age of 69. 

    Muhammad Ali - American professional boxer and activist. He passed away in 2016 at the age of 74. 

    Maya Angelou - she was a poet and civil rights activist. she died in 2014 at the age of 86. 

    Hugh Hefner - American magazine publisher who founded Playboy magazine. He died in 2017 at the age of 91. 

    Nelson Mandela - He was an anti-apartheid activist and the former and first black president of South Africa. He passed away in 2013 at the age of 95.  

  

There was no particular reason why I chose this set of people besides the fact that they fit the age ranges I was looking for. 

 

User interface 

I tried to make the  app features as visually appealing and user-friendly interface as possible. With easy navigation and clear instructions for inputting the age of the user. I used pink because it's a vibrant colour, and it makes my app attract the eye of the user. 

Now that we have the 10 people we can now start creating an app. From the scenario, we can deduce that we would need a place to input the user's age. For this, we can use an enter text on Android Studio. When the user has entered their age we have a generate button to begin the processing and checking. For the output ( which is where the results are displayed ) I used a text view. And because the app is meant to run more than once, I added a button to cancel in order to reset the app. For good measure and to make my app more interactive I decided to add an image view where the picture of the historical figure will show along with the output. I feel like this will make my app more entertaining to the students and that they will want to stay longer on the app because of this visual feature 

This was all done by the drag and drop method on android studio. 

  

Screenshot of  my app, showing the user interface 

 

I also used a slit colour background just to make the app look more visually dynamic. But overall I kept the user interface simple so the user is not overwhelmed or confused about how to use the app. 

 

Code 

In the app's code, the use of an "if" loop, or more precisely, conditional statements, is very important for placing the users into specific age ranges and determining which historical figure category they belong to. These conditional statements process and check the user's input age and compare it to predefined age ranges and put them into matching categories based on these comparisons.  

 

The code for the IF loop or conditional statements 

 

The next section of code is the text results represented by “txtResult”. In simple terms, this is the text output displayed shown in the text view box. In this part of the code a message is being constructed based on the result of the age comparison between the user and the late historical figure. The "when" expression is used to check the "result", which represents the category of the late historical figure that the user's age falls into.  

For example, if the user's age falls into the "Aaliyah" category, the message "You are in the Aaliyah category. She was 22 when she died" will be outputted in the text results.  

 

The code for the text results or “txtResults” 

 

 

In this section of the code, an image of the matching historical figure is calculatively selected based on the text result of the age comparison. The "when" expression checks the result, which goes along with the category of the late historical figure the user's age aligns with. Based on the result, a specific image view is linked to the "imageResource" variable using the arrow notation. 

So the user inputs they age and the output is some text telling the user which late historical figure they match with, along with the image of that late historical figure. 

 

 

 

The above section of code is how we close off the back end code. This is for the cancel button. The cancel button plays an important role in making  my app be more user-friendly and intuitive. It's like having a reliable "undo" button that lets users easily backtrack or start over if they make a mistake or want to explore different age comparisons. Imagine typing in your age and realizing you made a typo or changed your mind – the cancel button is there to save the day, allowing you to reset things with just a tap. It's all about giving users a sense of control and comfort, knowing they can navigate the app at their own pace and make adjustments as needed. So, whether you're double-checking your age or simply exploring different celebrity comparisons, the cancel button is your trusty companion, always ready to lend a helping hand. 

Github and Github Actions 

I create a new repository for my app in with I uploaded my Main activity and activity main from android studio. And used github actions to run an automated test on my code.This was to amke sure that my app would run on other devices and not just my computer. 
