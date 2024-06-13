package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        if (firstQueue.size() >= 2 && secondQueue.size() >= 2) {
            deque.add(firstQueue.poll());
            deque.add(firstQueue.poll());
            deque.add(secondQueue.poll());
            deque.add(secondQueue.poll());
        }

        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            if (!deque.isEmpty()) {
                firstQueue.add(deque.poll());
            }
            if (firstQueue.size() >= 2) {
                deque.add(firstQueue.poll());
                deque.add(firstQueue.poll());
            }

            if (!deque.isEmpty()) {
                secondQueue.add(deque.poll());
            }
            if (secondQueue.size() >= 2) {
                deque.add(secondQueue.poll());
                deque.add(secondQueue.poll());
            }
        }

        return deque;
    }
}
