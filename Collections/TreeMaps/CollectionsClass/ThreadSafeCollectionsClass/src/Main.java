//import java.util.List;
//
//static class SynchronizedList<E>
//        extends SynchronizedCollection<E>
//        implements List<E> {
//    private static final long serialVersionUID = -7754090372962971524L;
//
//    final List<E> list;
//
//    SynchronizedList(List<E> list) {
//        super(list);
//        this.list = list;
//    }
//    SynchronizedList(List<E> list, Object mutex) {
//        super(list, mutex);
//        this.list = list;
//    }
//
//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        synchronized (mutex) {return list.equals(o);}
//    }
//    public int hashCode() {
//        synchronized (mutex) {return list.hashCode();}
//    }
//
//    public E get(int index) {
//        synchronized (mutex) {return list.get(index);}
//    }
//    public E set(int index, E element) {
//        synchronized (mutex) {return list.set(index, element);}
//    }
//    public void add(int index, E element) {
//        synchronized (mutex) {list.add(index, element);}
//    }
//    public E remove(int index) {
//        synchronized (mutex) {return list.remove(index);}
//    }
//
//}