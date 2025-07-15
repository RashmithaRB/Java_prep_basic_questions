# 🔢 Custom Pattern Generator: `122334445555...`

This Java program prints a number series based on a specific pattern:

- Starts with: `1 2`
- From number `3` onwards, each number is repeated `value - 1` times.
  
Example pattern:

1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 ...


## 📁 Package Structure

- **Package Name:** `placement`
- **Class Name:** `assignememt_2`

## 🚀 Program Description

The user inputs a number `n`, and the program prints the first `n` elements of the series as described.

### 🔢 Pattern Logic

- `1` occurs once
- `2` occurs once
- `3` occurs twice (`3 - 1`)
- `4` occurs three times (`4 - 1`)
- ...
- `k` occurs `k - 1` times

### 📌 Rules

- If input is `1`, output: `1`
- If input is `2`, output: `1 2`
- If input is `5`, output: `1 2 2 3 3`

## ✅ Sample Inputs/Outputs

| Input | Output           |
|-------|------------------|
| 1     | 1                |
| 2     | 1 2              |
| 5     | 1 2 2 3 3        |
| 10    | 1 2 2 3 3 3 4 4 4 4 |

## 🧠 Concepts Used

- Pattern recognition
- Loops and counters
- Input handling with conditions
- Early termination using `cnt >= n`

## 🛠️ How to Run

1. Save the file as `assignememt_2.java` inside a folder named `placement`.
2. Compile and run it using:

```bash
javac placement/assignememt_2.java
java placement.assignememt_2
```
