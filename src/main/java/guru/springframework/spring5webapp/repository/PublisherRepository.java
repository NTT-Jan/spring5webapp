package guru.springframework.spring5webapp.repository;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
