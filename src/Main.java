import java.util.Scanner; // импорт методов для сканнера

import Classes.GenericEx;
import Classes.Person;
import Classes.Singer;
import methods.methods; // импорт методов из класса, по определенному адресу (в папках) (папка.класс)
// +. можно импортировать отдельно метод, например: "import static methods.Print.print;" (папка.класс.метод)

public class Main {
    public static void main(String[] args) {

//        // todo Методы
//
//        methods.print(999); // перед методом указывается класс (папка указана в импорте или класс находится в общей папке)
//        // +. можно использовать метод без импорта с указанием полного пути
//
//        print("998");  // если без указания пути, с одинаковыми названиями методов, используется метод из класса Main
//        // метод получает значение "998", что-то делает
//
//        methods.print997();  // метод ничего не получает, что-то делает
//
//        int x = 500; // локальная переменная, должна быть определена, работает только внутри класса
//        int returnVariable = methods.returnMethod(x, 496); // метод "returnMethod()" получает два значения 1. переменную "х" и
//        // 2. число "495", что-то делает, возвращает значение, которое присвается переменной returnVariable
//        methods.print(returnVariable);

        // conditional.conditionalExample();  // todo условные операторы
        // cycle.cycles();                    // todo циклы
        // scanner.scannerExam();             // todo сканнер
        // also.also();                       // todo разное
        // ArraysEx.ArrayExample();           // todo массивы


        // todo Объекты, классы
        Person petya = new Person("null", 0);
//      petya.name = "Petya";      // не получится изменить переменную класса, так как она "приватная"
        petya.setName("Petya");
        petya.setAge(8);
        petya.setAge(-8);
        System.out.println(petya + "; age:" + petya.getAge()); //

        Singer olya = new Singer("Olya", 15, 3);
        Person vanya = new Singer("Vanya", 21, 4);
        petya.say("Version");
        olya.say("Version");
        vanya.say("Version"); // "ваня" будет выполнять метод "скажи" из класса "певец", хотя и ссылка будет "человек"

//
//        NewClass class2 = new NewClass("Class2", 2);
//        NewClass class3 = new NewClass("Class3");
//        NewClass class4 = new NewClass();
//        System.out.println(class1 + "  " + class2 + "  " + class3 + "  " + class4+ " - number of classes: " + NewClass.sumOfClasses);

        // todo Generic class
        GenericEx<String> example = new GenericEx<>(); // <> - указывается нужный тип дженерик класса
        example.save("First");
        String value = example.getLast();
        String result = choose(true, "First", "Last");

    }

    public static void print(String printVar) {   // метод получает значение (аргумент), которое присваивается текстовой-переменной printVar,
        // что-то делает, ничего не возвращает
        System.out.println("\n" + printVar);   // внутри методов свои локальные переменные, они не работают вне метода
    }

    public static <U> U choose(boolean flag, U first, U second) {
        if (flag) {
            return first;
        } // метод для генерик типа
        else {
            return second;
        }
    }

}



