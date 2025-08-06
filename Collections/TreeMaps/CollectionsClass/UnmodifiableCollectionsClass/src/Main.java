import javax.print.attribute.UnmodifiableSetException;
import java.util.*;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Korea");
        list.add("Japan");
        list.add("Türkiye");

        List<String> unmodifiableList = Collections.unmodifiableList(list);
        //This will throw exception because element can't be added to unmodifiable list
        unmodifiableList.add("Azerbaycan");

    }
}

//static class UnmodifiableList<E> extends UnmodifiableCollection<E>
//                                    implements List<E>{
//    private static final long serialVersionUID = -283967356065247728L;
//    final List<? extends E> list;
//    UnmodifiableList(List<? extends E> list){
//        super(list);
//        this.list = list;
//    }
//
//    public boolean equals(Object o) {return o == this || list.equals(o);}
//    public int hashCode(){return list.hashCode();}
//
//    public E get(int index){return list.get(index);}
//    public E set(int index, E element){
//        throw new UnsupportedOperationException();
//    }
//    public void add(int index, E element){
//        throw new UnsupportedOperationException();
//    }
//
//    public E remove(int index){
//        throw new UnsupportedOperationException();}
//
//    public int indexOf(Object o) {return list.indexOf(o);}
//    public int lastIndexOf(Object o ){return list.lastIndexOf(o);}
//    public boolean addAll(int index, Collection<? extends E> c){
//        throw new UnsupportedOperationException();
//    }
//
//    @Override
//    public void replaceAll(UnaryOperator<E> operator){
//        throw new UnsupportedOperationException();
//    }
//
//    @Override
//    public void sort(Comparator<? super E> c){
//        throw new UnsupportedOperationException();
//    }
//}