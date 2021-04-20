package Ex_2;

public class BookCase extends WardRobe{
    private String name;
    private int type;
    private int numberOfShelves;
    {
        name = "Книжкова шафа";
        type = 1;
        numberOfShelves = 5;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getNumberOfShelves() {
        return numberOfShelves;
    }
    public void setNumberOfShelves(int numberOfShelves) {
        this.numberOfShelves = numberOfShelves;
    }


    public BookCase(double length, double width, double height, String name, int type, int numberOfShelves) {
        super(length, width, height);
        this.name = name;
        this.type = type;
        this.numberOfShelves = numberOfShelves;
    }

    public BookCase(double length, double width, double height) {
        super(length, width, height);
    }

    @Override
    public void cost(double length, double width, double height) {
        super.cost(length, width, height);
    }
    public void cost(double length,double width, double height,int type,int numberOfShelves)
    {
        if(type == 1){
            double cash = ((length*width*height*numberOfShelves)*100)+150;
            System.out.println("Шкафа за заданими параметрами коштує:"+cash+" Грн.");
        }
        else
            {
                double cash = ((length*width*height*numberOfShelves)*100)+400;
                System.out.println("Шкафа за заданими параметрами коштує:"+cash+" Грн.");
            }

    }

    @Override
    public String toString() {
        return "BookCase{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", numberOfShelves=" + numberOfShelves +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
