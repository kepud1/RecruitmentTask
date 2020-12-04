package pierce.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pierce.task.models.Option;
public interface OptionRepository  extends JpaRepository<Option, String>  {
}
