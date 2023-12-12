package tax;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeveloperTax implements Taxable{


    @Override
    public void getSimpleTaxRate() {

    }

    @Override
    public void getMiddleTaxRate() {

    }

    @Override
    public void getUpperTaxRate() {

    }
}
