package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class course {
    @Id
    private Long CourseId;
    private String CourseName;

}
