
package rectangle;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle persegipanjang = new Rectangle();
        System.out.println("Menghitung Luas dan Keliling Persegi Panjang");
        System.out.println("----------------------------------------------");
        System.out.println("Panjang  = "+persegipanjang.length);
        System.out.println("Lebar \t = "+persegipanjang.wide);
        System.out.println("----------------------------------------------");
        System.out.println("Luas \t = Panjang * Lebar");
        System.out.println("Luas \t = "+persegipanjang.length+"* "+persegipanjang.wide);
        System.out.println("Luas \t = "+persegipanjang.calculateArea());
        System.out.println("----------------------------------------------");
        System.out.println("Keliling = 2 * (Panjang + Lebar)");
        System.out.println("Keliling = 2 * ("+persegipanjang.length+" + "+persegipanjang.wide+")");
        System.out.println("Keliling = "+persegipanjang.calculatePerimeter());
        persegipanjang.calculateArea();
        persegipanjang.calculatePerimeter();
    }
    
}
