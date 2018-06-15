package Test;

import Array.Array;
import Queue.Queue;
import Queue.ArrayQueue;
import Queue.LoopQueue;
import Stack.ArrayStack;

import java.util.Random;

public class Main {

    //测试使用q运行opCount个enQueue和deQueue操作所需要的时间，单位:秒
    private static double testQueue(Queue<Integer> q, int opCount) {
        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < opCount; i++)
            q.enqueue(random.nextInt(Integer.MAX_VALUE));

        for (int i = 0; i < opCount; i++)
            q.dequeue();

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {

        int opCount = 100000;

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>();
        double time1 = testQueue(arrayQueue, opCount);
        System.out.println("ArrayQueue, Time: " + time1 + " s");

        LoopQueue<Integer> loopQueue = new LoopQueue<Integer>();
        double time2 = testQueue(loopQueue, opCount);
        System.out.println("ArrayQueue, Time: " + time2 + " s");


    }
}


