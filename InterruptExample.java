// We'll simulate a scenario of a long-running file download process that can be interrupted by the user.
/*
 * We'll have a thread that simulates downloading a file.
The main thread will wait for a few seconds and then attempt to interrupt the download.
The download thread will handle the interruption gracefully.
 */

class FileDownloader extends Thread {
    @Override
    public void run() {
        System.out.println("Download started...");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Downloading part " + i + "...");
            try {
                // Simulate time taken to download each part of the file
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Download interrupted during sleep! Cleaning up...");
                return;
            }

            // Periodically check if the thread has been interrupted
            if (Thread.interrupted()) {
                System.out.println("Download interrupted! Cleaning up...");
                return;
            }
        }
        System.out.println("Download completed successfully.");
    }
}
public class InterruptExample {
    public static void main(String[] args) {
        FileDownloader downloader = new FileDownloader();
        downloader.start();

        // Let the downloader run for 3 seconds before interrupting
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Attempting to interrupt the download...");
        downloader.interrupt();

        // Wait for the download thread to finish
        try {
            downloader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }
}

/*
 * FileDownloader Class:

Extends Thread and simulates the download process in the run method.
Uses a loop to simulate downloading parts of a file, with Thread.sleep(1000) representing the time taken to download each part.
Catches InterruptedException to handle interruptions gracefully, performing any necessary cleanup.

InterruptExample Class:

The main class that starts the download thread.
Sleeps for 3 seconds to allow the download process to run.
Interrupts the download thread using downloader.interrupt().
Waits for the download thread to finish using downloader.join().
 */
