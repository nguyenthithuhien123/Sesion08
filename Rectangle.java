package baitap1;

import java.util.Scanner;

public class Rectangle extends Shape {
    private Double width,height;

    public Rectangle() {
    }

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public void getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều cao của hỉnh chữ nhât");
        double cao = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiều rộng hình cn: ");
        double rong = Double.parseDouble(scanner.nextLine());
        System.out.println("Dien tích hinh chu nhat là: "+cao*rong);

    }

}
