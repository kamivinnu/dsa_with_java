# Java Arrays – Chapter 12

This repository contains structured Java programs demonstrating
different operations on arrays (1D and 2D) using core Java.

Package Name:
arraysdemo

---

# 📌 Topics Covered

## ✅ Example 12.1 – One Dimensional Array
• Declaring a 1D array  
• Allocating memory using `new`  
• Accessing elements using index  
• Printing specific element  

Concept:
Arrays are fixed-size indexed data structures.

---

## ✅ Example 12.2 – Array Declaration Methods
• Different ways to declare arrays  
• Static initialization  
• Multidimensional arrays  
• Arrays of objects  

Concept:
Arrays can store primitive types and reference types.

---

## ✅ Example 12.3 – Array Initialization (User Input)
• Using `Scanner` for input  
• Reading array size dynamically  
• Iterating with loop  
• Printing elements  

Concept:
User-driven array creation and traversal.

---

## ✅ Example 12.4 – Random Initialization
• Generating random numbers  
• Filling array with random values  
• Using `Math.random()`  

Concept:
Automatic data population inside arrays.

---

## ✅ Example 12.5 – Printing & Cloning Arrays
• Custom print method  
• Method overloading  
• Using `clone()` method  
• Shallow copy behavior  

Concept:
Arrays support cloning but cloning is shallow copy.

---

## ✅ Example 12.6 – Recursive Array Reversal
• Generic class usage  
• Recursion logic  
• Swapping elements  
• Type parameter `<T>`  

Concept:
Recursive divide-and-swap approach to reverse array.

Time Complexity:
O(n)

---

## ✅ Example 12.7 – Insertion in 1D Array
• Manual shifting of elements  
• Handling overflow condition  
• Insertion at specific index  

Concept:
Since arrays are fixed-size, shifting is required.

Time Complexity:
O(n)

---

## ✅ Example 12.8 – Deletion in 1D Array
• Removing element by index  
• Left shifting of elements  
• Underflow condition  

Concept:
Deletion requires shifting remaining elements.

Time Complexity:
O(n)

---

## ✅ Example 12.9 – 2D Arrays (Matrix Operations)
• Creating 2D array  
• Row-major traversal  
• Column-major traversal  
• Matrix addition  
• Matrix multiplication  

Concept:
2D arrays are arrays of arrays.

Matrix Addition Condition:
Rows and columns must match.

Matrix Multiplication Condition:
Columns of first matrix = Rows of second matrix.

Time Complexity:
Addition → O(n²)  
Multiplication → O(n³)

---

# 🧠 Important Concepts

## 🔹 What is an Array?
An array is a fixed-size linear data structure that stores
elements of the same data type in contiguous memory.

## 🔹 Indexing
Array index starts from 0.

## 🔹 Length
`array.length` gives capacity (not actual filled size).

## 🔹 Advantages
• Fast access (O(1))
• Memory efficient
• Simple structure

## 🔹 Limitations
• Fixed size
• Insertion and deletion costly
• Cannot grow dynamically

---

# 🔁 Common Array Operations

| Operation        | Time Complexity |
|-----------------|----------------|
| Access          | O(1)           |
| Traversal       | O(n)           |
| Insertion       | O(n)           |
| Deletion        | O(n)           |
| Reverse         | O(n)           |
| Matrix Addition | O(n²)          |
| Matrix Multiply | O(n³)          |

---

# 🚀 Compilation & Execution

From project root:

```bash
javac arraysdemo/*.java
java arraysdemo.Example12_1_ArrayDemo
