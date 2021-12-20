package pl.jakusz.silkycoders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class WebViewController implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index3");
        registry.addViewController("/index").setViewName("index3");
        registry.addViewController("/doswiadczenie").setViewName("doswiadczenie");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/sc").setViewName("sctable");
    }
}
