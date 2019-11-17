package day32.example;

import java.util.ArrayList;

public class JavaMethods {
    public static void main(String[] args) {

        printTechno();        // without parameters
        printText("My super String");

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(9);
        printArrayList(myList);
        //        ArrayList<String> myList2 = new ArrayList<>();
    }

    public static void printTechno() {
        System.out.println("Techno");
    }

    public static void printText(String text) {
        System.out.println(text);
    }

    public static void printArrayList(ArrayList<Integer>numbers) {
        for (int num : numbers) {
            System.out.println(num);
    }

}}