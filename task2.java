/*Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент 
в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - 
возвращает первый элемент из очереди, не удаляя.*/

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = createList(10, 0, 10);
        System.out.println(list);
        enqueue(list,50);
        System.out.println(list);
        System.out.println(dequeue(list));
        System.out.println(list);
        System.out.println(first(list));
        System.out.println(list);
    }

    static void enqueue(LinkedList<Integer> list, int item){
        list.add(item);
    }

    static int dequeue(LinkedList<Integer> list){
        return list.removeFirst();
    }

    static int first(LinkedList<Integer> list){

        return list.getFirst();
    }

    public static LinkedList<Integer> createList(int capacity, int min, int max){
        LinkedList<Integer> list = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < capacity; i++) {
            list.add((int)(Math.random() * (max-min+1) + min));
        }
        return list;
    }
}