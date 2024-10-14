class hello
{
    public static void main(String args[]) 
    {
       Car.brand="H.13";
       Car c = new Car();
       c.setshow(100);
       System.out.println(c.getshow());
       
       
    }
}
class Car
{
    private int speed;
    private String engineType;
    int wheels;
    int seats;
    static String brand;

    public int getshow()
    {
        return speed;
    }
    public void setshow(int s)
    {
        speed=s;
    }

    public static void show1(Car c)
    {
        System.out.println("\n Static Method = "+brand+" "+c.speed);
    }

}
