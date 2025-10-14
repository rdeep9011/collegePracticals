package JavaPractical;

// WAP to create a thread using 'Runnable' interface

// Step 1: Create a class that implements Runnable
class MyRunnable implements Runnable {
    private String threadName;

    MyRunnable(String name) {
        threadName = name;
    }

    // Step 2: Override the run() method
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500); // half second pause
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished execution.\n");
    }
}

// Step 3: Main class to start threads
public class practical20 {
    public static void main(String[] args) {

        // Create Runnable objects
        MyRunnable obj1 = new MyRunnable("Thread A");
        MyRunnable obj2 = new MyRunnable("Thread B");

        // Step 4: Create Thread objects and pass Runnable instances
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Step 5: Start both threads
        t1.start();
        t2.start();

        System.out.println("Main thread is running...");
    }
}
