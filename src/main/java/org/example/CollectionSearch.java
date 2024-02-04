package org.example;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class CollectionSearch {
    public static int findFruitIndex(List<String> fruitList, String fruit) {
        Optional<Integer> resultIndex = IntStream.range(0, fruitList.size())
                .filter(i -> fruitList.get(i).equalsIgnoreCase(fruit))
                .boxed()
                .findFirst();
        return resultIndex.orElse(-1); 
    }
}