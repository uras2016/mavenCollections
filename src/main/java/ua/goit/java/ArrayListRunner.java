package ua.goit.java;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class ArrayListRunner extends Methods {
    PrintMethods printMethods = new PrintMethods();
    String timeForPopulate10;
    String timeForPopulate100;

    public void runner() throws FileNotFoundException {

        ArrayList<Integer> array10k = new ArrayList<Integer>();
        ArrayList<Integer> array100k = new ArrayList<Integer>();
        ArrayList<Integer> array1000k = new ArrayList<Integer>();


        timeForPopulate10 = Long.toString(getAverageTimeForPopulate(array10k, SIZE1));
        timeForPopulate100 = Long.toString(getAverageTimeForPopulate(array100k, SIZE2));
        String timeForPopulate1000 = Long.toString(getAverageTimeForPopulate(array1000k, SIZE3));

        String timeForAdd10 = Long.toString(getAverageTimeForAdd(array10k));
        String timeForAdd100 = Long.toString(getAverageTimeForAdd(array100k));
        String timeForAdd1000 = Long.toString(getAverageTimeForAdd(array1000k));

        String timeForGet10 = Long.toString(getAverageTimeForGet(array10k));
        String timeForGet100 = Long.toString(getAverageTimeForGet(array100k));
        String timeForGet1000 = Long.toString(getAverageTimeForGet(array1000k));

        String timeForContains10 = Long.toString(getAverageTimeForContains(array10k));
        String timeForContains100 = Long.toString(getAverageTimeForContains(array100k));
        String timeForContains1000 = Long.toString(getAverageTimeForContains(array100k));

        String timeForRemove10 = Long.toString(getAverageTimeForRemove(array10k));
        String timeForRemove100 = Long.toString(getAverageTimeForRemove(array100k));
        String timeForRemove1000 = Long.toString(getAverageTimeForRemove(array1000k));

        String timeForIteratorAdd10 = Long.toString(getAverageTimeForIteratorAdd(array10k));
        String timeForIteratorAdd100 = Long.toString(getAverageTimeForIteratorAdd(array100k));
        String timeForIteratorAdd1000 = Long.toString(getAverageTimeForIteratorAdd(array1000k));

        String timeForIteratorRemove10 = Long.toString(getAverageTimeForIteratorRemove(array10k));
        String timeForIteratorRemove100 = Long.toString(getAverageTimeForIteratorRemove(array100k));
        String timeForIteratorRemove1000 = Long.toString(getAverageTimeForIteratorRemove(array1000k));

        String text;

        text = String.format("%-15s%-8s%-12s%-12s%-12s%-12s%-12s%-15s%-15s%n", "|ArrayList", "|10K", timeForAdd10, timeForGet10, timeForRemove10, timeForContains10, timeForPopulate10, timeForIteratorAdd10, timeForIteratorRemove10);
        System.out.println(text);
        printMethods.update("module1.txt", text);

        text = String.format("%-15s%-8s%-12s%-12s%-12s%-12s%-12s%-15s%-15s%n", "", "|100K", timeForAdd100, timeForGet100, timeForRemove100, timeForContains100, timeForPopulate10, timeForIteratorAdd100, timeForIteratorRemove100);
        System.out.println(text);
        printMethods.update("module1.txt", text);

        text = String.format("%-15s%-8s%-12s%-12s%-12s%-12s%-12s%-15s%-15s%n", "", "|1000K", timeForAdd1000, timeForGet1000, timeForRemove1000, timeForContains1000, timeForPopulate100, timeForIteratorAdd1000, timeForIteratorRemove1000);
        System.out.println(text);
        printMethods.update("module1.txt", text);


    }

}
