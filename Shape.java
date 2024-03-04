package baitap1;

public abstract class Shape {
    private  String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void getArea();//diện tích
    public void   display(){
        System.out.println("Màu của hình là: "+getColor());
    };//hiển thị màu sắc của hình đó


}
