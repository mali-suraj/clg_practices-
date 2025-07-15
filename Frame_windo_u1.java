import java.awt.*;
public class Frame_windo_u1 extends Frame {
       public void paint(Graphics g) 
   { 
         setForeground(Color.red); 
   setBackground(Color.cyan); 
   g.drawString("This is my Frame:",150,170); 
 }
    public static void main(String[] args) {
        Frame_windo_u1 f1=new Frame_windo_u1();
        f1.setVisible(true);
        f1.setSize(500,500);
        f1.setTitle("this is my first frame!!");
    }
    
}
