package iuh.fit.se;

/*
 * @ (#) Rectangle.java   1.0     29/08/2024
 
 

package iuh.fit.se;
/** 

 * @description: bai Lab2

 * @author: Nguyen Van Nam

 * @version: 1.0 

 * @created: 29/08/2024 

 */
public class Rectangle {
    private double length;
    private double width;
    public Rectangle() {
        length = 0.0;
        width = 0.0;
    }

    public Rectangle(double length, double width) {
        if(length>0 && width>0) {
            this.length = length;
            this.width = width;
        }
        else throw new ArithmeticException("Length and width must be greater than 0");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length>0) {
            this.length = length;
        }
        else throw new ArithmeticException("Length must be greater than 0");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>0) {
            this.width = width;
        }
        else throw new RuntimeException("Width must be greater than 0");

    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
}
