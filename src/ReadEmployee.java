import java.util.Scanner;
public class ReadEmployee
{
    public static void main(String[] args)
    {
        String ClearSunnyDay;
        String word = " Day  ";
        ClearSunnyDay = " 5 Day ";
        final int Num = 5;
        word = Num + word ;
        System.out.println( word );
        if (Num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (Num > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        String name;
        char Hello;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        name = console.nextLine();
        System.out.println("Привет!!! Аяна");
        Hello = console.next().charAt(0);
        System.out.println("Имя" + name + Hello + "Аяна" );
    }
}

