package netgloo.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by apple on 5/29/17.
 */
@Entity
@Table(name = "service")
public class Service {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
