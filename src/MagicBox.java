import java.util.Random;

public class MagicBox<T> {
    T[] items;

    public MagicBox(int length) {
        T[] items = (T[]) new Object[length];
        this.items = (T[]) items;
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                continue;
            } else {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        boolean empty = true;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                empty = false;
                break;
            }
        }
        if (!empty) {
            throw new RuntimeException("Коробка не полна!");
        }
        return items[randomInt];
    }
}