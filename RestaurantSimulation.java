import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

class Restaurant {
    private final Lock lock = new ReentrantLock();
    private final Condition orderPlaced = lock.newCondition();
    private final Condition foodPrepared = lock.newCondition();
    private boolean isOrderPlaced = false;
    private boolean isFoodPrepared = false;

    public void placeOrder() throws InterruptedException {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + ": Placing order.");
            isOrderPlaced = true;
            orderPlaced.signal();
            while (!isFoodPrepared) {
                foodPrepared.await();
            }
            System.out.println(Thread.currentThread().getName() + ": Food is served.");
        } finally {
            lock.unlock();
        }
    }

    public void prepareFood() throws InterruptedException {
        lock.lock();
        try {
            while (!isOrderPlaced) {
                orderPlaced.await();
            }
            System.out.println(Thread.currentThread().getName() + ": Preparing food.");
            Thread.sleep(1000); // Simulate time to prepare food (TIMED_WAITING)
            isFoodPrepared = true;
            foodPrepared.signal();
        } finally {
            lock.unlock();
        }
    }
}

class Customer implements Runnable {
    private final Restaurant restaurant;

    public Customer(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            restaurant.placeOrder();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Customer interrupted.");
        }
    }
}

class Chef implements Runnable {
    private final Restaurant restaurant;

    public Chef(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            restaurant.prepareFood();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Chef interrupted.");
        }
    }
}

public class RestaurantSimulation {
    public static void main(String[] args) throws InterruptedException {
        Restaurant restaurant = new Restaurant();
        Thread customerThread = new Thread(new Customer(restaurant), "Customer");
        Thread chefThread = new Thread(new Chef(restaurant), "Chef");

        System.out.println("Customer thread state before start: " + customerThread.getState()); // NEW
        System.out.println("Chef thread state before start: " + chefThread.getState()); // NEW

        customerThread.start();
        chefThread.start();

        System.out.println("Customer thread state after start: " + customerThread.getState()); // RUNNABLE
        System.out.println("Chef thread state after start: " + chefThread.getState()); // RUNNABLE

        Thread.sleep(500); // Allow threads to process

        System.out.println("Customer thread state during wait: " + customerThread.getState()); // WAITING
        System.out.println("Chef thread state during wait: " + chefThread.getState()); // WAITING

        customerThread.join();
        chefThread.join();

        System.out.println("Customer thread state after termination: " + customerThread.getState()); // TERMINATED
        System.out.println("Chef thread state after termination: " + chefThread.getState()); // TERMINATED
    }
}


/*
 * Restaurant Class:

Manages the synchronization between customers placing orders and chefs preparing food.
Uses a ReentrantLock and Condition objects to coordinate the actions of customers and chefs.
Customer Class:

Represents a customer who places an order and waits for the food to be prepared.
Calls the placeOrder() method on the Restaurant object.
Chef Class:

Represents a chef who prepares food once an order is placed.
Calls the prepareFood() method on the Restaurant object.
Main Class (RestaurantSimulation):

Creates and starts threads for customers and chefs.
Displays thread states at various points to demonstrate state transitions.
Thread States Demonstrated
New:

Both customerThread and chefThread are in the NEW state before they are started.
Runnable:

After starting the threads, they move to the RUNNABLE state.
Timed Waiting:

The chefThread enters the TIMED_WAITING state when it calls Thread.sleep(1000); while preparing food.
Waiting:

The customerThread enters the WAITING state waiting for the food to be prepared using foodPrepared.await();.
The chefThread enters the WAITING state waiting for an order to be placed using orderPlaced.await();.
Blocked:

Although not explicitly shown in the output, the threads might briefly enter the BLOCKED state when trying to acquire the lock before the state changes to WAITING.
Terminated:

Both threads enter the TERMINATED state after completing their tasks.
 */