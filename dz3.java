import java.util.*;

public class dz3 {
    public static void main(String[] args) {
        task2(3);
    }
        
    static void task1(int n) {
        //Пусть дан произвольный список целых чисел, удалить из него четные числа
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) % 2 == 0) {
                list.remove(j);
                j--;
            }
        }
        System.out.println(list);
    }
    static void task2(int n){
        //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
        //Collections.max()
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);
        int avrInt = 0;
        for (int i = 0; i < list.size(); i++) {
            avrInt += list.get(i);
        }
        double avrage = avrInt / list.size();
        System.out.printf("Max = %d; Min = %d, average = %f", Collections.max(list), Collections.min(list), avrage);
    }
}



