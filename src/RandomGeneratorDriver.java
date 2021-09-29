/*
Created by Brian Kallay
*/

public class RandomGeneratorDriver
{
    public static void main(String[] args)
    {
        // a) instantiate a RandomGenerator object with min = 50 and max = 200 (1pt)
        RandomGenerator rand = new RandomGenerator(50, 200);
        // b) create a rondom int using the getRandomInt method from the RandomGenerator class
        //and assign it to a variable named random (1pt)
        int random = rand.getRandomInt();
        // c) print out the value of the random variable (1pt)
        System.out.println(random);
    }
}
