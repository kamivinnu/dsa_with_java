# Java Arrays Utility Class – Chapter 14

Package Name:
arrays

This project demonstrates the use of the `java.util.Arrays` class.

---

## 📌 About Arrays Class

• Contains only static methods  
• No object creation required  
• Bridges gap between arrays and collections  
• Works with primitive and Object arrays  

Syntax:
Arrays.methodName(...);

---

## ✅ Methods Covered

### Conversion
- asList()
- stream()
- toString()
- deepToString()

### Copying
- copyOf()
- copyOfRange()

### Comparison
- deepEquals()

### Hashcode
- deepHashCode()

### Filling
- fill()

### Searching
- binarySearch()

### Sorting
- sort()
- sort(range)
- parallelSort()

### Comparator Sorting
- sort(array, comparator)

### Traversal
- spliterator()

---

## ⏱ Time Complexity

| Operation        | Complexity |
|-----------------|------------|
| sort()          | O(n log n) |
| parallelSort()  | O(n log n) |
| binarySearch()  | O(log n)   |
| copyOf()        | O(n)       |
| fill()          | O(n)       |

---

## 🚀 Compile & Run

```bash
javac arrays/*.java
java arrays.Example14_1_ArrayToListDemo
