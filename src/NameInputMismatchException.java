public class NameInputMismatchException extends RuntimeException {  // создание собственной ошибки
    public NameInputMismatchException(String text) {
        super("Error! Need to write name & lastname, but you write: " + text);
    } // конструктор "ошибки", в скобках "текст" о самой ошибке
}
