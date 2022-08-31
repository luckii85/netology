import java.util.Scanner;

public class scanner {

    public static void scannerExam() {

        Scanner input = new Scanner(System.in); // ввод через консоль (System.in)
        while (true) {

            String lineIn = input.nextLine(); // метод считывания строки .nextLine(); не использовать с другими методами .next() !!!
            // .next() - считывание текста, .nextInt(), .nextDouble()
            String[] parts = lineIn.split(" "); // функция разделяет строку "вход" по разделителю "пробел" (" "), передает значения в массив "части"
            int x = Integer.parseInt(parts[0]); // "переводит" текст в число (без ошибки будет только если только число ("5f", "5 fd" ошибка))
            System.out.println(x);
        }

    }

}

//        if (input.hasNextInt()) {       // если (введенное является целым числом) {то...
//        int x = input.nextInt();
//        System.out.println(x);}