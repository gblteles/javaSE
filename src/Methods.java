public class Methods {
    static void show(int... x)
    {
        for(int i : x)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        show(10,290,32,42,112);
    }
}
