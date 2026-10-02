import java.util.concurrent.CountDownLatch;

class Foo {
    
    // Create two latches with a count of 1
    private final CountDownLatch latch1;
    private final CountDownLatch latch2;

    public Foo() {
        latch1 = new CountDownLatch(1);
        latch2 = new CountDownLatch(1);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        
        // Decrement the count of latch1, releasing any waiting threads
        latch1.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // Wait until latch1 count reaches zero (first has finished)
        latch1.await();
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        
        // Decrement the count of latch2, releasing any waiting threads
        latch2.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // Wait until latch2 count reaches zero (second has finished)
        latch2.await();
        
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
