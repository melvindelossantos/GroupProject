package examples.GroupProject;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Jovelyn Delos Santos
 */
public class AWTAccumulator extends Frame {
    
    private TextField tfInput;
    private TextField tfOutput;
    private int sum = 0;
    


public AWTAccumulator(){
setLayout(new GridLayout(2, 2));

add(new Label("Enter an Integer: "));

tfInput = new TextField(10);
add(tfInput);

tfInput.addActionListener(new TFInputListener());


add(new Label("The Accumalated Sum is: "));

tfOutput = new TextField(10);
tfOutput.setEditable(false);
add(tfOutput);

setTitle("AWT Accumulator");
setSize(350, 120);
setVisible(true);

}

public static void main(String[] args){

new AWTAccumulator();

}
private class TFInputListener implements ActionListener{

public void actionPerformed(ActionEvent evt){

int numberIn = Integer.parseInt(tfInput.getText());
sum += numberIn;
tfInput.setText("");
tfOutput.setText(sum + "");
      }

   }
    
}
