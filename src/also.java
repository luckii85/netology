import java.util.ArrayList;

public class also {

    public static void also() {
        long x = 10;
        int i = (int) x; // будет ошибка без уточнения о привидении типа

        char c = '!', c1 = 33;       // символы можно определять и как числовое значение и как "текствое" ('!'), они равнозначны (==)
        System.out.println(c + " " + c1 + '!' + " " + (c + c1 + c));

        double d1 = 0.9, d2 = 0.9;
        if (Math.abs(d2 - d1) < 0.0000001)               // Math.abs - модуль; сравнение чисел с плавающей точкой
            System.out.println("Numbers are equal!");

        ArrayList list = new ArrayList(); // создание списка
        list.add("One");
        list.add("Two");
        list.remove("One");
        System.out.println(list);

        Day_Enum day = Day_Enum.SAT; // нельзя присвоить значение, которых нет в нашем списке (см. Day_Enum)

        // return в цикле???
    }
}