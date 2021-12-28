package pl.jakusz.silkycoders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class WebViewController implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("mainPage");
        registry.addViewController("/index").setViewName("mainPage");
        registry.addViewController("/doswiadczenie").setViewName("experience");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/silkyCodersOfferTable").setViewName("silkyCodersOfferTable");
    }
}
