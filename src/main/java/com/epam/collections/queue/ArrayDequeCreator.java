package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            // Each player adds two cards to the ArrayDeque
            arrayDeque.add(firstQueue.poll());
            arrayDeque.add(secondQueue.poll());

            // Then, each player moves one card from their queue to the end
            firstQueue.add(firstQueue.poll());
            secondQueue.add(secondQueue.poll());
        }

        return arrayDeque;
    }
}
