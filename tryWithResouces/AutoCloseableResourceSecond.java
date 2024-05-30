package tryWithResouces;

public class AutoCloseableResourceSecond implements AutoCloseable {
    
    AutoCloseableResourceSecond() {
        System.out.println("second auto-closeable resource created");
    }
    
    void doSomething () {
        System.out.println("going my second thing..");
    }

    @Override
    public void close() {
        System.out.println("closing the second resource..");
    }
}