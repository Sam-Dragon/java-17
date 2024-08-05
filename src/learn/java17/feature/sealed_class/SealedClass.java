package learn.java17.feature.sealed_class;

final class Circle extends SealedClass {
}

final class Square extends SealedClass {
}

final class Triangle extends SealedClass {
}

public sealed class SealedClass permits Circle, Square, Triangle {
}

// Non Sealed class cannot access sealed class
// non-sealed class NonSealedClass extends SealedClass {
// }