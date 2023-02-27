
package squareee;
import squareee.Squareee;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here\
        Squareee persegi = new Squareee();
        System.out.println("Menghitung Luas dan Keliling Persegi");
        System.out.println("--------------------------------------");
        System.out.println("Sisi \t = "+persegi.legthOfSide);
        System.out.println("--------------------------------------");
        System.out.println("Luas \t = Sisi * Sisi ");
        System.out.println("Luas \t = "+persegi.legthOfSide+" * "+persegi.legthOfSide);
        System.out.println("Luas \t = "+persegi.calculateArea());
        System.out.println("--------------------------------------");
        System.out.println("Keliling = 4 * Sisi");
        System.out.println("Keliling = 4 * "+persegi.legthOfSide);
        System.out.println("Keliling = "+persegi.calculatePerimeter());
        persegi.calculateArea();
        persegi.calculatePerimeter();  
    }
}
