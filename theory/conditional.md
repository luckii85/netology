### Условные операторы

1. операторы
* `<=` `<` `==` `>` `>=`    (`=` - присвает значение, `==` - сравнивает значения); 
* `&&` - и; `||` - или;
* `var.equals("value")` - сравнивает значения объектов; `==` - сравнивает ссылки объектов; 
* `!` - не равно (!=, !var.equals("value"), !function() (если, например, она возвращает "правда-ложь"));
---
2. **if** 
* `простое если` : if (condition) {action} - если (выполнится условие) {то выполнится следующее} : (если-тогда);

```java 
if (x > 0) System.out.println('1');
```

* `расширенное если` : if... else if... (если-тогда -> в_другом_случае-если-тогда -> ...);
 
```java
if (x > 0 && x < 3) System.out.println('1'); else if (x >=3 && x < 5 ) System.out.println('2');
```
* `полное если` : if... else {action} - (последнее 'else' означает "во всех остальных случаях");

```java
if (x > 0 && x < 3) System.out.println('1'); else if (x >=3 && x < 5 ) System.out.println('2'); else System.out.println('3');
```
---
3. `switch` ("переключатель");  
<details> 
<summary> example </summary>

```java
int condition = 5;
        switch (condition) {
            case "1":                   // если переменная равна "1" то будет печать переменной х два раза, так как
                System.out.println("1-1");  // без "break;" оператор не будет заканчиваться и будет выполняться следующая команда
            case "2":                   // если "2", то печать х один раз (брейк завершает условный оператор)
                System.out.println("2");
                break;
            case "3":                   // если будет "3" или "4", то будет печать "3или4"
            case "4":                   //
                System.out.println("3or4");
                break;
            default:                    // (брейк можно не писать) если дефолт, то для всего остального "?"
                System.out.println("?");
        }
```
</details>

---
4. `ternary` ("троичный") "(condition) ? action_one : action_two;" 


```java
 (x>5 || x<10) ? x/2 : x*2; // if (x>5 or x<10), then (x/2), else (x*2);
```
---
[меню](D:\also\Java\Netology\README.md)