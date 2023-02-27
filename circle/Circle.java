
package circle;

public class Circle {
    
//deklarasi atribut
    public double jarijari = 5;
    
    //deklarasi methode
    public double calculateArea(){
        double area;
        area = Math.PI * this.jarijari * this.jarijari;
        return area;
    }
    
    public double calculatePerimeter(){
        double perimeter;
        perimeter = 2 * Math.PI * this.jarijari;
        return perimeter;
    }
    
}
