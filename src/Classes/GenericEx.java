package Classes;

public class GenericEx<T> {      // <какой-то тип>, может быть не один, например <T, U... >
    protected T value;

    public void save(T value) {
        this.value = value;
    }

    public T getLast() {
        return value;
    }


}
