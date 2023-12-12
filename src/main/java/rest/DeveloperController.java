package rest;

import jakarta.annotation.PostConstruct;
import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tax.DeveloperTax;
import tax.Taxable;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/workintech/developers")

public class DeveloperController {
    Map<Integer, Developer> developers;
    private Taxable taxable;
    @Autowired
    private DeveloperTax developerTax;




    @PostConstruct
    private void init() {
        developers= new HashMap<>();
    }
   @PostMapping


    @GetMapping("/{id}")
    public Developer getDeveloperById(@PathVariable("id") int id) {
        return developers.get(id);
    }
    @GetMapping
    public List<Developer> getAll(){
        return developers.values().stream().toList();
    }

}
