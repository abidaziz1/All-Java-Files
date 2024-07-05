/*
 * We'll simulate a scenario where a background task (daemon thread) performs periodic cleanup operations while the main application performs some primary tasks.
 * We'll have a main thread that performs some primary tasks.
A daemon thread will run in the background to perform periodic cleanup operations.
The daemon thread will terminate automatically when the main thread finishes.
 */

class BackgroundCleanupTask extends Thread{
    BackgroundCleanupTask(){
        setDaemon(true); // Set this thread as a daemon thread
    }
    
    @Override
    public void run(){
        while(true){
            System.out.println("Performing background cleanup...");
            try{
                Thread.sleep(2000); // Simulate a cleanup operation
            }catch(InterruptedException e){
                System.out.println("Background cleanup task interrupted.");
                break;
            }
        }
    }
}
// BackgroundCleanupTask Class:
// This class extends the Thread class.
// In the constructor, setDaemon(true) is called to mark this thread as a daemon thread. This means the JVM will not wait for this thread to finish before exiting.
// The run method contains an infinite loop that continuously performs a simulated cleanup operation. The Thread.sleep(2000) call simulates the time taken for each cleanup, causing the thread to sleep for 2 seconds between each cleanup task.
public class DaemonThreadExample{
    public static void main(String[] args) {
        BackgroundCleanupTask cleanupTask = new BackgroundCleanupTask();
        cleanupTask.start(); 
        // Main application tasks
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main application task " + i);
            try {
                // Simulate time taken for each main task
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Main thread finished. Background cleanup task will now terminate.");
    }
}
// DaemonThreadExample Class:
// In the main method, an instance of BackgroundCleanupTask is created and started using cleanupTask.start(). This starts the daemon thread, which begins executing its run method in the background.
// The main thread performs its primary tasks in a loop that runs five times. In each iteration, it prints a message indicating the current task and then sleeps for 1 second to simulate time taken for each task.
// After the loop completes, the main thread prints "Main application finished."

// Execution Flow:
// Main thread starts and creates the daemon thread.
// Daemon thread starts and performs cleanup operations every 2 seconds.
// Main thread performs its primary tasks every 1 second.
// After 5 tasks, the main thread completes and exits.
// The JVM terminates the daemon thread, ending the program.