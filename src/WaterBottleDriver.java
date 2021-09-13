/*
Created by Brian Kallay
*/

public class WaterBottleDriver
{
    public static void main(String[] args)
    {

        System.out.println("Total Bottles: " + WaterBottle.getTotalBottles());
        WaterBottle myBottle = new WaterBottle(64, 32.5);
        String currentStatus = myBottle.getInfo();
        System.out.println(currentStatus);
        System.out.println("Total Bottles: " + WaterBottle.getTotalBottles());
        WaterBottle anotherBottle = new WaterBottle(100);
        System.out.println(anotherBottle.getInfo());
        //new WaterBottle(56, 4);
        Double newVol = 4.9;
        anotherBottle.setCurrentVolume(4.6);
        System.out.println("Total Bottles: " + WaterBottle.getTotalBottles());

    }
}
