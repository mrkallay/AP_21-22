/*
Created by Brian Kallay
*/

public class WaterBottle
{
    //instance variables
    private double capacity; //use private to "protect" the data
    private double currentVolume;

    //constructor
    public WaterBottle(double cap, double currentVol)
    {
        capacity = cap;
        currentVolume = currentVol;
    }

    //overloaded constructor
    public WaterBottle(double cap)
    {
        capacity =  cap;
        currentVolume = 0;
    }


    //method = behavior
    public String getCapacity()
    {
        String info = "Total Capacity: " + capacity;
        return info;
    }

    public String getCurrentVolume()
    {
        String info = "Current Volume: " + currentVolume;
        return info;
    }

    public String getInfo()
    {
        String info = getCapacity() + "\n" + getCurrentVolume();
        return info;
    }

    public void setCurrentVolume(double vol)
    {
        currentVolume = vol;
    }
}
