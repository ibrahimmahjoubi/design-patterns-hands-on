package tryWithResouces;

public class AutoCloseableResourceFirst implements AutoCloseable {

    AutoCloseableResourceFirst() {
        System.out.println("first auto-closeable resource created");
    }

    void doSomething () {
        System.out.println("going my first thing..");
    }

    @Override
    public void close() {
        System.out.println("closing the first resource..");
    }
}