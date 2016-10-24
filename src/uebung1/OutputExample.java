package uebung1;


import uebung1.runnables.OutputRunnable;

public class OutputExample {

    public static final int NUMBER_OF_THREADS = 10;
    public static final String THREAD_NAME_PREFIX = "Thread: ";

    public static void main(String[] args) {
        for (int i = NUMBER_OF_THREADS; i>= 0; i--) {
            startThread(i);
        }
    }

    private static void startThread(int number) {
        new Thread(new OutputRunnable(THREAD_NAME_PREFIX + String.valueOf(number))).start();
    }
}
