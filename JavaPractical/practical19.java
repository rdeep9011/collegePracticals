package JavaPractical;

// WAP for creating threads using Thread class

// Step 1: Create a class that extends Thread
class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        threadName = name;
    }

    // Step 2: Override the run() method
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500); // pause for half a second
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished execution.\n");
    }
}

// Step 3: Main class to start threads
public class practical19 {
    public static void main(String[] args) {

        // Create thread objects
        MyThread t1 = new MyThread("Thread A");
        MyThread t2 = new MyThread("Thread B");

        // Start the threads
        t1.start();
        t2.start();

        System.out.println("Main thread is running...");
    }
}
