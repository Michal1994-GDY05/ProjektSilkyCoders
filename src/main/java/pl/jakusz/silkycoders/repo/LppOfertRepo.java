package pl.jakusz.silkycoders.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.jakusz.silkycoders.model.Lpp;

import java.util.List;

public interface LppOfertRepo extends JpaRepository<Lpp, Long> {
}
