package preoperties;

public class BoxPrice extends BoxWeight{

    double cost;

    BoxPrice(){
        super();
        this.cost = -1;


    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double h, double w, double wieght, double cost){
        super(l, h, w, wieght);
        this.cost = cost;

    }
}
