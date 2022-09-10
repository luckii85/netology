### Ошибки (исключения)

1. `Ловушка`: try{body} catch(error1 e){instruction} catch(error2 e){intsruction}... finally {instruction}

<details>
<summary> пример </summary>

```java
try {                                           // при возникновении ошибки, переходит к "catch" блоку
            char c = get10th(text);            
            System.out.println("10th char is:" + c);
        } catch (
                StringIndexOutOfBoundsException e) {   // если ошибка соответствует, то записывает отчет ("е"), можно прописать "Exception" (все ошибки)
            System.out.println("Error 1!");               // выполняет команды "ловушки" и далее продолжает выполнять программу
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error 2!");
        } finally {    // выполнит в любом случае, если произошла ошибка
            System.out.println("!!!");
        }
```

</details>


2. `Выкидывание` (из программы): if (condition) { throw new `name of error(text of error)` }
* можно создавать свои ошибки;

<details>

<summary> пример </summary>

```java
public class MyError1 extends RuntimeException {  // создание собственной ошибки
    public MyError1(Type var) {
        super("My error is " + var); // конструктор "ошибки", `var` - переменная, из-за которой произошла ошибка;
    } 
}
```

</details>

---
[меню](D:\also\Java\Netology\README.md)