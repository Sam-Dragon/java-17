package learn.java17.feature.instance_of_check;

interface ParentClass {
    void method();
}

class ChildClass implements ParentClass {
    @Override
    public void method() {
        System.out.println("Instance of check child passed");
    }
}

class ChildClassSecond implements ParentClass {
    @Override
    public void method() {
        System.out.println("Instance of check child 2 passed");
    }
}

/**
 * instance of:
 * - instead of type casting, directly using reference we can call method or variable
 */
public class InstanceOfCheck {

    public static void main(String[] args) {
        ParentClass obj = new ChildClass();
        if (obj instanceof ChildClass childClass)
            childClass.method();
        else
            System.out.println("Instance of check child failed");

        if (obj instanceof ChildClassSecond childClassSecond)
            childClassSecond.method();
        else
            System.out.println("Instance of check child 2 failed");
    }
}
