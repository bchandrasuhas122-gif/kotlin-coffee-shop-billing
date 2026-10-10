 Byte & Brew Coffee Calculator

A simple console-based order billing and discount calculator written in **Kotlin**. This project simulates a basic point-of-sale and checkout workflow for a coffee shop.

Features
* Interactive menu selection (`Espresso`, `Latte`, `Cappuccino`)
* Continuous ordering loop using `while`
* Automated tiered discount logic:
* 15% discount for orders containing 5 or more items
* 10% discount for order totals of $15.00 or more
* Detailed itemized receipt output showing item count, subtotal, discount, and final amount due

 Concepts Practiced
* `while` loops & control flow
* `when` expressions for clean conditional routing
* Functions with return types (Double)
* Basic arithmetic and relational operators (`>=`, `+`, `*`)

How to Run
1. Ensure you have [Kotlin](https://kotlinlang.org/) installed on your machine.
2. Compile and run the script:
   bash
   kotlinc MiniProject1.kt -include-runtime -d MiniProject.jar
   java -jar MiniProject.jar