package org.itstep.thymeleafsimple.products;

import org.itstep.thymeleafsimple.persons.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {
    @RequestMapping("/products")
    public String getProducts(Model model){
        List<Product> products = Arrays.asList(
                new Product(1L,"samsung", "samsung.jpg"),
                new Product(2L, "nokia", null),
                new Product(3L, "iphone", "iphone.jpg")
                );
        model.addAttribute("products",products);
        return "products";
    }
}
