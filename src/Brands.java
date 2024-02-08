import java.util.*;
public class Brands implements Comparable<Brands> {

    private int id ;
    private String name;


    public Brands (int id , String name ){
        this.name=name;
        this.id=id;



    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Brands o) {
        return getName().compareTo(o.getName());
    }
}
