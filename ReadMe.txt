## Java 17 Features

# Record
- It is final by nature. Hence it cannot be subclassed
- It is enhanced implementation of class which has overridden
 hashcode(), equals() & toString() method

> Variables
- It can define instance variables only in constructor and nowhere else
- It can define static variables in body of record. Any variable must be tagged as static,
  followed by  final, volatile, transient etc. and prefixed with access modifiers
  like private, protected, public

> Methods
- It can define any kind of method inside the record

# Switch Expression
- It can be used directly using case statement
- In case of multiple lines of execution, 'yield' can be used at last to return the result
- nulls are allowed in switch expression

# Packages
sun.misc.Unsafe class is removed, access all packages from java.util.*


# Additional
- More descriptive exception messages