package netgloo.models.entity;

import javax.persistence.*;

/**
 * Created by apple on 5/30/17.
 */
@Entity
@Table(name = "worker_services")
public class WorkerServices {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSubServiceId() {
        return subServiceId;
    }

    public void setSubServiceId(Integer subServiceId) {
        this.subServiceId = subServiceId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Column(name = "price")
    private Integer price;


    @Column(name = "sub_service_id")
    private Integer subServiceId;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

}
