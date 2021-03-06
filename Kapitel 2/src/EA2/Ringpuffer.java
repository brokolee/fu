package EA2;

public class Ringpuffer {

    private Entry Queue, insertHelper, printHelper;

    private int size;

    public Ringpuffer(int size) throws IllegalArgumentException {
        this.size = size;
        if (size <= 0) {
            throw new IllegalArgumentException("Ring muss mindestens die Größe 1 haben!");
        } else {

            Queue = new Entry(null, null, null);
            Entry newEntry = new Entry(null, null, null);
            Queue.next = newEntry;
            for (int i = 0; i < size - 1; i++) {
                newEntry.next = new Entry(null, null, newEntry);
                newEntry = newEntry.next;
            }
            newEntry.next = Queue.next;
            Queue.next.previous = newEntry;
            insertHelper = new Entry(null, null, null);
            insertHelper.next = Queue.next;
        }

    }
    
    public void insert(String text) {
        insertHelper.next.element = text;
        insertHelper.next = insertHelper.next.next;
    }

    public void print() {
        printHelper = new Entry(null, null, null);
        printHelper = Queue.next;

        do {
            //Check einfügen für Ring(1) Ring(0)!!
            printHelper = printHelper.previous;
            if (printHelper.element != null) {
                System.out.println(printHelper.element);
            }
        } while (printHelper != Queue.next);
        System.out.println("////////////////");
    }

    public int size() {
        return size;

    }

    private class Entry {
        private String element;
        private Entry next;
        private Entry previous;

        private Entry(String element, Entry next, Entry previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;

        }

    }

}

/*
 * public String removeLast() { Entry lastEntry = header.previous; if (lastEntry == header) throw new
 * java.util.NoSuchElementException(); lastEntry.previous.next = tail; lastEntry.next.previous = lastEntry.previous;
 * size--; return lastEntry.element; }
 */
