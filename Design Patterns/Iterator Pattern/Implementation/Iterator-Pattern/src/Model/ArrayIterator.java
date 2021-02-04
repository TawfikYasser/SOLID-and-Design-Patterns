package Model;

import java.util.ArrayList;

public class ArrayIterator implements Iterator{
    Object [] array;
    int position = 0;

    public ArrayIterator(Object[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if(position >= this.array.length) return false;
        else return true;
    }

    @Override
    public Object next() {
        Object temp = this.array[position];
        position++;
        return temp;
    }
}
