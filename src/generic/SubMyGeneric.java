package generic;

import java.lang.reflect.Array;

public class SubMyGeneric<T> extends MyGeneric<T> {
    private T[] array;

    public SubMyGeneric() {
        //编译不通过
        //array = new T[10];
        //编译通过
        array = (T[]) new Object[10];

        array = (T[]) Array.newInstance(Integer.class,10);
    }
}
