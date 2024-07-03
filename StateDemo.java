public class StateDemo implements Runnable {
    public void run() {
        synchronized (this) {
            try {
                Thread.sleep(1000); // TIMED_WAITING
                wait(); // WAITING
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        StateDemo demo = new StateDemo();
        Thread t1 = new Thread(demo);
        Thread t2 = new Thread(() -> {
            synchronized (demo) {
                demo.notify();
            }
        });

        System.out.println("Thread state before start: " + t1.getState()); // NEW
        t1.start();
        System.out.println("Thread state after start: " + t1.getState()); // RUNNABLE

        try {
            Thread.sleep(500); // Give thread some time to run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state during sleep: " + t1.getState()); // TIMED_WAITING

        try {
            Thread.sleep(1000); // Give thread some time to enter wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state during wait: " + t1.getState()); // WAITING

        t2.start(); // Notify t1

        try {
            t1.join(); // Wait for t1 to terminate
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after termination: " + t1.getState()); // TERMINATED
    }
}
