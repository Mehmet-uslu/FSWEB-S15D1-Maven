package org.example.models;

import java.util.ArrayList;
import java.util.Collections;

public class Grocery {

    public static ArrayList<String> groceryList = new ArrayList<>();

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            item = item.trim().toLowerCase();
            if (!groceryList.contains(item)) {
                groceryList.add(item);
            }
        }
        Collections.sort(groceryList);
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            item = item.trim().toLowerCase();
            groceryList.remove(item);
        }
        Collections.sort(groceryList);
    }

    public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product.trim().toLowerCase());
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        System.out.println("Güncel Liste: " + groceryList);
    }
}
