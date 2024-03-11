package Homework;

public class dz1ex1 {
    // public static void main(String[] args) {
    //  for (int i = 0; i < 10; i++) {
    //      for (int j = 0; j < 10; j++) {
    //             System.out.printf ("%5d", (i + 1) * (j + 1));
    //          }
    //         System.out.println();
    //     }
    // }
//}
    public static void main(String[] args) {
        int i = 1;
        while (i < 11) {
            int j = 1;
            while (j < 11) {
                System.out.print(i * j + " ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}