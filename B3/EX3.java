package B3;

import java.util.Random;

public class EX3 {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1;i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args){
        int size = 100000;
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(100000);
        }
        EX3 sw = new EX3();
        sw.start();
        selectionSort(array);
        sw.stop();
        System.out.println("Thoi gian sap xep (ms): " + sw.getElapsedTime());
    }
}
