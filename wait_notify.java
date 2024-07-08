import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity;

    public SharedQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (queue.size() == capacity) {
            wait(); // Wait until there is space in the queue
        }

        queue.add(item);
        System.out.println("Produced: " + item);
        notifyAll(); // Notify all waiting threads
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // Wait until there is something to consume
        }

        int item = queue.remove();
        System.out.println("Consumed: " + item);
        notifyAll(); // Notify all waiting threads
        return item;
    }
}

class Producer implements Runnable {
    private SharedQueue sharedQueue;

    public Producer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        int item = 0;
        while (true) {
            try {
                sharedQueue.produce(item++);
                Thread.sleep(500); // Simulate time taken to produce an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private SharedQueue sharedQueue;

    public Consumer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sharedQueue.consume();
                Thread.sleep(1000); // Simulate time taken to consume an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class wait_notify {
    public static void main(String[] args) {
        SharedQueue sharedQueue = new SharedQueue(5);

        Thread producerThread = new Thread(new Producer(sharedQueue));
        Thread consumerThread = new Thread(new Consumer(sharedQueue));

        producerThread.start();
        consumerThread.start();
    }
}
