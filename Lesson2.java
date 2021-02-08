public class Lesson2 {
   /* public static void main(String[] args) {

        System.out.println("\r\n1 - задание");
        int[] mass = {0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1};
        for (int i = 0; i < mass.length; i++) {
            mass[i] = mass[i] == 1 ? 0 : 1;
            System.out.print(mass[i] + " ");
        }
    }*/

   /* public static void main(String[] args) {
        int[] mass = new int[8];
        for (int i = 0, j = -2; i < mass.length; i++) mass[i] = j += 3;
        for (int x : mass) System.out.print(x + " ");
    }

*/
  /* public static void main(String[] args) {
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 6) mass[i] *= 2;
            System.out.print(mass[i] + " ");
        }
    } */

   /*public static void main(String[] args) {
        int[] mass = {8, 12 ,53, 2 ,4 ,7, 1, 6, 5, 14};
        int min = mass[0], max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.println("Максимальный элемент имеет значение  = " + max);
        System.out.println("Минимальный элемент имеет значение  = " + min);
    } */

   /*public static void main(String[] args) {
         int[][] mass = new int[7][7];
         for (int i = 0; i < mass.length; i++) {
            for (int j = 0, j2 = mass[i].length; j < mass[i].length; j++, j2--) {
               if (i == j || i == (j2 - 1)) mass[i][j] = 1;
               System.out.print(mass[i][j] + " ");
          }
          System.out.print("\r\n");
      }
 }*/
}