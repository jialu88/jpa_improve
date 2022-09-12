package Dao;
import javax.persistence.*;
import Entity.Student;
import Util.JPAUtil;

import java.util.List;

public class StudentDao {
    public void save(Student s){
        EntityManager manager = JPAUtil.getEntity();
        manager.getTransaction().begin();
        manager.persist(s);
        manager.getTransaction().commit();
        manager.close();
    }

    public void update(Student s){
        EntityManager manager = JPAUtil.getEntity();
        manager.getTransaction().begin();
        manager.merge(s);
//        manager.persist(s);
        manager.getTransaction().commit();
        manager.close();
    }

    public void delete(Long id){
        EntityManager manager = JPAUtil.getEntity();
        manager.getTransaction().begin();
        Student s = manager.find(Student.class,id);
        manager.remove(s);
        manager.getTransaction().commit();
        manager.close();
    }

    public Student getOne(Long id){
        EntityManager manager = JPAUtil.getEntity();
        Student student = manager.find(Student.class, id);
        return student;

    }
    public List<Student> getAll(){
        EntityManager manager = JPAUtil.getEntity();
        String hql = "select p from Entity.Student p";
        Query query = manager.createQuery(hql);
        List<Student> list = query.getResultList();
        manager.close();
        return list;
    }
}
