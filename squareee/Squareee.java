
package squareee;

public class Squareee {
    
//deklarasi atribut
    public int legthOfSide = 10;
    
    //deklarasi methode
    public int calculateArea(){
        int  area;
        area = this.legthOfSide * this.legthOfSide;
        return area;
    }
    
    public int calculatePerimeter(){
        int perimeter;
        perimeter = this.legthOfSide * 4;
        return perimeter;
    }
}
