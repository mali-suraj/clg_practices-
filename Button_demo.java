import java.awt.*;

import com.sun.prism.paint.Color;
public class Button_demo extends Frame {
    Button_demo()
    {
        FlowLayout f1 =new FlowLayout();
        setLayout(f1);
        Button b1= new Button("ok");
        Button b2=new Button("cancle");
       // b1.setBackground(Color.BLACK);
        add(b1);
        add(b2);

    }
    public static void main(String[] args) {
        Button_demo b1= new Button_demo();
        b1.setVisible(true);
        b1.setSize(500,500);
        b1.setTitle("simple button!!");
    }
    
}
