package examples.GroupProject;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Jovelyn Delos Santos
 */
public class WindowEventDemo extends Frame {
    
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;
    
    
    public WindowEventDemo (){
        setLayout(new FlowLayout());
    
    add(new Label("Counter"));
    
    tfCount = new TextField("0", 10);
    tfCount.setEditable(false);
    add(tfCount);
    
    btnCount = new Button("Count");
    add(btnCount);
    
    BtnCountListener listener = new BtnCountListener();
    btnCount.addActionListener(listener);
    
    addWindowListener(new MyWindowListener());
    
    setTitle("WindowEvent Demo");
    setSize(300, 100);
    
    setVisible(true);
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new WindowEventDemo();
        
        
    }
    
    private class BtnCountListener implements ActionListener{
    
    public void actionPerformed(ActionEvent evt){
    ++count;
    
    tfCount.setText(count + "");
          }
    }
   
    private class MyWindowListener implements WindowListener{
    
    public void windowClosing(WindowEvent evt){
        System.exit(0);
    }
    @Override public void windowOpened(WindowEvent evt){}
    @Override public void windowClosed(WindowEvent evt){}
    
    @Override public void windowIconified(WindowEvent evt){System.out.println("Window Iconified");}
    @Override public void windowDeiconified(WindowEvent evt){System.out.println("Window Deiconified");}
    @Override public void windowActivated(WindowEvent evt){System.out.println("Window Activated");}
    @Override public void windowDeactivated(WindowEvent evt){System.out.println("Window Deactivated");}
    
            }
    
}
