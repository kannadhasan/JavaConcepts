package singleton;
class Singleton {
    private static Singleton singletonObject=null;

    private Singleton()
    {
   }
    public static Singleton getInstance()
    {
        if(singletonObject==null)
        {
            singletonObject=new Singleton();
            System.out.println("New Object created");
        }
        return singletonObject;
    }

}


