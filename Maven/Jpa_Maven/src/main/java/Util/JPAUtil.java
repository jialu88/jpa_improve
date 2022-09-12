package Util;
import javax.persistence.*;

public class JPAUtil {
    public static EntityManagerFactory factory;
    static {
        factory = Persistence.createEntityManagerFactory("default");
    }


    public static EntityManager getEntity(){
        return factory.createEntityManager();
    }
}
