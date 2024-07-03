public class ThreadStateDemo implements Runnable {
    public synchronized void run() {
        try {
            // TIMED_WAITING state
            Thread.sleep(1000);

            // WAITING state
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadStateDemo demo = new ThreadStateDemo();
        Thread t1 = new Thread(demo);
        Thread t2 = new Thread(() -> {
            synchronized (demo) {
                try {
                    // Simulate some work to ensure t1 gets to the wait() state
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                demo.notify();
            }
        });

        System.out.println("Thread state before start: " + t1.getState()); // NEW
        t1.start();
        System.out.println("Thread state after start: " + t1.getState()); // RUNNABLE

        // Give thread t1 some time to start and enter the TIMED_WAITING state
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread state during sleep: " + t1.getState()); // TIMED_WAITING

        // Give thread t1 some time to complete sleep and enter the WAITING state
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread state during wait: " + t1.getState()); // WAITING

        t2.start(); // Notify t1 to exit wait

        // Give thread t2 some time to notify t1 and allow t1 to terminate
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after termination: " + t1.getState()); // TERMINATED
    }
}
