public class LambdaRunnableExample {
    public static void main(String[] args) {

        // Thread 1 - using Runnable lambda
        Runnable task1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task 1 - Count: " + i + " | " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500); // simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Thread 2 - using Runnable lambda directly inside Thread
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task 2 - Count: " + i + " | " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create and start threads
        Thread t1 = new Thread(task1);
        t1.start();
        t2.start();

        // Main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Task - Count: " + i + " | " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
