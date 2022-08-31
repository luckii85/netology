package methods;

public class methods {

    public static void print(int printVar) {          // метод получает переменную, что-то делает, ничего не возвращает
        System.out.println("\n" + printVar);          // локальные переменные живут внутри класса
    }

    public static void print997() {                   // метод ничего не получает, что-то делает, ничего не возвращает
        System.out.println("\n997");
    }

    public static int returnMethod(int variable, int number) {  // метод, который получает два значения и возвращает переменную
        return (variable + number);         // первый "int" указывает на тип возвращаемой переменной
    }                                       // в скобках метода указываются тип и название переменной для получаемого значения

}
