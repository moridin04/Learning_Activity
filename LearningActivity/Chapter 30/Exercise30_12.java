import java.util.*;

public class Exercise30_12 {

    private static final int NUM_ELEMENTS = 9000000;
    private static final int SMALL_LIST_SIZE = 1;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(NUM_ELEMENTS);
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            list.add(0);
        }

        long startTime = System.currentTimeMillis();
        sequentialAssignValues(list);
        long endTime = System.currentTimeMillis();
        long seqTime = endTime - startTime;
        System.out.println("Sequential time: " + seqTime + " ms");
      
        startTime = System.currentTimeMillis();
        parallelAssignValues(list);
        endTime = System.currentTimeMillis();
        long parTime = endTime - startTime;
        System.out.println("Parallel time: " + parTime + " ms");

        
        System.out.println("First 10 elements: " + list.subList(0, 10));
    }

    public static void sequentialAssignValues(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            list.set(i, random.nextInt());
        }
    }

    public static void parallelAssignValues(List<Integer> list) {
        Random random = new Random();
        List<Integer> smallList = new ArrayList<>(SMALL_LIST_SIZE);
        for (int i = 0; i < SMALL_LIST_SIZE; i++) {
            smallList.add(random.nextInt());
        }
        list.parallelStream().forEachOrdered(i -> {
            int index = list.indexOf(i);
            list.set(index, smallList.get(index % SMALL_LIST_SIZE));
        });

    }
}
