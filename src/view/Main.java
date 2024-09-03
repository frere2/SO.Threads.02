package view;

import controller.ModThread;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] mat = new int[5][3];

        Random random = new Random();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = random.nextInt(100);
            }
            Thread thread = new ModThread(mat[i]);
            thread.start();
        }
    }
}