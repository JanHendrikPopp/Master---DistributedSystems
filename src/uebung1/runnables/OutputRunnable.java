package uebung1.runnables;

public class OutputRunnable implements Runnable {

    private String name;

    public OutputRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(name);
        }
    }
}
