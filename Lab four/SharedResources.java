class SharedResource {
    private boolean isAvailable = false;

    public synchronized void produce() {
        while (isAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isAvailable = true;
        System.out.println("Produced");
        notify();
    }

    public synchronized void consume() {
        while (!isAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isAvailable = false;
        System.out.println("Consumed");
        notify();
    }
}

