import java.util.*;

public class ArrayIntList implements IntList{

    // instance fields
    private int[] elementData; //null
    private int size; // keep track of how items are added/removed to ArrayIntList

    private static final int DEFAULT_CAPACITY = 10;

    public ArrayIntList() {
        elementData = new int[DEFAULT_CAPACITY];
        // 0 0 0 0 0 0 0 0 0 0
        // 0 1 2 3 4 5 6 7 8 9
        size = 0;
    }
    /**
     * Appends the specified integer to the end of this list
     * @param value
     */
    @Override
    public void add(int value) {
        elementData[size] = value;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int get(int index) {
        return elementData[index];
    }

    @Override
    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(int index, int value) {

        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i-1];
        }
        elementData[index] = value;
        size++;
    }

    @Override
    public int remove(int index) {
        int removed = elementData[index];

        for (int i = index; i < size; i++) {
            elementData[i] = elementData[i+1];
        }
        size--;
        return removed;
    }

    @Override // checks the inheritance hierarchy for the method toString[]
    // [8, 8, 8, 8, 8, 9] size = 6
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result += ", " + elementData[i];
            }
            return result+ "]";
        }
    }
}
