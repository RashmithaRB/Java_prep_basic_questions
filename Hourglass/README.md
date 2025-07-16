# Hourglass Pattern Printer – Java

This Java program prints a centered **hourglass-shaped pattern** made of asterisks (`*`). It uses nested loops to create an inverted pyramid followed by a normal pyramid, aligned centrally on the console.

## 🔍 Example Output (for `n = 4`)

                * * * * * * *
                  * * * * *
                    * * *
                      *
                    * * *
                  * * * * *
                * * * * * * *


## 🧠 Description

The program is divided into two parts:
1. **Inverted Pyramid** – prints the top half of the hourglass.
2. **Regular Pyramid** – prints the bottom half of the hourglass, excluding the middle row to prevent duplication.

### Centering

The pattern is centered horizontally by printing 20 leading spaces on each line before the actual pattern. Adjust this number to shift the output's horizontal position.

## 📌 Features

- Dynamically generates the hourglass pattern based on the value of `n`
- Clean, symmetrical, centered output
- Easy to modify for different sizes

## ⚙️ Program Logic

```java
int n = 4; // Controls the height of the hourglass
```

n controls the number of rows in the upper and lower halves (total height will be 2n - 1).

Loops handle space padding and star printing in each row.

Two separate loops:

First for top (inverted pyramid)

Second for bottom (normal pyramid, skipping the first row)