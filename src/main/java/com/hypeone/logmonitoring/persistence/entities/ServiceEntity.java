ackage br.com.neo.hubai.persistence.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * UserServiceEntity class.
 *
 * @author Matheus Peixoto
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "service")
public class ServiceEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String endpoint;

    @Getter
    @Setter
    private String description;

    @ManyToOne
    private ServiceServerEntity serviceServerEntity;

    @OneToMany(mappedBy = "serviceEntity")
    private Set<ExecutionQueueEntity> executionQueueEntitySet;

    @OneToMany(mappedBy = "serviceEntity")
    private Set<UserServiceEntity> userServiceEntitySet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceEntity that = (ServiceEntity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}