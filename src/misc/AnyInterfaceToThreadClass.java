package misc;

interface MyRunnableInterface {
    void run();
}

public class AnyInterfaceToThreadClass {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Hi, I am lamda expression passed to thread class"));
        thread.start();

        System.out.println("Custom Interface");
        MyRunnableInterface myRunnableInterface = () -> System.out.println("Hi, I am MyRunnableInterface passed to thread class");
//      Thread class expects Runnable interface as an argument
        // thread = new Thread(myRunnableInterface);
    }
}
