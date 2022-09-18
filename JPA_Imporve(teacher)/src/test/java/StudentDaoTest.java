import Dao.Impl.StudentDao;
import org.junit.Test;
import Entity.Student;

public class StudentDaoTest {
    StudentDao sDao = new StudentDao();
    @Test
    public void createStu(){
        Student s =new Student();
        s.setName("新用户");
        s.setSex(false);
        s.setPassword("123456");
        sDao.save(s);
    }

    @Test
    public void findOne(){
        Student one = sDao.getOne(4L);
        System.out.println(one.getName());
    }

    @Test
    public void UpdateStuInfo(){
        Student one = sDao.getOne(4L);
        one.setAge(25);
        sDao.update(one);
    }

    @Test
    public void Login(){
        String name="新用户";
        String password="123456";
        System.out.println(sDao.Login(name,password));
    }

    @Test
    public void refletTest(){

    }
}
