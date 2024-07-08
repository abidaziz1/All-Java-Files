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

/*
 * Consume Method
Consume Method Execution:
The consume method is synchronized to ensure thread safety.
The consumer checks if the queue is empty using while (queue.isEmpty()).
If the queue is empty, the consumer thread calls wait(), releasing the lock and waiting until notified.
If the queue is not empty, an item is removed from the queue.
A message "Consumed: item" is printed.
The notifyAll() method is called to wake up all waiting threads, including the producer.
Continuous Execution
Continuous Production and Consumption:
The producer thread continuously produces items, sleeping for 500 milliseconds between each production.
The consumer thread continuously consumes items, sleeping for 1000 milliseconds between each consumption.
The wait(), notify(), and notifyAll() methods ensure that the producer and consumer threads do not overfill or underutilize the queue, maintaining a smooth flow of items between production and consumption.
Example Execution Flow
Here's a step-by-step example of how the threads interact:

Producer Thread:

produce(0) is called.
Queue is not full, so 0 is added to the queue.
"Produced: 0" is printed.
notifyAll() is called, waking up any waiting threads (if any).
Producer sleeps for 500 milliseconds.
Consumer Thread:

consume() is called.
Queue is not empty, so 0 is removed from the queue.
"Consumed: 0" is printed.
notifyAll() is called, waking up any waiting threads (if any).
Consumer sleeps for 1000 milliseconds.
Producer Thread:

produce(1) is called.
Queue is not full, so 1 is added to the queue.
"Produced: 1" is printed.
notifyAll() is called, waking up any waiting threads (if any).
Producer sleeps for 500 milliseconds.
Consumer Thread:

consume() is called.
Queue is not empty, so 1 is removed from the queue.
"Consumed: 1" is printed.
notifyAll() is called, waking up any waiting threads (if any).
Consumer sleeps for 1000 milliseconds.
 */