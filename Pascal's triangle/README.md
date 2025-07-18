# Pascal's Triangle Printer – Java

This Java program prints **Pascal's Triangle** up to `n` rows in a centered format on the console. It uses an `ArrayList` of `ArrayList<Integer>` to dynamically build the triangle.

## 🔍 Example Output (for `n = 7`)

                     1 
                   1   1   
                 1   2   1   
               1   3   3   1   
             1   4   6   4   1   
           1   5   10  10  5   1   
         1   6   15  20  15  6   1   


## 🧠 Description

Pascal’s Triangle is a triangular array of the binomial coefficients. Each number is the sum of the two numbers directly above it.

### Logic Breakdown

- Uses a nested loop to generate each row.
- First and last elements of every row are `1`.
- Intermediate elements are computed using:

value = arr[i-1][j-1] + arr[i-1][j]

- Outputs are formatted with spaces to center the triangle using:

```java
for (int j = 0; j < 15 - i - 1; j++) System.out.print("  ");
```

👤 Author
Rashmitha R Bangera