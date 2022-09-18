import Dao.Impl.StudentDao;
import Entity.Student;
import org.junit.Test;

public class StudentDaoTest {
    StudentDao sDao = new StudentDao();
    @Test
    public void createStu(){
        Student s = new Student();
        s.setStuId();
        s.setStuId();
        sDao.create();
    }
    @Test
    public void Login(){
        String name = "123";
        String password = "fewrw";
        System.out.println(sDao.Login(name,password));

    }
    @Test
    public void reflectTest(){
        StudentDao studentDao = new StudentDao();
    }

}
