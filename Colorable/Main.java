package Colorable;

public class Main{
    public static void main(String[] args) {
        Shape[] shape = new Square[3];
        shape[0]=new Square(4);
        shape[1]=new Square(5);
        shape[2]=new Square(9);

        for (Shape x: shape){
            if(x instanceof Square){
                ((Square) x).howToColor();
            }
        }
    }
}
