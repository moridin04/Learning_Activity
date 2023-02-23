import java.util.*;

public class Exercise30_14 {

    private static final int LIST_SIZE = 9000000;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(LIST_SIZE);
        for (int i = 0; i < LIST_SIZE; i++) {
            list.add(0);
        }
        long startTime = System.currentTimeMillis();
        sequentialAlgorithm(list);
        long endTime = System.currentTimeMillis();
        long seqTime = endTime - startTime;
        System.out.println("Sequential time: " + seqTime + " ms");
        
        startTime = System.currentTimeMillis();
        parallelAlgorithm(list);
        endTime = System.currentTimeMillis();
        long parTime = endTime - startTime;
        System.out.println("Parallel time: " + parTime + " ms");
    }

    public static void sequentialAlgorithm(List<Integer> list) {
        for (int i = 0; i < LIST_SIZE; i++) {
            list.set(i, i);
        }
    }

    public static void parallelAlgorithm(List<Integer> list) {
        for (int i = 0; i < LIST_SIZE; i++) {
            list.set(i, i);
        }
    }
}
