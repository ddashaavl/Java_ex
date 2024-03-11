package Homework;

public class dz1ex2_2 {
    public static void main(String[] args) {
  //      int[] name;
    //    name = new int[]{1, 2, 3, 4, 5};
      //  System.out.print(name[1]); //программа на выведение 2-го элемента
        String[] str = {"1","2","3","4","5","6","7"};
        int len = str.length;
        for (int i=1;i<len;i+=2){
            System.out.println(str[i]);
        }
    }
}
