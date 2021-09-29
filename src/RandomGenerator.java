/*
Created by Brian Kallay
*/

public class RandomGenerator
{
    private int min;
    private int max;

    public RandomGenerator()
    {
        min = 0;
        max = 100;
    }

    //a )Create a second constructor that accepts a min and max as parameters and apply those
    //values to the appropriate instance variables (3 pts)
    public RandomGenerator(int min, int max)
    {
        this.min = min;
        this.max = max;
    }

    //b ) Complete the following getter method so that it returns the value of the instance
    //    variable max to the caller (1 pt)
    public int getMax()
    {
        return max;
    }

    //3)complete the following method that is intended to return a random int
    //that is between min and max inclusive (2 pts)
    public int getRandomInt()
    {
        int random = min +  (int)(Math.random() * (max - min +1 ));
        return random;
    }
}
