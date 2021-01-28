class CountDownCounter {

    int count;

    public CountDownCounter(int initial) {
        synchronized (this) {
            this.count = initial;
        }
        
    }

    public synchronized void decrement() {
        count--;
    }
}
