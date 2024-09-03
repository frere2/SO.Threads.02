package controller;

public class ModThread extends Thread {

    int[] vet;

    public ModThread(int[] vet) {
        this.vet = vet;
    }

    @Override
    public void run() {
        int calc = 0;
        for (int i: vet) {
            calc += i;
        }
        System.out.println("Thread " + this.threadId() + " - " + calc);
    }
}
