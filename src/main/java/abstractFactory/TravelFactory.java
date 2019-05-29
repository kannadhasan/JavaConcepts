package abstractFactory;

public class TravelFactory {

    public Plan getPlan(String planType)
    {
     if(planType.equalsIgnoreCase("Domestic"))
     {
         return new Domestic();
     }
        if(planType.equalsIgnoreCase("International"))
        {
            return new International();
        }

        return null;
    }
}
