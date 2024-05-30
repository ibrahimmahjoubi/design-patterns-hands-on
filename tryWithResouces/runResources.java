package tryWithResouces;

/**
    first auto-closeable resource to create, last to be closed
 **/
public interface runResources {
    static void main(String[] args) {
        try (AutoCloseableResourceFirst fr = new AutoCloseableResourceFirst();
        AutoCloseableResourceSecond sr = new AutoCloseableResourceSecond()) {
            fr.doSomething();
            sr.doSomething();
        }
    }
}
