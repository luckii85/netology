### Типы переменных

1. Дженерики <> (неопределенный тип, устанавливаемый при вызове объекта класса или метода)
<details>
<summary> пример </summary>

```java
// класс
public class Example<T> {   // <какой-то тип>, может быть не один, например <T, U... >
    protected T value;
    public void save(T value) { this.value = value;}
}
Example<String> example = new Example<>(); // <> - указывается нужный тип дженерик класса, in Main
example.save("First"); // in Main
// функция
public static <U> U exam(U first) {
        System.out.println(first);
        return first;
        }
        int result = exam(5); // in Main
```

</details>

---
[меню](D:\also\Java\Netology\README.md)