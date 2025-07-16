# Triangular Pyramid Pattern – Java

This Java program prints a **centered triangular pyramid** made of asterisks (`*`) to the console. It uses nested loops and spacing logic to produce a symmetrical pyramid pattern aligned in the middle of the screen.

## 🔍 Example Output (for `n = 5`)

               *
              ***
             *****
            *******
           *********

## 🧠 Description

The pyramid grows line-by-line, with each row printing:
- Decreasing spaces to align the stars to the center
- Increasing stars in an odd count (`1, 3, 5, ...`) to maintain symmetry

A fixed offset (`space = 20`) helps position the pyramid roughly in the center of the terminal window.

### Program Logic

```java
int n = 5;         // Height of the pyramid
int space = 20;    // Number of leading spaces for centering

Outer loop (i) handles the number of pyramid levels.

First inner loop (k) prints decreasing spaces.

Second inner loop (j) prints increasing stars in each level.