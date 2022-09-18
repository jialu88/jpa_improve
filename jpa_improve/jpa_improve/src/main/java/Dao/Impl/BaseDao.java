package Dao.Impl;

import Dao.IBaseDao;
import Entity.Student;
import Util.JPAUtil;
import javax.persistence.EntityManager;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class BaseDao {
    public class BaseDAO<T> extends IBaseDao {
        private Class<T> clz;

        public BaseDAO(){
            ParameterizedType paramClass = (ParameterizedType)this.getClass().getGenericSuperclass();
            Type[] actualTypeArguments = paramClass.getActualTypeArguments();
            clz = (Class<T>)actualTypeArguments[0];

            Class class1 = getClass();
            System.out.println(class1);

            Class superClass = class1.getSuperclass();
            System.out.println(superClass);

            Type type = class1.getGenericSuperclass();
            System.out.println(type);

            ParameterizedType p = (ParameterizedType)type;
            Type[] typeList = p.getActualTypeArguments();
            clz = (Class<T>)typeList[0];
            System.out.println(clz);
        }
        @Override
        public void save(T object){
            EntityManager manager = JPAUtil.getEntity();
            manager.getTransaction().begin();
            manager.persist(object);
            manager.getTransaction().commit();
            manager.close();
        }

        public List<T> save() {
            return null;
        }

        public void update(Student s) {

        }





        public void delete(Long id) {

        }

        public Student getOne(Long id) {
            return null;
        }

        public List<Student> getAll() {
            return null;
        }
    }
}
