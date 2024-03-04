package baitap1;

import java.util.Scanner;

public class Circle extends Shape{
private  double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    /**b.	2 lớp con là Rectangle và Circle kế thừa abstract class Shape và triển khai phương thức getArea() để tính diện tích tương ứng.
     Ngoài ra các lớp con cũng có các thuộc tính riêng như bán kính trong Circle hay width, height trong Rectangle.*/
    @Override
    public void getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn");
        this.r = Double.parseDouble(scanner.nextLine());
        System.out.println("Diện tích hình tròn là: "+(this.r*this.r*3.14));
    }
}
