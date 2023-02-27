
package elips;

public class Elips {
    
//deklarasi atribut 
    public double a = 4;
    public double b = 6;
    
    // deklarasi methode 
    public double calculateArea(){
        double area;
        area = 0.5 * Math.PI * (this.a * this.b);
        return area;
    }
    
    public double calculatePerimeter(){
        double perimeter;
        perimeter = 0.5 * Math.PI * (this.a + this.b);
        return perimeter;
    }
    
}
