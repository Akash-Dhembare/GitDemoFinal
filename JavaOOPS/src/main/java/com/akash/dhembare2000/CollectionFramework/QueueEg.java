package com.akash.dhembare2000.CollectionFramework;

import java.util.PriorityQueue;

public class QueueEg {
    public static void main(String[] args) {
        PriorityQueue priorityQueue= new PriorityQueue();
        priorityQueue.offer("10");
        priorityQueue.offer("20");
        priorityQueue.offer("50");
        priorityQueue.offer("20");
        priorityQueue.offer("40");

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
    }
}
