package examples.GroupProject;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Jovelyn Delos Santos
 */
public class MouseEventDemo extends Frame {
    
    private TextField tfMouseX;
    private TextField tfMouseY;
    
    public MouseEventDemo(){
    setLayout(new FlowLayout());
    
    add(new Label("X-Click"));
    
    tfMouseX = new TextField(10);
    tfMouseX.setEditable(false);
    add(tfMouseX);
    
    add(new Label("Y-Click"));
    
    tfMouseY = new TextField(10);
    tfMouseY.setEditable(false);
    add(tfMouseY);
    
    addMouseListener(new MyMouseListener());
    
    setTitle("MouseEvent Demo");
    setSize(350, 100);
    setVisible(true);
    
    }
    
public static void main(String[] args){
    new MouseEventDemo();
}

private class MyMouseListener implements MouseListener{

    public void mouseClicked(MouseEvent evt){
        tfMouseX.setText(evt.getX() + "");
        tfMouseY.setText(evt.getY() + "");
}
    @Override public void mousePressed(MouseEvent evt){}
    @Override public void mouseReleased(MouseEvent evt){}
    @Override public void mouseEntered(MouseEvent evt){}
    @Override public void mouseExited(MouseEvent evt){}
    
    
            }
    
}
