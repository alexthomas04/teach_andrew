package apFreeResponse2014.four;

/**
 * Created by Sonicdeadlock on 5/20/2014.
 */
public class TrioComplete implements MenuItem {
    private Sandwhich sandwhich;
    private Salad salad;
    private Drink drink;
    public TrioComplete(Sandwhich san, Salad sal, Drink d){
        salad=sal;
        sandwhich= san;
        drink=d;
    }

    @Override
    public String getName() {
        return sandwhich.getName()+"/"+salad.getName()+"/"+drink.getName();
    }

    @Override
    public double getPrice() {
       double price=0;
        if(salad.getPrice()<drink.getPrice() && salad.getPrice()<sandwhich.getPrice())
            return drink.getPrice()+sandwhich.getPrice();
        else if(sandwhich.getPrice()<salad.getPrice()&& sandwhich.getPrice()<drink.getPrice())
            return drink.getPrice()+salad.getPrice();
        return sandwhich.getPrice()+drink.getPrice();
    }
}
