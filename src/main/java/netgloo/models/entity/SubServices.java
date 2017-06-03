package netgloo.models.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.*;

/**
 * Created by apple on 5/29/17.
 */
@Entity
@Table(name = "sub_services")
public class SubServices {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;


    @Column(name = "service_id")
    private Integer serviceId;


    @Column(name = "min_price")
    private Integer minPrice;


    @Column(name = "max_price")
    private Integer maxPrice;

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

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }


    public Integer getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }
}
