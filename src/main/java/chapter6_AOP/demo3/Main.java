package chapter6_AOP.demo3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.registerShutdownHook();

        MyCurrencyService myCurrencyService = context.getBean(MyCurrencyService.class);
        myCurrencyService.changeCurrency("US",1200);
        myCurrencyService.changeCurrency("US","Euro",1230);
        myCurrencyService.changeCurrencyName(CurrencyType.EURO);
        try{
            myCurrencyService.changeCurrencyCountryName(CurrencyType.EURO);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        myCurrencyService.changeCurrencyCountryName(CurrencyType.US);
    }
}
