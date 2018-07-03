package adhoc1;

public class ListWithArray<ET> {
    private Object[] elems;
    private int nextFreeIndex = 0;

    public ListWithArray(int initialCapacity) {
        elems = new Object[initialCapacity < 1 ? 1 : initialCapacity];
    }

    public void addLast(ET elem) {
        if (nextFreeIndex >= elems.length) {
            doublePersonArray();
        }
        elems[nextFreeIndex] = elem;
        nextFreeIndex++;
    }

    public ET removeLast() {
        if (nextFreeIndex == 0)
            throw new java.util.NoSuchElementException();
        ET lastElem = (ET) elems[nextFreeIndex - 1];
        nextFreeIndex--;
        return lastElem;
    }

    public ET getLast() {
        if (nextFreeIndex == 0)
            throw new java.util.NoSuchElementException();
        return (ET) elems[nextFreeIndex - 1];
    }

    public int size() {
        return nextFreeIndex;
    }

    private void doublePersonArray() {
        Object[] newArray = new Object[elems.length * 2];
        for (int i = 0; i < elems.length; i++) {
            newArray[i] = elems[i];
        }
        elems = newArray;
    }
}
