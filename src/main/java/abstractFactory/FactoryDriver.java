package abstractFactory;

public class FactoryDriver {
    public static void main(String[] arg)
    {
        TravelFactory getFactory=new TravelFactory();
        Plan p=getFactory.getPlan("Domestic");
        p.getRate();
p.calculate(12);
    }
}
