package tax;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
@Component

public class DeveloperTax implements Taxable{


    @Override
    public double getSimpleTaxRate() {
        return 15;
    }

    @Override
    public double getMiddleTaxRate() {
        return 20;
    }

    @Override
    public double getUpperTaxRate() {
        return 25;
    }
}
