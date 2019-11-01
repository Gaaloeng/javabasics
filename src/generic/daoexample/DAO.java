package generic.daoexample;

//表的共性操作DAO
public class DAO<T> {

    //增
    public void add(T data) { }

    //删
    public void delete(T data){ }

    //查
    public void select(T data){ }

    //改
    public void modify(T data){ }

    //泛型方法
    //举例: 可能有"获取表中所有记录总数"的需求;
    //     可能有"获取最大的员工收入"的需求
    //则返回的值就不是这个ORM类了,是另外具体的类
    public <E> E getSomeSpecialValue(){
        return null;
    }
}
