public class Circle{
    private double radius = 1;
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.radius = 2.7;
        System.out.println("Radius is " + myCircle.radius);
        Circle myCircle2 = new Circle();
        System.out.println("Radius is " + myCircle2.radius);
    }
}