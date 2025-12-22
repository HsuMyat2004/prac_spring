package chapter6_AOP.demo1;

public interface CurrencyService {

    // in interface, only public allow for AOP proxy
    void changeCurrency(String type);

}
