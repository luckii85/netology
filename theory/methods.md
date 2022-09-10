### Методы

1. метод что-то делает:

* и может ничего не возвращать `void function();`;
* или может возвращать `только одну` переменную (ее тип указывается перед методом) `var function() {... return 'some';}`
  ;
* и в него могут передаваться данные `void function(var1... varN);`;

2. внутри методов свои локальные переменные, они существуют `только внутри него`;
3. метод, как правило, импортируется из класса `class.function();`;

<details>
<summary> example </summary>

```java
int sum(int a,int b){
        return(a+b);
        }
```

</details>

---
[меню](D:\also\Java\Netology\README.md)