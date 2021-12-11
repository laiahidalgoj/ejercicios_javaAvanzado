package sesiones345.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sesiones345.demo.entities.Bootcamper;

public interface BootcamperRepository extends JpaRepository<Bootcamper, Long> {
}
