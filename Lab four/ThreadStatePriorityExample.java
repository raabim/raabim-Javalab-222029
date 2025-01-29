public class ThreadStatePriorityExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running");
        });

        System.out.println("Thread state before start: " + thread.getState());

        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

        System.out.println("Thread state after start: " + thread.getState());

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after completion: " + thread.getState());
    }
}

