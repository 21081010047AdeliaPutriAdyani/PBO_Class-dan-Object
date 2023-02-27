
package elips;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Elips oval = new Elips();
        System.out.println("Menghitung Luas dan Keliling Oval");
        System.out.println("-----------------------------------");
        System.out.println("Sisi a \t = "+oval.a);
        System.out.println("Sisi b \t = "+oval.b);
        System.out.println("-----------------------------------");
        System.out.println("Luas \t = 1/2 * Pi ( Sisi a * Sisi b )");
        System.out.println("Luas \t = 1/2 * 3.14 ("+oval.a+" * "+oval.b+")");
        System.out.println("Luas \t = "+oval.calculateArea());
        System.out.println("-----------------------------------");
        System.out.println("Keliling = 1/2 * Pi ( Sisi a + Sisi b )");
        System.out.println("Keliling = 1/2 * 3.14 ("+oval.a+" + "+oval.b+")");
        System.out.println("Keliling = "+oval.calculatePerimeter());
        oval.calculateArea();
        oval.calculatePerimeter();
    }
    
}
