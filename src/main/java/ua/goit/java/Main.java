package ua.goit.java;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        long start = System.currentTimeMillis();

        ArrayListRunner arrayListRunner = new ArrayListRunner();
        LinkedListRunner linkedListRunner = new LinkedListRunner();
        HashSetRunner hashSetRunner = new HashSetRunner();
        TreeSetRunner treeSetRunner = new TreeSetRunner();

        PrintMethods printMethods = new PrintMethods();

        String text;
        text = "EfficiencyOfCollections :";
        System.out.println(text);
        printMethods.write("module1.txt", text);
        text = String.format("%-15s%-8s%-12s%-12s%-12s%-12s%-12s%-15s%-15s%n",
                "|Collection", "|size", "|add", "|get", "|remove", "|contains", "|populate", "|iterator.add", "|iterator.remove");
        System.out.print(text);
        printMethods.update("module1.txt", text);

        text = "------------------------------------------------------------------------------------------------------------------";
        System.out.println(text);
        printMethods.update("module1.txt", text);

        arrayListRunner.runner();

        text = "------------------------------------------------------------------------------------------------------------------";
        System.out.println(text);
        printMethods.update("module1.txt", text);

        linkedListRunner.runner();

        text = "------------------------------------------------------------------------------------------------------------------";
        System.out.println(text);
        printMethods.update("module1.txt", text);

        hashSetRunner.runner();

        text = "------------------------------------------------------------------------------------------------------------------";
        System.out.println(text);
        printMethods.update("module1.txt", text);

        treeSetRunner.runner();

        text = "------------------------------------------------------------------------------------------------------------------";
        System.out.println(text);
        printMethods.update("module1.txt", text);

        System.out.println(System.currentTimeMillis()-start);

    }

}
