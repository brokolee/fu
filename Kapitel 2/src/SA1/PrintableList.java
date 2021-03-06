package SA1;

public class PrintableList implements Printable {
    private Entry header = new Entry(null, null, null);
    private int size = 0;
    private ListIterator listiterator;

    public PrintableList() {
        header.next = header;
        header.previous = header;
    }

    public Printable getLast() {
        if (size == 0)
            throw new java.util.NoSuchElementException();
        return header.previous.element;
    }

    public Printable removeLast() {
        Entry lastEntry = header.previous;
        if (lastEntry == header)
            throw new java.util.NoSuchElementException();
        lastEntry.previous.next = lastEntry.next;
        lastEntry.next.previous = lastEntry.previous;
        size--;
        return lastEntry.element;

    }

    public void addLast(Printable printable) {
        Entry newEntry = new Entry(printable, header, header.previous);
        header.previous.next = newEntry;
        header.previous = newEntry;
        size++;
    }

    public int size() {
        return size;
    }

    static private class Entry {
        private Printable element;
        private Entry next;
        private Entry previous;

        private Entry(Printable element, Entry next, Entry previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;

        }

    }

    public class ListIterator {
        private int nextIndex = 0;
        private Entry next = header.next;

        public boolean hasNext() {
            return nextIndex != size;
        }

        /* calls itself and returns every element in the list */
        public Printable next() {
            if (nextIndex == size)
                throw new java.util.NoSuchElementException();
            Printable elem = next.element;
            next = next.next;
            nextIndex++;
            return elem;
        }

    }

    public ListIterator listIterator() {
        return new ListIterator();
    }

    public void print() {
        System.out.println("Listen PRINT gecallt");
    }

}
