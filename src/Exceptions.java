public class Exceptions {

    public static void exception(String text) {
        System.out.println("Hello!");

        try {                                           // при возникновении ошибки, переходит к "catch" блоку; также можно в "попробуй
            char c = get10th(text);            // в () прописать завершение процессов, вместо "finally"
            System.out.println("10th char is:" + c);
        } catch (
                StringIndexOutOfBoundsException e) {   // если ошибка соответствует, то записывает отчет ("е"), можно прописать "Exception" (все ошибки)
            System.out.println("Error 1!");               // выполняет команды "ловки" и далее продолжает выполнять программу
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error 2!");
        } finally {    // выполнит в любом случае, если произошла ошибка
            System.out.println("!!!");
        }
    }

    public static char get10th(String text) {
        System.out.println("Extraction symbol!");
        char c = text.charAt(10);
        System.out.println("Extraction done!");
        return c;
    }


    // проверяет равно ли введенное имя и фамилия по длине
    public static boolean sameLenght(String text) {//throws NameInputMismatchException { // "выкидывание" указывает, что мы смирились, что
        String[] parts = text.split(" "); // может быть ошибка, и в ее случае, мы ее показываем пользователю
        // "выкидывание" также надо указать и в "главном" методе
        if (parts.length != 2) { // если пользователь не вводит две "текста", то возникает ошибка, программа "умирает" и
            throw new NameInputMismatchException(text); // "выбрасывает" сообщение с "созданной" ошибкой
        }
        String name = parts[1];
        String lastname = parts[0];
        return name.length() == lastname.length();
    }


}





