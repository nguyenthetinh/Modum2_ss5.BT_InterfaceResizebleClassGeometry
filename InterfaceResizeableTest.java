import Shap.Circle;
import Shap.Rectangle;
import Shap.Square;

import javax.sound.midi.Soundbank;

public class InterfaceResizeableTest {
    public static void main(String[] args) {
        Circle[] circles=new Circle[3];

        Rectangle[] rectangles=new Rectangle[3];

        Square[] squares=new Square[3];

        double percent=Math.random()*100;

        squares[0] =new Square(4.5,"zed",false);
        squares[1] =new Square(10.0,"zed",false);
        squares[2] =new Square(6.7,"zed",false);

        rectangles[0]=new Rectangle(4.5,3.6,"green",true);
        rectangles[1]=new Rectangle(3.5,7.6,"green",true);
        rectangles[2]=new Rectangle(8.5,9.6,"green",true);

        circles[0]=new Circle(23.0,"blue",true);
        circles[1]=new Circle(12.0,"blue",true);
        circles[2]=new Circle(8.0,"blue",true);

        System.out.println("hinh Circle ban dau");
        System.out.println(circles[0]);
        System.out.println(circles[1]);
        System.out.println(circles[2]);

        System.out.println("hinh Circle sau khi tang kich thuoc ngau nhien:");
        circles[0].setResize(percent);
        System.out.println(circles[0]);
        circles[1].setResize(percent);
        System.out.println(circles[1]);
        circles[2].setResize(percent);
        System.out.println(circles[2]);

        System.out.println("hinh Rectangle ban dau:");
        System.out.println(rectangles[0]);
        System.out.println(rectangles[1]);
        System.out.println(rectangles[2]);

        System.out.println("hinh Rectangle sau khi tang kich thuoc ngau nhien:");
        rectangles[0].setResize(percent);
        System.out.println(rectangles[0]);
        rectangles[1].setResize(percent);
        System.out.println(rectangles[1]);
        rectangles[2].setResize(percent);
        System.out.println(rectangles[2]);

        System.out.println("hinh Square ban dau:");
        System.out.println(squares[0]);
        System.out.println(squares[1]);
        System.out.println(squares[2]);

        System.out.println("hinh Square sau khi tang kich thuoc ngau nhien:");
        squares[0].setResize(percent);
        squares[1].setResize(percent);
        squares[2].setResize(percent);
        System.out.println(squares[0]);
        System.out.println(squares[1]);
        System.out.println(squares[2]);

    }
}
