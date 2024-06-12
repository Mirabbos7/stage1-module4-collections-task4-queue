package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            // Eat everyDishNumberToEat dishes
            for (int i = 0; i < everyDishNumberToEat; i++) {
                // If queue is empty, break the loop
                if (queue.isEmpty()) {
                    break;
                }
                // Eat the next dish
                int eatenDish = queue.poll();
                list.add(eatenDish);
            }
            // Rotate the queue
            if (!queue.isEmpty()) {
                int lastDish = queue.poll();
                queue.offer(lastDish);
            }
        }
        return list;
    }
}
