/*
Created by Brian Kallay
*/

public class WorkingSlotMachine
{

        private int low;
        private int high;

        public WorkingSlotMachine()
        {
            low = 1;
            high = 9;
        }
        //a )Create a second constructor that accepts low & high as parameters and apply the
        //   value to the instance variable
        public WorkingSlotMachine(int low, int high)
        {
            this.low = low;
            this.high = high;
        }

        //b )Implement the setHigh() method below so that the value of the parameter is applied
        //   to the appropriate instance variable
        public void setHigh(int high)
        {
            this.high = high;
        }

        //c ) Implement the spinIt method which is intended to print 3 random integers between
        //    low and high. This method should not return anything.
        //    Example output of calling spinIt would be:
        //        735
        public void spinIt()
        {
            System.out.print( low + (int)(Math.random() * ( high - low + 1)));
            System.out.print( low + (int)(Math.random() * ( high - low + 1)));
            System.out.print( low + (int)(Math.random() * ( high - low + 1)));
        }


}
