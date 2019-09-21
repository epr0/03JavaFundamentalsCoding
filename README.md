# Java Fundamentals: Coding
During this module we are going to focus on reminding everything you have learned in Java Fundamentals 
by solving multiple development problems. Don't worry if you are not sure about how to solve any 
exercise described below - it's also a time for a little repetition of the theory!

> HINT: At first - keep it simple, divide the problem into smaller ones until you feel you can 
handle it.
 
# Exercises
## Basics
1. Use System.out.print method to print the same statement in separate lines.
```
Hello, World!
Hello, World!
```

2. Enter any value with several digits after the decimal point and assign it to variable
of type double. Display the given value rounded to two decimal places.

3. Display any three strings of characters on one line so that they are aligned to the right
edge of the 15-character blocks. How to align strings to the left edge?

4. Enter two values of type int. Display their division casted to the double type and rounded to
the third decimal point.

5. *Sum two integer variables initialized with maximal values for that type.

6. Create three variables, one for each type: float, byte and char. Enter values corresponding to
those types using Scanner. What values are you able to enter for each type?

### Flow control, loops and arrays
1. Write an application that will show if entered value is greater, equal or lower than 30.

2. As above but compare two values at the same time. Verify if first value is greater than 30 and
second value is greater than 30, and so on.

3. As above but only one of the values has to be greater, equal or lower than 30.

4. Write an application that for any entered number between 0 and 9 will provide it’s name. For
example for “3” program should print “three”.

5. Using nested for loops draw (parents loop iterator should be called “row”,
child – “column”):
- triangle,
- *rectangle with diagonals,
- **Christmas tree

6. Write a simple application that will simulate a shopping. Use only if-else flow control.
Consider following cases:
- If you would like to buy a bottle of milk – cashier will ask you for a specific amount of
money. You have to enter that value and verify if it is same as the cashier asked.
- If you would like to buy a bottle of wine – cashier will ask you if you are an adult and
for positive answer ask for a specific amount of money.

7. Write a “divide by” application. User should be able to enter initial value that will be divided
in a loop by a new value entered by a user. Division should occur as long, as entered value
will be different than 0. Result of division should be rounded to the fourth decimal point and
printed to the console.

8. Write a simple “echo” application, that will:
- print back entered string,
- go to the beginning of a loop if user will enter “continue”,
- break the loop with a “good bye!” message, if user will enter “quit”.

9. Write an application that will find biggest value within array of int variables.
- check your application using randomly generated array (use Random class),
- check your application at least 5 times in a loop (generate random array -> print
array to the console -> find biggest value -> print biggest value -> manually verify
results).

10. Write an application that will find the longest char sequence within an array of type String.
Test it in the same way as you have done in the previous exercise. How will you generate
random char sequences?

### Object oriented programming
1. Grocery Shopping
- Create class Product, it should contain at least two fields – name and price.
- Create an empty array of Products – it’s size should be at least 5.
- Fill it within while loop. Simulate the process of doing shopping:
    - ask for a product,
    - add it to the cart (array),
    - change index,
    - if index will be greater than 5 – finish shopping,
    - *pay for the products.

2. Petrol Station
- Simulate the process of refueling. Within the while loop ask user if you should
continue or finish. For every entered “continue” command you should add a specific
amount of petrol and money (both of type double) and view it on the console.
- At the end user should pay for petrol. Consider multiple possibilities, like:
    - The user paid exactly as much as required.
    - The user paid too much (cashier should return the rest of the money).
    - The user paid too little – should be asked for the rest.

3. Personal Trainer.
- Create class Trainee, it should contain fields like: name, stamina, strength.
- You’ll simulate both sides – Trainer and Trainee. Within a while loop you will be
asked for an exercise to be done. Every exercise should add/reduce
stamina/strength.
- Take into account that stamina should not be reduced below 0.
- *Consider adding some supplements that will recover the stamina. Supplement
should be additional class.

4. *Tic Tac Toe. Remember – keep it simple. You may use two-dimensional array to store the
results and empty fields. Prepare a method to view present state of the “board”.