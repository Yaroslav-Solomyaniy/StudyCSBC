package Ex_2;

abstract class WardRobe implements Furniture{

    protected double length;
    protected double width;
    protected double height;
    {
        length = 0;
        width = 0;
        height = 0;
    }


    public WardRobe(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "WardRobe{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public void cost(double length,double width,double height) {
        double cash = (length*width*height)*100;
        System.out.println("Шафа за заданими розмірами коштує: "+ cash);
    }
}
