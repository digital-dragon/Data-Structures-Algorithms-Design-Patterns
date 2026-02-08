import java.util.function.Function;

public class DynamicArray<T> {
    private T[] array;
    private int count = 0;
    private int size = 0;

    @SafeVarargs
    public final void push(T... items) {
        for (int i = 0; i < items.length; i++) {
            if (size == 0) {
                this.array = (T[]) new Object[]{null};
                array[0] = items[i];
                count = 1;
                size = 1;
                return;
            }
            if (count == size) array = scaleUp();
            array[count++] = items[i];
        }
    }

    @SafeVarargs
    public final void unShift(T... items) {
        int itemsLength = items.length;
        int newCount = itemsLength + count;
        if (newCount > size) scaleUp();
        T[] newArray = (T[]) new Object[size];

        for(int i = count-1; i >= 0 ; i--) {
            newArray[i+itemsLength] = array[i];
        }
        for(int i = 0; i < itemsLength; i++) {
            newArray[i] = items[i];
        }
        array = newArray;
    }

    public T pop() {
        var poppedValue = array[--count];
        array[count] = null;
        int halfSize = size/2;
        if (count < halfSize) array = scaleDown();
        return poppedValue;
    }

    public T shift() {
        var shiftedValue = array[0];
        for(int i = 0; i < count - 1; i++) {
            array[i] = array[i+1];
        }

        array[--count] = null;
        int halfSize = size/2;
        if (count < halfSize) array = scaleDown();
        return shiftedValue;
    }

    public boolean every(Function<T, Boolean> function) {
        for (int i = 0; i < count; i++) {
            if (!function.apply(array[i])) return false;
        }
        return true;
    }

    public boolean some(Function<T, Boolean> function) {
        for (int i = 0; i < count; i++) {
            if (function.apply(array[i])) return true;
        }
        return false;
    }

    public int size() {
        return count;
    }

    public void print() {
        System.out.println();
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            sb.append(" ").append(array[i]);
            if(i != count - 1) sb.append(",");
        }
        sb.append(" ]");
        System.out.println(sb);
    }

    private T[] scaleUp() {
        int newSize = size * 2;
        T[] newArray = (T[]) new Object[newSize];
        int currentCount = count;
        for (int i = 0; i < currentCount; i++) {
            newArray[i] = array[i];
        }
        size = newSize;
        return newArray;
    }

    private T[] scaleDown() {
        T[] newArray = (T[]) new Object[count];
        System.arraycopy(array, 0, newArray, 0, count);
        size = count;
        return newArray;
    }
}
