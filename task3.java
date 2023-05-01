/*Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор*/

import java.util.*;


public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = createList(10, 0, 10);
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        int sum =0;
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        System.out.printf("Сумма всех элементов = %d", sum);
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