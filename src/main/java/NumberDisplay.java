package src.main.java;



public class NumberDisplay
{
    //implement 2 private variables, limit and value.
    //  both should be ints
    private int limit;
    private int value;
    
    //implement a constructor that sets the limit to a passed in variable rollOverLimit
    public NumberDisplay(int rollOverLimit){
        this.limit = rollOverLimit;
    }
    //  should set value to 0
    
    //Implement getter/setter methods for limit and value
    //  The setValue method should check the input for validity
    //      (should not be less than 0, or over the limit)
    public void setLimit(int limit){
        this.limit = limit;
    }
    public int getLimit(){
        return this.limit;
    }
    public void setValue(int value){
        if(!(value < 0 || value > limit)){
            this.value = value;
        }
    }
    public int getValue(){
        return this.value;
    }
    

    //Implement a function getDisplayValue that take no parameters and returns a String.
    //  The return string should be formatted as a two digit number
    //  If the number is less than 10 it should return a 0 before the number.
    public String getDisplayValue(){
        String valueAsString;
        if(this.value < 10){
            valueAsString = "0"+this.value; 
        }
        else{
            valueAsString = String.valueOf(this.value);
        }
        return valueAsString;
    }
    
    //Implement a method increment that takes no parameters and returns nothing. 
    //  This function should increase value by 1, unless it reaches the limit.
    //  It should reset to 0 if the limit is reached
    public void increment(){
        if(this.value < this.limit-1){
            this.value = this.value + 1;
        }
        else{
           this.value = 0; 
        }
    }
}
