package pierce.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pierce.task.models.Attribute;
public interface AttributeRepository extends JpaRepository<Attribute, String> {
}
