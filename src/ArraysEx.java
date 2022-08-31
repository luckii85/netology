import Classes.Person;

import java.util.Arrays;

public class ArraysEx {

    public static void ArrayExample() {
        int[] arr = new int[5];       // создание числового массива из пяти переменных (по умолчанию 0)
        arr[0] = 5;                   // присваивание первой переменной значения 5
        arr[1] = 4;

        int[] arr2 = {10, 20, 30};   // создание числового массива из трех переменных (10, 20, 30);

        Person[] arr3; // создание имени (ссылки) массива (без всего остального)
        arr3 = new Person[]{   // создание массива ссылок ('new Person[]') (объекты еще не созданы, ссылки пустые (без объектов))
                new Person("object1", 1), // создание одного объекта класса массива
                new Person("object2", 2)};

        int[][] arr4 = new int[3][]; // двумерный массив (массив из массивов, набор из наборов)
        arr4[0] = new int[1];
        arr4[1] = new int[4];
        arr4[2] = new int[2];

        int[][] arr5 = new int[3][5];

        int[][] arr6 = {
                new int[3], new int[1], {2, 22, 222}
        };
        System.out.println(Arrays.toString(arr) + "\n" + Arrays.toString(arr2) + "\n" + Arrays.toString(arr3) + "\n" + Arrays.deepToString(arr4)
                + "\n" + Arrays.deepToString(arr5) + "\n" + Arrays.deepToString(arr6));
    }

}

// String[] names2 = names.clone(); - копирование значений массива "имена" в массив "имена2"
// Arrays.sort(names); - сортирует массив "имена"
