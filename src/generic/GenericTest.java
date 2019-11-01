package generic;

import org.junit.Test;

import java.util.List;

public class GenericTest {

    @Test
    public void TestGeneric(){
        MyGeneric<Integer> myGeneric = new MyGeneric<Integer>();
        SubMyGeneric subMyGeneric = new SubMyGeneric();
        Integer[] array = new Integer[]{1,2,3};
        //泛型方法的调用
        List<Integer> list = myGeneric.copyFromArrayToList(array);
    }
}
