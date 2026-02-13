# Java Vector – Chapter 15

Package Name:
vector

This project demonstrates operations on the legacy `Vector` class.

---

## 📌 About Vector

• Part of Java 1.0  
• Synchronized (Thread-safe)  
• Dynamic array  
• Default capacity = 10  
• Capacity increment supported  
• Legacy methods available  

---

## ✅ Operations Covered

### Creation
- Vector()
- Vector(initialCapacity, increment)

### Insertion
- add()
- addElement()
- insertElementAt()
- addAll()

### Deletion
- clear()
- removeElement()
- removeElementAt()
- retainAll()

### Searching
- contains()
- lastIndexOf()

### Update
- setElementAt()

### Bulk Operations
- clone()
- copyInto()
- equals()
- toString()
- hashCode()

---

## ⏱ Time Complexity

| Operation | Complexity |
|-----------|------------|
| add()     | O(1) amortized |
| insert    | O(n) |
| remove    | O(n) |
| search    | O(n) |
| clone     | O(n) |

---

## 🚀 Compile & Run

```bash
javac vector/*.java
java vector.Example15_1_VectorCreateDemo1
