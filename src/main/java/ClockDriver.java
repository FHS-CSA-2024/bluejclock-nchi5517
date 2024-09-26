package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        //ClockDisplay clockDisplay = new ClockDisplay();
        
        ClockDisplay clockDisplay1 = new ClockDisplay(3,32);
        clockDisplay1.timeTick();
        
        ClockDisplay clockDisplay2 = new ClockDisplay(3,9);
        clockDisplay2.timeTick();
        
        ClockDisplay clockDisplay3 = new ClockDisplay(1,59);
        clockDisplay3.timeTick();
        
        ClockDisplay clockDisplay4 = new ClockDisplay(9,59);
        clockDisplay4.timeTick();
        
        ClockDisplay clockDisplay5 = new ClockDisplay(23,59);
        clockDisplay5.timeTick();
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        //ClockDisplaySeconds clockDisplaySeconds = new ClockDisplaySeconds();
                
        ClockDisplaySeconds clockDisplaySeconds1 = new ClockDisplaySeconds(3,32,59);
        clockDisplaySeconds1.timeTick();
        
        ClockDisplaySeconds clockDisplaySeconds2 = new ClockDisplaySeconds(1,0,59);
        clockDisplaySeconds2.timeTick();
        
        ClockDisplaySeconds clockDisplaySeconds3 = new ClockDisplaySeconds(1,59,59);
        clockDisplaySeconds3.timeTick();
        
        ClockDisplaySeconds clockDisplaySeconds4 = new ClockDisplaySeconds(23,59,59);
        clockDisplaySeconds4.timeTick();
                
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        ClockDisplay12Hour ClockDisplay12Hour1 = new ClockDisplay12Hour(3,32, "AM");
        ClockDisplay12Hour1.timeTick();
        
        ClockDisplay12Hour ClockDisplay12Hour2 = new ClockDisplay12Hour(11,59, "PM");
        ClockDisplay12Hour2.timeTick();
        
        ClockDisplay12Hour ClockDisplay12Hour3 = new ClockDisplay12Hour(11,59, "AM");
        ClockDisplay12Hour3.timeTick();
        
        ClockDisplay12Hour ClockDisplay12Hour4 = new ClockDisplay12Hour(12,59, "PM");
        ClockDisplay12Hour4.timeTick();
        
        
        
        
    }
}
