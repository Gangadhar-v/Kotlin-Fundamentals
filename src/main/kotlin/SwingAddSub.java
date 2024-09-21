import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class SwingAddSub implements ActionListener{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2;
    SwingAddSub(){
        JFrame jf=new JFrame("Calculator");
        jf.setVisible(true);
        jf.setSize(300,300);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1=new JLabel("Addition/Subtraction on 2 Number");
        l2=new JLabel("First Number");
        l3=new JLabel("Second Number");
        l4=new JLabel();
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("+");
        b2=new JButton("-");
        jf.add(l1);
        jf.add(l2);
        jf.add(l3);
        jf.add(l4);
        jf.add(t1);
        jf.add(t2);
        jf.add(b1);
        jf.add(b2);
        l1.setBounds(30, 50, 180, 20);
        l2.setBounds(30, 50, 180, 20);
        t1.setBounds(30, 130, 80, 20);
        l3.setBounds(50, 150, 200, 20);
        t2.setBounds(30, 130, 80, 20);
        b1.setBounds(80,180,100,20);
        b2.setBounds(80,210,100,20);
        l4.setBounds(50,240,100,20);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String s1 = e.getActionCommand();
        System.out.println(s1);
        if (s1.equals("+")) {
            String x=t1.getText();
            String y=t2.getText();
            int a = Integer.parseInt(x);
            int b = Integer.parseInt(y);
            int sum=a+b;
            l4.setText("Result is : "+sum);
        }
        if (s1.equals("Sub")){
            String x=t1.getText();
            String y=t2.getText();
            int a = Integer.parseInt(x);
            int b = Integer.parseInt(y);
            int sub=a-b;
            l4.setText("Result is : "+sub);
        }
    }
}
class SwingAddSubDemo{
    public static void main(String[] args){
        new SwingAddSub();
    }
}
