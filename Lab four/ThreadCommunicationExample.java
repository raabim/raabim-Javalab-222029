public class ThreadCommunicationExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Runnable producerTask = () -> {
            for (int i = 0; i < 10; i++) {
                sharedResource.produce();
            }
        };

        Runnable consumerTask = () -> {
            for (int i = 0; i < 10; i++) {
                sharedResource.consume();
            }
        };

        Thread producerThread = new Thread(producerTask);
        Thread consumerThread = new Thread(consumerTask);

        producerThread.start();
        consumerThread.start();
    }
}
