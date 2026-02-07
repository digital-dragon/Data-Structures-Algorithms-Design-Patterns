public class DynamicArray<T> {
    private T[] array;
    private int count = 0;
    private int size = 0;

    public void push(T t) {
        if (size == 0) {
            this.array = (T[]) new Object[]{null};
            array[0] = t;
            count = 1;
            size = 1;
            return;
        }
        if (count == size) array = scaleUp();
        array[count++] = t;
    }

    public T pop() {
        var poppedValue = array[--count];
        array[count] = null;
        int halfSize = size/2;
        if (count < halfSize) array = scaleDown();
        return poppedValue;
    }

    public void print() {
        System.out.println("[");
        for (int i = 0; i < count; i++) {
            System.out.print( " " + array[i]);
        }
        System.out.println("\n]");
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
