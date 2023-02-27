
package circle;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Circle lingkaran = new Circle();
        System.out.println("Menghitung Luas dan Keliling Lingkaran ");
        System.out.println("-----------------------------------------");
        System.out.println("jari-jari = "+lingkaran.jarijari);
        System.out.println("-----------------------------------------");
        System.out.println("Luas \t  = Pi * Jari-jari * Jari-jari");
        System.out.println("Luas \t  = 3.14 * "+lingkaran.jarijari+"* "+lingkaran.jarijari);
        System.out.println("Luas \t  = "+lingkaran.calculateArea());
        System.out.println("-----------------------------------------");
        System.out.println("Keliling  = 2 * Pi * Jari-jari");
        System.out.println("Keliling  = 2 * 3.14 * "+lingkaran.jarijari);
        System.out.println("Keliling  = "+lingkaran.calculatePerimeter());
        lingkaran.calculateArea();
        lingkaran.calculatePerimeter();
    }
    
}
