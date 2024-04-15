package Exercise1;

public  class Vehichle {

    int gears=6;
    boolean breaksWork=true;
    public Vehichle() {
    }

    public Vehichle(int gears, boolean breaksWork) {
        this.gears = gears;
        this.breaksWork = breaksWork;
    }

    public void numberOfGears(){

        System.out.println("Car has :"+gears+" gears");
  }

  public void applyBreaks(){

      System.out.println("Do car breaks work? "+breaksWork);

  }

  public void displayInfo(){

      System.out.println("Car{NumberOfGears: "+gears+",WorkingBrakes: "+breaksWork+"}");
  }
}
