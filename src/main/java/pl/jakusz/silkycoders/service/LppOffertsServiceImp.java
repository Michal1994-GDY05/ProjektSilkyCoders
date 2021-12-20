package pl.jakusz.silkycoders.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jakusz.silkycoders.model.Lpp;
import pl.jakusz.silkycoders.repo.LppOfertRepo;

import java.util.List;

@Service
public class LppOffertsServiceImp implements LppOffertService{

    @Autowired
    private LppOfertRepo lppOfertRepo;

    @Override
    public List<Lpp> getAllLppOffert() {
        return lppOfertRepo.findAll();
    }
}
