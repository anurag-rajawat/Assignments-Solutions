package array;

@SuppressWarnings("unchecked")
public class DynamicArray<T> {
    private T[] a;
    private int length; // length, the user think is
    private int capacity; // Actual capacity of array

    public DynamicArray() {
        this(10);
    }

    public DynamicArray(int initialCapacity) {
        if (initialCapacity < 0) throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        this.capacity = initialCapacity;
        a = (T[]) new Object[capacity];
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Clears the Dynamic Array
     */
    public void clear() {
        for (int i = 0; i < size(); i++) {
            a[i] = null;
        }
        length = 0;
    }

    /**
     * Set a value at a particular index, it doesn't allow adding null values
     * @param index at which value needs to be set
     * @param value the value which needs to be set
     */
    public void set(int index, T value) {
        if (value == null) throw new IllegalArgumentException();
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();
        a[index] = value;
    }

    public int indexOf(T obj) {
        for (int i = 0; i < size(); i++) {
            if (a[i].equals(obj)) return i;
        }
        return -1;
    }

    public T get(int index) {
        return a[index];
    }

    /**
     * Checks whether the element is present in the array or not, it doesn't allow null element
     * @param element which needs to be checked whether it's present or not in the array
     * @return index of that particular element
     */
    public boolean contains(T element) {
        if (element == null) throw new IllegalArgumentException();
        for (int i = 0; i < size(); i++) {
            if (a[i].equals(element)) return true;
        }
        return false;
    }


    /**
     * Append the element at the last index of array, it doesn't allow adding null elements
     * @param element which needs to be added in the array
     */
    public void add(T element) {
        if (element == null) throw new IllegalArgumentException();
            if (length + 1 >= capacity) {
            if (capacity == 0) capacity = 1;
            else {
                capacity *= 2;
                T[] newArr = (T[]) new Object[capacity];
                if (size() >= 0) System.arraycopy(a, 0, newArr, 0, size());
                a = newArr;
            }
        }
        a[length++] = element;
    }

    /**
     * Removes an element at a particular index
     * @param rmIndex at which element needs to be removed
     * @return the element present at that particular index
     */
    public T removeAt(int rmIndex) {
        if (rmIndex < 0 || rmIndex >= length) throw new IndexOutOfBoundsException();
        T data = a[rmIndex];
        T[] newArr = (T[]) new Object[length - 1];
        for (int i = 0, j = 0; i < length; i++, j++) {
            if (i == rmIndex) j--;
            else newArr[j] = a[i];
        }
        a = newArr;
        capacity = --length;
        return data;
    }

    @Override
    public String toString() {
        if (size() == 0) return "[]";
        int arrLen = size() - 1;
        if (arrLen == -1) return "[]";
        StringBuilder sb = new StringBuilder().append("[");
        for (int i = 0; i < size(); i++) {
            if (i == arrLen) return sb.append(a[i]).append("]").toString();
            sb.append(a[i]).append(", ");
        }
        return sb.toString();
    }
}
