package za.ac.cput.ngosa;

import za.ac.cput.ngosa.garageServices.Implementation.GarageInterface;

/**
 * Created by User on 2015/02/20.
 */
public  class AeroImpl implements GarageInterface {

    String name;
    double val;
    int horPow;
    String cate;
    String col;

    @Override
   public String name(String n)
    {
        name=n;
        return name;
    }

    @Override
    public double value(double v) {
        return (val+100);
    }

    @Override
    public int bhp(int hp) {

        horPow=hp;
        return horPow;
    }

    @Override
    public String colour(String c) {

        col=c;
        return col;
    }

    @Override
    public String category(String c) {

        cate=c;
        return cate;
    }
}
