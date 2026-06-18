package inter.datastructure;

public class GenericClass <E> {
    private E[] elements;
    private int size;
    private int currentLength;

    public GenericClass(int size) {
        this.size = size;
        elements = (E[]) new Object[size];
    }

    public int length() {
        return currentLength;
    }

    public boolean isFull() {
        return currentLength == size;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentLength() {
        return currentLength;
    }

    public void add(final int index, final E newItem) {
        if (currentLength != size) {
            elements[index] = newItem;
            currentLength++;
            return;
        }
        System.out.println("I Cant be added any item");
    }

    public boolean isEmpty() {
        return currentLength == 0;
    }

    public void clear(final int index) {
        if (isEmpty()) {
            System.out.println("Array is Empty");
            return;
        }
        elements[index] = null;
        currentLength--;
    }

}
