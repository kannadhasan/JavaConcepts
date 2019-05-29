package abstractFactory;

abstract class Plan {
   protected double rate;
abstract void getRate();
public void calculate(int unit)
{
    double tot=unit*rate;
    System.out.println("Bill amount: "+tot);
}
}
