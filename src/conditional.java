import java.util.Scanner;

public class conditional {


    // todo Условные операторы

    // <= < == > >= && || !         важно: "=" - присваивает значение, "==" - сравнивает значения
    // name.equals("Max")           важно: "==" сравнивает ссылки (ссылочные типы)

    // todo switch
    // "в случае "чего-то" выполнить "что-то" (case :)... в остальных случаях выполнить "что-то2" (default:)
    public static void conditionalExample() {

        System.out.println("\nChoose 1 or 2 or 3 or 4 or else");
        Scanner input = new Scanner(System.in);

        String textIn = input.nextLine();
        int x = 500;

        // switch
        switch (textIn) {
            case "1":                   // если переменная равна "1" то будет печать переменной х два раза, так как
                System.out.println(x);  // без "break;" оператор не будет заканчиваться и будет выполняться следующая команда
            case "2":                   // если "2", то печать х один раз (брейк завершает условный оператор)
                System.out.println(x);
                break;
            case "3":                   // если будет "3" или "4", то будет печать "3или4"
            case "4":                   //
                System.out.println("3or4");
                break;
            default:                    // (брейк можно не писать) если дефолт, то для всего остального "?"
                System.out.println("?");
        }

        if (textIn.equals("1")) {       // повторение кода, но через if-else
            System.out.println(x);
            System.out.println(x);
        } else if (textIn.equals("2"))         // важно: если забыть после "if" поставить "else", то после {}, закончит условный оператор;
            System.out.println(x);           // а после новых if будет считать, что начался новый условный оператор (if-then if-then-else-if...)
        else if (textIn.equals("3") || textIn.equals("4"))
            System.out.println("3or4");
        else
            System.out.println("?");

        // todo ternary (троичный)
        x = (textIn.equals("1")) ? x / 2 : x * 2; // (x = 500) тернарный оператор: if (textIn.equals("1")) then x = 250; else x = 1000;
        System.out.println(x);
        boolean booForX = x < 500; // если (x < 500) то booForX присваивается правда, иначе - ложь;
        x = (booForX) ? 125 : 2000; // если булинДляХ правда, то x = 125, иначе 2000;
        System.out.println(x); // в случае "1" x = 250, booForX = true, x = 125; в других случаях х = 1000, булин = ложь, x = 2000;
    }
}
