package Homework;

public class dz1ex2_3 {
    public static void main(String[] args) {
            Integer[] array = {1, 2, 3, null, 3, 4};
            for (int i = 1; i < array.length; i += 2) {
                if (array[i] == null) {
                break;            }
                System.out.println(array[i]);        }
    }
}
