package ss5.baitap;

public class Accessmodifier {
    private double radius;
    private String color;

    public Accessmodifier(){
        radius = 1.0;
        color = "red";
    }
    public Accessmodifier (double r){
        radius = r;
        color = "red";
    }
    public double getRadius(){
        return radius;
    }
    public double getAre(){
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Accessmodifier c1 = new Accessmodifier();
        System.out.println("Radius of C1 is: " + c1.getRadius());
        System.out.println("Area of C1 is: " + c1.getAre());

        Accessmodifier c2 = new Accessmodifier(2.0);
        System.out.println("Radius of C1 is: " + c2.getRadius());
        System.out.println("Area of C1 is: " + c2.getAre());
    }
}
