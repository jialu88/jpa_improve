import Entity.Student;
import Dao.StudentDao;
import org.junit.Test;

public class StudentDaoTest {



    @Test
//    public void createStu(){
//        StudentDao sDao = new StudentDao();
//        Student s1 = new Student();
////        s1.setStuId(0325);
//        s1.setName("葡萄");
//        s1.setSex(true);
//        s1.setAge(17);
//        s1.setPassWord("123456");
//        sDao.save(s1);
//
//    }

//    public void updateStu(){
//        StudentDao sDao = new StudentDao();
//        Student s1 = new Student();
//        s1.setStuId(1);
//        s1.setName("葡萄3");
//        s1.setSex(false);
//        s1.setAge(17);
//        s1.setPassWord("123456");
//        sDao.update(s1);
//    }

    public void deleteStu(){
        StudentDao sDao = new StudentDao();
        Student s1 = new Student();
        sDao.delete(6L);
    }
}
