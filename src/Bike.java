public class Bike implements Vehicle{
    int gearNumber;
    int speedCount;

    public void gearChange(int gearNumberChanged){
        this.gearNumber = gearNumberChanged;
    }

    public void changeSpeed(int speedCount){
        this.speedCount = speedCount;
    }

    public void printStates(){
        System.out.println("Gear Number = " + gearNumber + " Speed Count = " + speedCount);
    }
}

