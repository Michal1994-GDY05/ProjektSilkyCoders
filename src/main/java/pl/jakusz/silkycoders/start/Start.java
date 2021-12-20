package pl.jakusz.silkycoders.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pl.jakusz.silkycoders.model.AdminUser;
import pl.jakusz.silkycoders.model.Lpp;
import pl.jakusz.silkycoders.repo.AppUserRepo;
import pl.jakusz.silkycoders.repo.LppOfertRepo;

@Component
public class Start {

    private PasswordEncoder passwordEncoder;
    private AppUserRepo appUserRepo;
    private LppOfertRepo lppOfertRepo;


    @Autowired
    public Start(PasswordEncoder passwordEncoder, AppUserRepo appUserRepo, LppOfertRepo lppOfertRepo) {
        this.passwordEncoder = passwordEncoder;
        this.appUserRepo = appUserRepo;
        this.lppOfertRepo = lppOfertRepo;

        AdminUser user = new AdminUser();
        user.setUsername("Admin");
        user.setPassword(passwordEncoder.encode("Admin123"));
        user.getAuthorities();
        appUserRepo.save(user);

        Lpp lpp = new Lpp();
        lpp.setMiejsce("Gdańsk");
        lpp.setStanowisko("PHP DEVELOPER");
        lppOfertRepo.save(lpp);

        Lpp lpp2 = new Lpp();
        lpp2.setMiejsce("Gdańsk");
        lpp2.setStanowisko("JAVA DEVELOPER");
        lppOfertRepo.save(lpp2);

        Lpp lpp3 = new Lpp();
        lpp3.setMiejsce("Gdańsk");
        lpp3.setStanowisko("SYSTEM ARCHITEKT - APLIKACJE MOBILNE");
        lppOfertRepo.save(lpp3);

        Lpp lpp4 = new Lpp();
        lpp4.setMiejsce("Gdańsk");
        lpp4.setStanowisko("ANALITYCZKA SYSTEMOWA/ ANALITYK SYSTEMOWY");
        lppOfertRepo.save(lpp4);
    }

}
