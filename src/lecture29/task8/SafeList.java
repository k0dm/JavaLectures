package lecture29.task8;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class SafeList<T> implements List<T> {
    private final List<T> list;

    public SafeList(List<T> list) {
        this.list = list;
    }


    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return list.iterator();
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public boolean add(T o) {
        boolean result = false;
        if (o != null && !contains(o)) {
            list.add(o);
            result = true;
        }
        return result;
    }

    @Override
    public void add(int index, T element) {
        if (index >= 0 && index < size()) {
            list.add(index, element);
        }
    }

    @Override
    public boolean remove(Object o) {
        return remove(o);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (T t : c) {
            add(t);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {

        for (T t : c) {
            add(index, t);
        }
        return true;
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public T get(int index) {
        T result = null;
        if (index >= 0 && index < size()) {
            result = list.get(index);
        }
        return result;
    }

    @Override
    public T set(int index, T element) {
        T result = null;
        if (index >= 0 && index < size() && element != null) {
            result = list.set(index, element);
        }
        return result;
    }


    @Override
    public T remove(int index) {
        T result = null;
        if (index >= 0 && index < size()) {
            result = list.remove(index);
        }
        return result;
    }

    @Override
    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return list.lastIndexOf(0);
    }

    @NotNull
    @Override
    public ListIterator listIterator() {
        return list.listIterator();
    }

    @NotNull
    @Override
    public ListIterator listIterator(int index) {
        return listIterator(index);
    }

    @NotNull
    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex >= 0 && toIndex >= 0 && fromIndex < size() && toIndex < size()){
            return list.subList(fromIndex, toIndex);
        }
            return Collections.emptyList();
    }

    @Override
    public boolean retainAll(@NotNull Collection c) {
        return list.retainAll(c);
    }

    @Override
    public boolean removeAll(@NotNull Collection c) {
        return list.remove(c);
    }

    @Override
    public boolean containsAll(@NotNull Collection c) {
        return list.contains(c);
    }

    @NotNull
    @Override
    public <T> T[] toArray(T[] a) {
        return list.toArray(a);
    }
}
