package pl.jakusz.silkycoders.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.jakusz.silkycoders.service.LppOffertService;

@Controller
@Slf4j
public class FirstPage {

    @Autowired
    private LppOffertService lppOffertService;

    @GetMapping("/sca")
    public String lppOffert(Model model) {
        model.addAttribute("offertLpp", lppOffertService.getAllLppOffert());
        return "sctable";
    }
}
