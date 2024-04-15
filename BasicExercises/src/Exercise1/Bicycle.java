package Exercise1;

public class Bicycle extends Vehichle{

    int gears=8;
    boolean breaksWork=false;
    public Bicycle() {
    }

    public Bicycle(int gears, boolean breaksWork) {
        this.gears = gears;
        this.breaksWork = breaksWork;
    }

    @Override
    public void numberOfGears(){
        System.out.println("Bicycle has :"+gears+" gears");
    }

    @Override
    public void applyBreaks(){
        System.out.println("Do bicycle breaks work? "+breaksWork);
    }

    @Override
    public void displayInfo(){
        System.out.println("Bicycle{NumberOfGears: "+gears+",WorkingBrakes: "+breaksWork+"}");
    }
}
