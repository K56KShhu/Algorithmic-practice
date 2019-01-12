package chapter1.section3;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author zkyyo
 * @since 2018-08-20 19:57
 **/
public class MyStack<Item> implements Iterable<Item>{
    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private class MyIterator implements Iterator<Item> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Item next() {
            return null;
        }

        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer<? super Item> action) {

        }
    }
}
