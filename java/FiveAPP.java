public class FiveAPP {
        public static void main(String[] args) {
            int year = 2000;
            if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
                System.out.println(year + " г. не високосный");
            else System.out.println(year + " г. високосный");
        }

    }