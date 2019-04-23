package GetterSetter;

public class People {
    private String name;
    private int id;
    private double height;
    private int weight;

    public People(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override

    public String toString(){
        return "ID"+id+ " "+name+ " KG "+weight+ " M"+height;
    }

}
