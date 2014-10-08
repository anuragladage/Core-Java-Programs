import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestJavaBeans extends JFrame
{
    Container c;
    JRoundButton rb,rb1,rb2;
    JTextField jtfMsg;
    OkHandler oh1;
    OnHandler oh2;
    OffHandler oh3;
    
    public TestJavaBeans()          //Default Constructor.
    {
        super("Test Round Buttons");                            //Gives Name to the frame.
        setSize(1280,800);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c = getContentPane();
        c.setLayout(null);      //Absolute Positioning.
        
        rb = new JRoundButton("Ok");
        rb.setBounds(50,50,56,56);
        c.add(rb);                                      //Adds the JRoundButton on the Container.
        oh1 = new OkHandler();                          //Instantiating the Handler Object.
        rb.addActionListener(oh1);                      //Registering the Handler with the rb.
        
        rb1 = new JRoundButton("On");
        rb1.setBounds(150,50,56,56);
        c.add(rb1);
        oh2 = new OnHandler();
        rb1.addActionListener(oh2);
        
        rb2 = new JRoundButton("Off");
        rb2.setBounds(250,50,56,56);
        c.add(rb2);
        oh3 = new OffHandler();
        rb2.addActionListener(oh3);
        
        jtfMsg = new JTextField("Output Display");
        jtfMsg.setBounds(350,50,250,50);
        c.add(jtfMsg);
        
        setVisible(true);
        
    }
    
    public static void main(String args[])
    {
        TestJavaBeans app1 = new TestJavaBeans();
    }
    
    class OkHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            jtfMsg.setText("Ok was Pressed");
        }
    }
    
    class OnHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            jtfMsg.setText("On was pressed");
        }
    }
    
    class OffHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            jtfMsg.setText("Off was Pressed");
        }
    }
}