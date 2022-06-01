package org.itstep.thymeleafsimple.flowers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class FlowerController {

    @RequestMapping("/flowers")
    public String getFlowers(Model model){
        //String[] flowers = new String[]{"Rose", "Lily", "Tulip"};
        List<String> flowers = Arrays.asList("Rose", "Lily", "Tulip");
        model.addAttribute("flowers",flowers);
        return "flowers";
    }
}
