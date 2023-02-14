package Com.Obsqura.Training.Inheritance;

public class Offseason extends Onseason{

	  public Offseason(double cost) {
	        super(cost);
	    }

	    public double discount() {
	        double dis=(cost*15)/100;
	        return dis;
	        
	    }

}



