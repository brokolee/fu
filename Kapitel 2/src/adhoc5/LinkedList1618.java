package adhoc5;

class Person {
    String name;
    int birthday; /* in der Form JJJJMMTT */

    Person(String name1, int birthday1) {
        this.name = name1;
        this.birthday = birthday1;
    }

    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Geburtsdatum: " + this.birthday);
    }

    boolean isBirthday(int date) {
        return birthday % 10000 == date % 10000;
    }
}

public class LinkedList1618 {
    Entry header = new Entry(null, null, null);
    int size = 0;

    /* Constructs an empty Linked List. */
    LinkedList1618() {
        header.next = header;
        header.previous = header;
    }

    private static class Entry {
        private Person element;
        private Entry next;
        private Entry previous;

        private Entry(Person element, Entry next, Entry previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }

    /* Returns the last Element in this List. */
    Person getLast() {
        if (size == 0)
            throw new java.util.NoSuchElementException();
        return header.previous.element;
    }
    
    /* Returns the number of elements in this List. */
    int getSize() {
        return size;
    }

    /* Removes and returns the last Element from this List. */
    Person removeLast() {
        Entry lastEntry = header.previous;
        if (lastEntry == header)
            throw new java.util.NoSuchElementException();
        lastEntry.previous.next = lastEntry.next;
        lastEntry.next.previous = lastEntry.previous;
        size--;
        return lastEntry.element;
    }

    /* Appends the given element to the end of this List. */
    void addLast(Person p) {
        Entry newEntry = new Entry(p, header, header.previous);
        header.previous.next = newEntry;
        header.previous = newEntry;
        size++;
    }

    /* Returns the element at given position. */
    Person getElementAt(int position) {
        // Debug print
        System.out.println("Size:" + this.size);
        System.out.println();

        /* catching illegal positions */
        if (position > this.size || position <= 0) { throw new java.util.NoSuchElementException(); }
        Entry helper = this.header;

        for (int i = 0; i < position; i++) {
            helper = helper.next;
            // Debug print
            System.out.println("Position (i):" + i);
            helper.element.print();
            System.out.println();
        }
        return helper.element;
    }
}
