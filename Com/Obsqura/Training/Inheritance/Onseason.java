package Com.Obsqura.Training.Inheritance;

public class Onseason {

	double cost;

    public Onseason(double cost) {
        this.cost = cost;
    }

    public double discount(){
        double dis= (cost*40)/100;
        return dis;
    }
}



