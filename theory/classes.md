### *Классы*

### 1. Переменные класса;
<details>
<summary> пример </summary>

```Java

String name;
static int numberOfPeople;
int age;
```
</details>

### 2. Конструкторы:
   * возможно создание нескольких конструктров по кол-ву переменных (конструктор определяется по кол-ву переменных);
* при создании нового объекта класса выполнит все, что находится в конструкторе;
<details> 
<summary> пример </summary>

```Java
public Person(String name, int age) { 
        this.name = name;
        this.age = age;
        numberOfPeople++;
        System.out.println("\nCreated: " + name + ", age: " + age + ", [" + numberOfPeople + "]");

public Person() {                     
    this("unknown", 1000);  // обращение к другому конструктору (с двумя аргументами), где "имени" всегда присвается "неизвестно",
    }                       // а "возрасту" - 1000; остальные команды конструктора также будут выполняться!

public Person(String name) {    
        this.name = name;     
        }
```
</details>


3. Изменение и получение переменных объекта класса (сеттеры и геттеры)
   * сеттер может просто менять значение переменной (если закрыт прямой доступ);
   * в сеттере можно установить условия изменения;
<details>
<summary> пример </summary>

```java
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {    
        if (age < 0 || age > 110) {
            System.out.println("invalid age!");
            return;    // завершает метод и ничего не изменяет
        }    
        this.age = age;
    }

    public int getAge() {       
        return age;
    }
```
</details>

4. Функции (методы)
   * можно изменять дефолтные методы
<details>
<summary> пример </summary>

```java
    public String toString() {        // метод вывода имени объекта класса;
        return name + ", age:" + age;  
    }

```
</details>

5. Наследование (`public class Singer extends Person`)
   * потомок имеет все методы предка;
   * потомок может иметь новые переменные, конструкторы, методы и изменять методы предка;
   * если новая переменная будет иметь такое же имя как в классе предка, то внутри этого класса будет использоваться
     именно эта переменная (а не предка);

<details>
<summary> пример </summary>

```java

    int raiting; // новая переменная класса, теперь "певец" будет иметь все поля "человека" и собственную переменную "рейтинг";
    
    public Singer(String name, int age, int raiting) {
        super(name, age);  // указание какой использовать конструктор предка;
        this.raiting = raiting;
    }

@Override        // обозначение, что меняется метод предка, ни на что не влияет;
    public void say(String text) {          // изменение метода "скажи" "класса - человек";
        super.say(text);                    // выполнение метода "скажи" человек через "супер";
        System.out.println("Then " + name + " sing: " + text); // изменение метода "скажи";
```
</details>

### 6. Создание объекта класса;
* сначала создается ссылка (имя) класса, затем создается новый объект через конструктор;
<details>
<summary> пример </summary>

```Java

Person vasya = new Person("Vasya", 15);
        vasya.name = "Petya";
        vasya.setName("Petya");
        System.out.println("Vasya is " + petya.getAge() + " old.");
        Singer olya = new Singer("Olya", 15, 3);
        Person vanya = new Singer("Vanya", 21, 4); // Ваня будет выполнять метод "скажи" из класса "певец", хотя и ссылка будет "человек"
```
</details>
---
[меню](D:\also\Java\Netology\README.md)