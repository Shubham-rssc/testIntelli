//create a class called Car which implements the Vehicle interface
public class Car implements Vehicle{
    //create two private fields called gearNumber and speedCount
    private int gearNumber;
    private int speedCount;

    //create a constructor which takes two parameters and assigns them to the fields
    public Car(int gearNumber, int speedCount){
        this.gearNumber = gearNumber;
        this.speedCount = speedCount;
    }

    //implement the methods from the Vehicle interface
    public void gearChange(int gearNumberChanged){
        this.gearNumber = gearNumberChanged;
    }

    public void changeSpeed(int speedCount){
        this.speedCount = speedCount;
    }

    public void printStates(){
        System.out.println("Gear Number: " + gearNumber + " Speed Count: " + speedCount);
    }

}
