/*
Created by Brian Kallay
*/

public class WaterBottle
{
    //class variables
    private static int totalBottles;

    //instance variables
    private double capacity; //use private to "protect" the data
    private double currentVolume;

    //constructor
    public WaterBottle(double capacity, double currentVolume)
    {
        this.capacity = capacity;
        this.currentVolume = currentVolume;
        totalBottles++;
    }

    //overloaded constructor
    public WaterBottle(double capacity)
    {
        this.capacity =  capacity;
        currentVolume = 0;
        totalBottles++;
    }


    //method = behavior
    public String getCapacity()
    {
        String info = "Total Capacity: " + capacity;
        return info;
    }

    public String getCurrentVolume()
    {
        String info = "Current Volume: " + this.currentVolume;
        return info;
    }

    public String getInfo()
    {
        String info = getCapacity() + "\n" + getCurrentVolume();
        return info;
    }

    public void setCurrentVolume(Double currentVolume)
    {
        this.currentVolume = currentVolume;
    }

    public static int getTotalBottles()
    {
        return totalBottles;
    }
}
