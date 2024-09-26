package src.main.java;


public class ClockDisplaySeconds
{
    //Extends ClockDisplaySeconds to include a seconds field.
    //Update all methods and parameters to accomodate this change
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;

    //Implement a constructor that takes no parameters
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method updateDisplay before finishing
    public ClockDisplaySeconds(){
     this.hours = new NumberDisplay(24);
     this.minutes = new NumberDisplay(60);
     this.seconds = new NumberDisplay(60);
     this.updateDisplay();
     
    }
    
    //Implement a constructor that takes 2 parameters, hour and minute
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method setTime with the parameters passed in
    public ClockDisplaySeconds(int hour, int minute, int seconds){
     this.hours = new NumberDisplay(24);
     this.minutes = new NumberDisplay(60);
     this.seconds = new NumberDisplay(60);
     this.setTime(hour,minute,seconds);
    }
    
    //Implement a method timeTick that takes no parameters and returns nothing
    //The method should increase the minute value by one each run
    //The hours should increase when the minutes roll over
    //The updateDisplay method should be called before finishing
    public void timeTick(){
        this.seconds.increment();
        if(this.seconds.getValue() == 0){
            this.minutes.increment();
        }
        if(this.minutes.getValue()==0){
            this.hours.increment();
        }
        
        this.updateDisplay();
    }
    //Implement a method setTime that takes in 2 parameters, hour and minute
    //The method should set the hours value and minutes value
    //The updateDisplay method should be called before finishing
    public void setTime(int hour, int minute, int second){
        this.hours.setValue(hour);
        this.minutes.setValue(minute);
        this.seconds.setValue(second);
        this.updateDisplay();
    }
    
    //Implement a method getTime that takes no parameter and returns a String
    //The return String should be formatted as HH:MM:SS and report out the current time
    public String getTime(){
        String displayString = String.valueOf(this.hours.getDisplayValue())+":"+String.valueOf(this.minutes.getDisplayValue())+":"+String.valueOf(this.seconds.getDisplayValue());
        return displayString;
    }
    //Implement a method updateDisplay that takes no parameters and returns nothing
    //The method should update the displayString with the current time in a format
    //  HH:MM:SS
    public void updateDisplay(){
        System.out.println(this.getTime());
    }

}
