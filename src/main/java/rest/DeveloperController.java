package rest;

import jakarta.annotation.PostConstruct;
import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tax.Taxable;

import java.awt.*;
import java.util.ArrayList;
import java.util.Map;
@RestController
@RequestMapping("/workintech/developers")

public class DeveloperController {
    Map<Integer, Developer> developers;




    @PostConstruct
    private void init() {
        developers.put(1, new JuniorDeveloper(1, "Junior Dev", 50000.0, Experience.JUNIOR));
        developers.put(2, new MidDeveloper(2, "Mid Dev", 80000.0 , Experience.MID ));
        developers.put(3, new SeniorDeveloper(3, "Senior Dev", 120000.0, Experience.SENIOR));
    }



    @GetMapping("/{id}")
    public Developer getDeveloperById(@PathVariable int id) {
        return developers.get(id);
    }
}
