# Restaurant-Ordering-Application

     The Restaurant Ordering System Popeyes based is an application that consists of limited components but unique and functioning ones. This application was initially intended to act as a delivery service like already implemented ones such as Ubereats, DoorDash, Grubhub, Slice, and etc. Since that would take a lot of time and learning experience, we decided to implement an ordering service for a certain Restaurant with the time given. We decided to use Popeyes to mimic. So how does this app work? Right off the bat, once the user opens the application up, they are welcomed and can click from a list of buttons. Each button takes you to a new page. The first button “Sign in” takes you to the register page, the Login button takes you to the Login page, and the View Menu takes you to the menu page. The user can view the menu and checkout as a guest, otherwise they can create an account for later purposes and other features. Creating an account allows us to retrieve and save the customers information to our database so the user can just simply login next time they want to order.
     
     Welcome User Menu:
  <img width="400" alt="image" src="https://user-images.githubusercontent.com/82357065/194375607-442c029d-1a69-4357-bb41-5939ed3f0d28.png">
  
    If user clicks to Sign Up, they are taken to the register page
<img width="350" alt="image" src="https://i.postimg.cc/Nj6c2dWG/Screen-Shot-2022-10-06-at-1-10-34-PM.png">

   If user clicks to Login, they are taken to the Login page
   <img width="300" alt="image" src="https://i.postimg.cc/66fbZDQm/Screen-Shot-2022-10-06-at-2-54-02-PM.png">
 
 If the user just wants to view the menu as a guest, they just click the View Menu button
 <a href='https://postimg.cc/4HJyGSFz' target='_blank'><img src='https://i.postimg.cc/nrmD484w/Screen-Shot-2022-10-09-at-1-08-36-AM.png' border='0' alt='Screen-Shot-2022-10-09-at-1-08-36-AM'/></a>
 
 The user can add things to the cart and the total price with tax will be added up depending on the number they fill in for each item. They can also qualify for a 10% discount and it will be deducted from the order total.
 
 If the user wants to checkout as a guest, they can just enter the card information and confirm the payment
<a href='https://postimg.cc/vch94WrY' target='_blank'><img src='https://i.postimg.cc/SxFGtdjM/Screen-Shot-2022-10-09-at-1-12-32-AM.png' border='0' alt='Screen-Shot-2022-10-09-at-1-12-32-AM'/></a><br /></a><br />

Once the order is successfully placed, the user gets a confirmation order
<a href='https://postimages.org/' target='_blank'><img src='https://i.postimg.cc/4dYgFsFw/Screen-Shot-2022-10-09-at-1-19-24-AM.png' border='0' alt='Screen-Shot-2022-10-09-at-1-19-24-AM'/></a><br /></a><br />

For test cases we used implemented JOptionPane.showMessageDialog as an exception case for the user interface.
For example, when the user is creating their account and doesn’t enter a valid password which consists of at least 8 characters, numbers, and special character, they receive a pop up message and cant create the account till the information is valid. The same is the case for the the login having invalid matched information and the payment having invalid lengths of card digits.
<a href='https://postimg.cc/bGmpbw62' target='_blank'><img src='https://i.postimg.cc/G2C2WBGz/Screen-Shot-2022-10-09-at-1-17-21-AM.png' border='0' alt='Screen-Shot-2022-10-09-at-1-17-21-AM'/></a>

UML Diagram for the application
<a href='https://postimg.cc/QFsFJVq6' target='_blank'><img src='https://i.postimg.cc/3x027v0H/UML-Restaurant-Application.png' border='0' alt='UML-Restaurant-Application'/></a>

  There are also Java exceptional messages that tell the user if there is anything wrong with the information given. For example, it would notify the user if the password is of correct length and has the special requirements for being valid. Once the user successfully creates the account, they are led to the Login page where they enter their username, phone number, and password as they used to sign up. The user has to correctly enter their information to login and if they don't, they are notified that their information doesn’t match up with the information they provided in our database. Once the user successfully logs in, they are taken to the Popeyes Menu where they can finally choose the items they want and order. The user can add as many items as they want and by hitting enter on the keyboard, the total is automatically added up. The user can get items in bulk or get single items. Users also have the option to qualify for a discount and once they do, they get up to 10% off from their total. Once the user is done adding items to the cart, they can go checkout using the “Checkout” button next to the order total. Once they do that, they are taken to the Payment page where they pay for their order. The user enters in their credit/debit card information and they are also notified if their card information is invalid. This also utilizes databases as the card info is used to make the payments. Once the order is successfully placed, the user gets a confirmation receipt with the order number and a “Thank you” message. Now of course, this is just a simulation of what an actual Popeyes app would do. It has the basic functions of the app and it needs a lot of implementation to even be a worthy simulation of an ordering system application. 
     
     <img width="603" alt="image" src="https://user-images.githubusercontent.com/82357065/170841179-73eb596b-fcd0-4064-9469-9402c6b8e98b.png">
<img width="587" alt="image" src="https://user-images.githubusercontent.com/82357065/170841186-0217e703-fef5-4511-be72-a58e17af0f3c.png">


Food Ordering App’s features
●	11 classes and Approximately 1100 lines of code
●	Welcome HomePage
●	User Registration 
●	User Authentication
●	Food menu, User choice
●	Items in bulk and Customer Discount
●	Payment authentication
●	Order Confirmation

There are a list of features we want to implement for the next steps down the line.
These features include

●	Coupons and Promotions
●	Rewards and Perks
●	GPS and Store locations near the user
●	Delivery Status and Tracking
●	Favorites
●	Contact for Customer Support, Help
●	Nutrition and Facts
●	Restaurant Hours
●	Notifications

       Coupons and Promotion would give certain deals and discounts to the customer. Rewards and Perks add up over time based on previous orders and based on rewards points, the user can earn a free item. GPS allows the user to locate the nearest Restaurant and all the Restaurants in the city based on zip code. Delivery Status and Tracking allows the user to track how far the order will take to arrive and if it is ready or not. Favorites would be a section on the app based on the amount of times a certain item or order is placed. This way the user can just get the usual efficiently without having to add the items in their cart. Customer Support is a must as there are always issues with orders and to deal with that, we would have a customer support calling and chat system.  The Nutrition and Facts feature informs the user about the ingredients, description, and calorie count of the Foods on the menu. Restaurant Hours indicates when the restaurant is open and when it closes. Notification notifies the user for all of the following components listed above. It would notify the user if there is an update and constant order status




 

![image](https://user-images.githubusercontent.com/82357065/170841077-3937652b-cd9d-422c-9be5-751d426e0251.png)
