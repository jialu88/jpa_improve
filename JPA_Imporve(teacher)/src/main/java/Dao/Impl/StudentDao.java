package Dao.Impl;
import Dao.IStudentDao;
import  Entity.Student;
import Util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class StudentDao extends BaseDao<Student> implements IStudentDao {
    @Override
    public boolean Login(String name, String password) {
        EntityManager manager = JPAUtil.getEntityManager();
        String hql = "select s from Student s where s.Name=:username and s.Password=:password";
        Query query = manager.createQuery(hql);
        query.setParameter("username",name);
        query.setParameter("password",password);
        List list = query.getResultList();
        manager.close();
        return list.size()>=1;
    }
}
