package generic.daoexample;

import org.junit.Test;

public class DAOTest {

    @Test
    public void myDataTest(){
        StudentDao studentDao = new StudentDao();
        studentDao.add(new Student());
        studentDao.delete(new Student());
        studentDao.select(new Student());
        studentDao.modify(new Student());
    }
}
