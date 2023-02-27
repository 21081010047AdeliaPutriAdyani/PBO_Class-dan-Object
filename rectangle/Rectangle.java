
package rectangle;

public class Rectangle {

//deklarasi atribut
    public int length = 5;
    public int wide = 4;
    
    //deklarasi methode
    public int calculateArea(){
        int area;
        area = this.length * this.wide;
        return area;
    }
    
    public int calculatePerimeter(){
        int perimeter;
        perimeter = 2 * (this.length + this.wide);
        return perimeter;
    }
}
