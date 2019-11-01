package generic;

import java.util.ArrayList;
import java.util.List;

public class MyGeneric<T> {
    int number;
    String name;
    T aGeneric;

    public MyGeneric() {
    }

    public MyGeneric(int number, String name, T aGeneric) {
        this.number = number;
        this.name = name;
        this.aGeneric = aGeneric;
    }

    public T getaGeneric() {
        return aGeneric;
    }

    public void setaGeneric(T aGeneric) {
        this.aGeneric = aGeneric;
    }

    public<E> List<E> copyFromArrayToList(E[] array) {
        List<E> list = new ArrayList<>();
        for (E e : array){
            list.add(e);
        }
        return list;
    }

}
