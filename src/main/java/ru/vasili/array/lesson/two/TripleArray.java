package ru.vasili.array.lesson.two;


import java.util.Random;
import java.util.concurrent.*;

class MainDZ {private static final int ARRAY_CAPACITY = 100_000;


    public static final int MAX_VALUE = 1000;

    public static void main(String[] args) {
        Array arr1 = new ArrayImpl(ARRAY_CAPACITY);
        Array arr2 = new ArrayImpl(ARRAY_CAPACITY);
        Array arr3 = new ArrayImpl(ARRAY_CAPACITY);

        randomInitialize(arr1, arr2, arr3);


        measureTime(arr1::sortBubble, "Sort Bubble");
        measureTime(arr2::sortSelect, "Sort Select");
        measureTime(arr3::sortInsert, "Sort Insert");
    }

    private static void randomInitialize(Array... arrays) {
        Random random = new Random();

        for (int i = 0; i < ARRAY_CAPACITY; i++) {
            int value = random.nextInt(MAX_VALUE);
            for (Array array : arrays) {
                array.add(value);
            }
        }
    }

    private static void measureTime(Runnable action, String actionName) {
        long startTime = System.nanoTime();
        action.run();
        long finishTime = System.nanoTime();
        long duration = finishTime - startTime;

        System.out.println(String.format("%s took time: %d ms.",
                actionName,
                TimeUnit.NANOSECONDS.toMillis(duration)));
    }

}
