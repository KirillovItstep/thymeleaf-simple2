package org.itstep.thymeleafsimple.i18n;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class I18nController {
    @GetMapping("/inter")
    public String getInter(){
        return "inter";
    }
}
