package practice;

public abstract class Shape {
   public abstract double getArea();
}

class Circle extends Shape{
    public double getArea(){
        return (10);
    }
}
class Rectangle extends Shape {
    public double getArea() {
        return 10;
    }

    static class Square extends Rectangle {
        public double getArea() {
            return 10;
        }
    }

    static class Application {
        public static void main(String args[]) {
            Circle circle;
            circle = new Circle();
            System.out.println("圆的面积" + circle.getArea());
            Rectangle rectangle;
            rectangle = new Rectangle();
            System.out.println("长方形的面积" + rectangle.getArea());
            Square square;
            square = new Square();
            System.out.println("正方形的面积" + square.getArea());
            System.out.println("正方形是特殊的长方形");
        }
    }
}




