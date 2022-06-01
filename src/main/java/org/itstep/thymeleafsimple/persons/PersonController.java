package org.itstep.thymeleafsimple.persons;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class PersonController {
    @RequestMapping("/persons")
    public String getPersons(Model model){
        List<Person> persons = Arrays.asList(
                new Person("John", "Doe"),
                new Person("Jane", "Doe"),
                new Person("Иван", "Иванов")
                );
        model.addAttribute("persons",persons);
        return "persons";
    }
}
