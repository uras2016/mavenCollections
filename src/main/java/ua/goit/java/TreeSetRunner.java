package ua.goit.java;

import java.io.FileNotFoundException;
import java.util.TreeSet;

public class TreeSetRunner extends Methods {
    PrintMethods printMethods = new PrintMethods();

    public void runner() throws FileNotFoundException {

        TreeSet<Integer> tree10k = new TreeSet<Integer>();
        TreeSet<Integer> tree100k = new TreeSet<Integer>();
        TreeSet<Integer> tree1000k = new TreeSet<Integer>();

        String timeForPopulate10 = Long.toString(getAverageTimeForPopulate(tree10k, SIZE1));
        String timeForPopulate100 = Long.toString(getAverageTimeForPopulate(tree100k, SIZE2));
        String timeForPopulate1000 = Long.toString(getAverageTimeForPopulate(tree1000k, SIZE3));

        String timeForAdd10 = Long.toString(getAverageTimeForAdd(tree10k));
        String timeForAdd100 = Long.toString(getAverageTimeForAdd(tree100k));
        String timeForAdd1000 = Long.toString(getAverageTimeForAdd(tree1000k));

        String timeForGet10 = Long.toString(getAverageTimeForGet(tree10k));
        String timeForGet100 = Long.toString(getAverageTimeForGet(tree100k));
        String timeForGet1000 = Long.toString(getAverageTimeForGet(tree1000k));

        String timeForContains10 = Long.toString(getAverageTimeForContains(tree10k));
        String timeForContains100 = Long.toString(getAverageTimeForContains(tree100k));
        String timeForContains1000 = Long.toString(getAverageTimeForContains(tree100k));

        String timeForRemove10 = Long.toString(getAverageTimeForRemove(tree10k));
        String timeForRemove100 = Long.toString(getAverageTimeForRemove(tree100k));
        String timeForRemove1000 = Long.toString(getAverageTimeForRemove(tree1000k));

        String text;

        text = String.format("%-15s%-8s%-12s%-12s%-12s%-12s%-12s%-15s%-15s%n", "TreeSet", "10K", timeForAdd10, timeForGet10, timeForRemove10, timeForContains10, timeForPopulate10, "-", "-");
        System.out.println(text);
        printMethods.update("module1.txt", text);

        text = String.format("%-15s%-8s%-12s%-12s%-12s%-12s%-12s%-15s%-15s%n", "", "100K", timeForAdd100, timeForGet100, timeForRemove100, timeForContains100, timeForPopulate10, "-", "-");
        System.out.println(text);
        printMethods.update("module1.txt", text);

        text = String.format("%-15s%-8s%-12s%-12s%-12s%-12s%-12s%-15s%-15s%n", "", "1000K", timeForAdd1000, timeForGet1000, timeForRemove1000, timeForContains1000, timeForPopulate100, "-", "-");
        System.out.println(text);
        printMethods.update("module1.txt", text);
    }
}

