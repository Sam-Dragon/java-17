package learn.java17.interfaces;

@FunctionalInterface
public interface InterfacePrivateMethods {

    void method();

    // Defaults method cannot be private
    default void defaultMethod() {
        System.out.println("Default Method");
        privateMethod();
        staticMethod();
    }

    private void privateMethod() {
        System.out.println("Private World");
    }

    private static void staticMethod() {
        System.out.println("Static World");
    }
}
