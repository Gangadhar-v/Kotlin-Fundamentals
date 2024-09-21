import javax.swing.JLabel;
import javax.swing.JTextField ;
import javax.swing.JButton ;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SwingCalculateDemo{
    //declaring components
    JLabel l1,l2,l3,l4;
    JButton b1,b2;
    JTextField t1,t2;

    SwingCalculateDemo() {

        JFrame jf = new JFrame("Claculator");
        jf.setVisible(true);
        jf.setSize(300,300);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creating components
        l1=new JLabel("Substract/Add two number");
        l2=new JLabel("First number");
        l3=new JLabel("Second number");
        l4=new JLabel();
        b1=new JButton("+") ;
        b2=new JButton("-") ;
        t1=new JTextField();
        t2=new JTextField();
         // adding components to frame
        jf.add(l1);
        jf.add(l2);
        jf.add(l3);
        jf.add(l4);
        jf.add(b1);
        jf.add(b2);
        jf.add(t1);
        jf.add(t2);

        //x-axis y-axis width height

        l1.setBounds(50,50,200,20);
        l2.setBounds(100,70,100,20);
        t1.setBounds(100,70,100,20);
        l3.setBounds(100,90,100,20);
        t2.setBounds(100,90,100,20);
        b1.setBounds(100,120,100,20);
        b2.setBounds(100,140,100,20);
        l4.setBounds(50,240,100,20);

        //adding ActionListener to button;
        b1.addActionListener((ActionListener) this);
        b2.addActionListener((ActionListener) this);
    }

    public void actionPerformed(ActionEvent e){
        String s1 =e.getActionCommand();
        System.out.println(s1);

        if(s1.equals("+")){
            String x=t1.getText();
            String y=t2.getText();
            int a =Integer.parseInt(x);
            int b=Integer.parseInt(y);
            int sum=a+b;
            l4.setText("the result is:"+sum);
        }

        if(s1.equals("-")){
            String x=t1.getText();
            String y=t2.getText();
            int a=Integer.parseInt(x);
            int b=Integer.parseInt(y);
            int diff=a-b;
            l4.setText("the result is"+diff);
        }
    }
}





public class SwingCalculate {
    public static void main(String[] args) {
       new SwingCalculateDemo();
    }

}
