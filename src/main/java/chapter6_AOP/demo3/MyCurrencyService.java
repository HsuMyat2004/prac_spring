package chapter6_AOP.demo3;


import org.springframework.stereotype.Component;

@Component
@Secured // annotation noted class will work (all methods)
//("myCurrency") // bean noted AOP so that all methods under this bean will work
public class MyCurrencyService {
    // annotation noted method only will work
   // @InTransaction

    public void changeCurrency(String name, double amount) {}

    public void changeCurrency(String name, String to, double amount) {}

    public String changeCurrencyName(CurrencyType type) {
        return String.valueOf(type);
    }


    public String changeCurrencyCountryName(CurrencyType type) {
        if (CurrencyType.US.equals(type)) {
            return "USA";
        }
        throw new IllegalArgumentException("Invalid Country Name");
    }


}
