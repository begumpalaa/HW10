package org.example;

import java.util.List;

import static org.example.CollectionSearch.findFruitIndex;


// Press Shift
public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Orange", "Grape", "Pineapple");
        int foundIndex = findFruitIndex(fruits, "Mango");
        if (foundIndex != -1) {
            System.out.println("Found fruit at index: " + foundIndex);
        } else {
            System.out.println("Fruit not found");
        }
    }
    }