package ua.goit.java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Methods implements Collections {

    ArrayList<Long> averageTimeRecords;


    @Override
    public long getAverageTimeForPopulate(List<Integer> list, int size) {
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;
        for (int i = 0; i < REPETITION; i++) {
            list.clear();
            long startTime = System.nanoTime();
            for (int j = 0; j < size; j++) {
                list.add(j);
            }
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getAverageTimeForAdd(List<Integer> list) {
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;
        for (int i = 0; i < REPETITION; i++) {
            long startTime = System.nanoTime();
            list.add(list.size() / 2, i);
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getAverageTimeForGet(List<Integer> list) {
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;
        for (int i = 0; i < REPETITION; i++) {
            long startTime = System.nanoTime();
            list.get(list.size() / 3);
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getAverageTimeForRemove(List<Integer> list) {
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;
        for (int i = 0; i < REPETITION; i++) {
            long startTime = System.nanoTime();
            list.remove(list.size() / 5);
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getAverageTimeForContains(List<Integer> list) {
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;
        for (int i = 0; i < REPETITION; i++) {
            long startTime = System.nanoTime();
            list.contains(1000);
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getAverageTimeForIteratorAdd(List<Integer> list) {
        ListIterator<Integer> litr = list.listIterator();
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;
        for (int i = 0; i < REPETITION; i++) {
            long startTime = System.nanoTime();
            while (litr.hasPrevious()) {
                litr.previous();
                litr.add(5);
            }
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }


    @Override
    public long getAverageTimeForIteratorRemove(List<Integer> list) {
        ListIterator<Integer> litr = list.listIterator();
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;
        for (int i = 0; i < REPETITION; i++) {
            long startTime = System.nanoTime();
            while (litr.hasPrevious()) {
                litr.previous();
                litr.remove();
            }
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getAverageTimeForAdd(Set<Integer> set) {
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;
        for (int i = 0; i < REPETITION; i++) {
            long startTime = System.nanoTime();
            set.add(i);
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getAverageTimeForGet(Set<Integer> set) {
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;
        for (int i = 0; i < REPETITION; i++) {
            long startTime = System.nanoTime();
            for (Integer j : set)
                set.iterator().next();
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }


    @Override
    public long getAverageTimeForRemove(Set<Integer> set) {
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;
        for (int i = 0; i < REPETITION; i++) {
            long startTime = System.nanoTime();
            set.remove(i);
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getAverageTimeForContains(Set<Integer> set) {
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;
        for (int i = 0; i < REPETITION; i++) {
            long startTime = System.nanoTime();
            for (int j = 0; j < set.size(); j++)
                set.contains(1000);
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getAverageTimeForPopulate(Set<Integer> set, int size) {
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;
        for (int i = 0; i < REPETITION; i++) {
            set.clear();
            long startTime = System.nanoTime();
            for (int j = 0; j < size; j++) {
                set.add(j);
            }
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getAverageTime(ArrayList<Long> list) {
        int result;
        int sum = 0;
        for (Long i : list) {
            sum += i;
        }
        result = sum / list.size();
        return result;
    }
}
