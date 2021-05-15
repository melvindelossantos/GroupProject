package examples.GroupProject;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Jovelyn Delos Santos
 */
public class MouseMotionDemo extends Frame{
    
    private TextField tfMouseClickX;
    private TextField tfMouseClickY;
    
    private TextField tfMousePositionX;
    private TextField tfMousePositionY;
    
    public MouseMotionDemo(){
        setLayout(new FlowLayout());
        
        add(new Label("X-Click: "));
        tfMouseClickX = new TextField(10);
        tfMouseClickX.setEditable(false);
        add(tfMouseClickX);
        add(new Label("Y-Click: "));
        tfMouseClickY = new TextField(10);
        tfMouseClickY.setEditable(false);
        add(tfMouseClickY);
        
        add(new Label("X-Position: "));
        tfMousePositionX = new TextField(10);
        tfMousePositionX.setEditable(false);
        add(tfMousePositionX);
        add(new Label("Y-Position: "));
        tfMousePositionY = new TextField(10);
        tfMousePositionY.setEditable(false);
        add(tfMousePositionY);
        
        MyMouseListener listener = new MyMouseListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);
        
        setTitle("MouseMotion Demo");
        setSize(400, 120);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new MouseMotionDemo();
    }
    
    private class MyMouseListener implements MouseListener, MouseMotionListener{
         
        public void mouseClicked(MouseEvent evt){
            tfMouseClickX.setText(evt.getX() + "");
            tfMouseClickY.setText(evt.getY() + "");
    }
        public void mousePressed(MouseEvent evt){}    
        public void mouseReleased(MouseEvent evt){}    
        public void mouseEntered(MouseEvent evt){}    
        public void mouseExited(MouseEvent evt){}
        
        public void mouseMoved(MouseEvent evt){
            tfMousePositionX.setText(evt.getX() + "");
            tfMousePositionY.setText(evt.getY() + "");
        }
        
        public void mouseDragged(MouseEvent evt){}
        
}
    
}
