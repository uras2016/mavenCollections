package ua.goit.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public interface Collections {
    int REPETITION = 100;
    int SIZE1 = 10000;
    int SIZE2 = 100000;
    int SIZE3 = 1000000;


    long getAverageTimeForAdd(List<Integer> list);

    long getAverageTimeForGet(List<Integer> list);

    long getAverageTimeForRemove(List<Integer> list);

    long getAverageTimeForContains(List<Integer> list);

    long getAverageTimeForPopulate(List<Integer> list, int size);

    long getAverageTimeForIteratorAdd(List<Integer> list);

    long getAverageTimeForIteratorRemove(List<Integer> list);


    long getAverageTimeForAdd(Set<Integer> set);

    long getAverageTimeForGet(Set<Integer> set);

    long getAverageTimeForRemove(Set<Integer> set);

    long getAverageTimeForContains(Set<Integer> set);

    long getAverageTimeForPopulate(Set<Integer> set, int size);


    long getAverageTime(ArrayList<Long> list);


}
