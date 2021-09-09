/*
Created by Brian Kallay
*/

public class WaterBottleDriver
{
    public static void main(String[] args)
    {
        int x = 5;
        boolean y = false;
        WaterBottle myBottle = new WaterBottle(64, 32.5);
        String currentStatus = myBottle.getInfo();
        System.out.println(currentStatus);

        WaterBottle anotherBottle = new WaterBottle(100);
        System.out.println(anotherBottle.getInfo());
        //new WaterBottle(56, 4);
        anotherBottle.setCurrentVolume(4.9);

    }
}
