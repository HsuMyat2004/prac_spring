package programmatic_bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        /*
        (1) first way to try register bean for programmatic way
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = new Parrot();
        parrot.setName("Koko");

        Supplier<Parrot> parrotSupplier = () -> parrot;

//        context.registerBean((String) null,
//                Parrot.class,parrotSupplier);

        // OR //
       // context.registerBean(Parrot.class, parrotSupplier);

        // OR //
        context.registerBean("parrot1",Parrot.class, parrotSupplier);
        Parrot p = context.getBean(Parrot.class);

        System.out.println(p.getName());
        (1) ==========================================
         */
        /*
      */

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // spring bean name , bean class, supplier and bean definition customizer
        context.registerBean("parrot1", Parrot.class,
                () -> new Parrot("Ki Ki"),bc -> bc.setPrimary(true));
        /*
         bc -> bc.setPrimary(true) is “Make this bean the default Parrot bean Spring should use.”
         It's from interface of BeanDefinitionCustomizer
         */

        context.registerBean("parrot2", Parrot.class,
                () -> new Parrot("Ko Ko"));

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}
