/*
Created by Brian Kallay
*/

public class WrapItUp
{
    public static void main(String[] args)
    {
        //Integer wrapper class
        Integer i = new Integer(4);
        //auto-boxing
        Integer auto = 4;
        Double d = 4.5;

        //full syntax mode
        int y = 4 * auto.intValue();

        //unboxing - java gives us the primitive value of auto
        int z = 4 * auto;
    }
}
