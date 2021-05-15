package examples.GroupProject;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Jovelyn Delos Santos
 */
public class RevisitAWTCounter extends Frame{
    
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;
    
    
    public RevisitAWTCounter (){
        setLayout(new FlowLayout());
    
    lblCount = new Label("Counter");
    add(lblCount);
    
    tfCount = new TextField(count + "", 10);
    tfCount.setEditable(false);
    add(tfCount);
    
    btnCount = new Button("Count");
    add(btnCount);
    
    btnCount.addActionListener(new BtnCountListener());
    
    setTitle("AWT Counter");
    setSize(300, 100);
    
    setVisible(true);
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RevisitAWTCounter app = new RevisitAWTCounter();
        
        
    }
    
    private class BtnCountListener implements ActionListener{
    
    public void actionPerformed(ActionEvent evt){
    ++count;
    
    tfCount.setText(count + "");
          }
    }
    
}
