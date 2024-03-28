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