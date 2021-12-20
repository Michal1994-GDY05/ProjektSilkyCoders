package pl.jakusz.silkycoders.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.jakusz.silkycoders.model.AdminUser;
import pl.jakusz.silkycoders.repo.AppUserRepo;

@Service
public class AppUserDetailsService implements UserDetailsService {

    private AppUserRepo appUserRepo;

    @Autowired
    public AppUserDetailsService(AppUserRepo appUserRepo) {
        this.appUserRepo = appUserRepo;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AdminUser user = appUserRepo.findByUsername(username);
        if (user != null){
            return user;
        }
        throw new UsernameNotFoundException("Użytkownik " + username + " nie zostal znaleziony" );
    }

}
