/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” 
список. Постараться не обращаться к листу по индексам.*/

import java.util.*;


public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = createList(10, 0, 10);
        System.out.println(list);
        list = reversLinkedList(list);
        System.out.println(list);
    }

    static LinkedList<Integer> reversLinkedList (LinkedList<Integer> list){
        LinkedList<Integer> list2 = new LinkedList<>();
        while (!list.isEmpty()){
            list2.addFirst(list.pop());
        }
        return list2;
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