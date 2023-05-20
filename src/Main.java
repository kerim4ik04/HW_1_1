public class Main {
    public static void main(String[] args) {
        String homeWork;
        final int NUM = 7;
        String world = " bla bla bla";
        homeWork = NUM + world;
        System.out.println(homeWork + " " + NUM + " " + world);
        if (NUM < 0 ) {
            System.out.println("Вы сохронили отрицательное число");
        } if (NUM > 0){
            System.out.println("Вы сохронили положительное число");
        }else {
            System.out.println("Вы сохронили 0");
        }
    }
}