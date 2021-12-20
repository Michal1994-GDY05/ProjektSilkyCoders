package pl.jakusz.silkycoders.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.jakusz.silkycoders.model.AdminUser;

@Repository
public interface AppUserRepo extends JpaRepository<AdminUser, Long> {

    AdminUser findByUsername(String username);
}
