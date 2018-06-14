import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame(){
        init();
    }


    private JPanel jpl1=new JPanel(new GridLayout(4,3));
    private JPanel jpl2=new JPanel(new GridLayout(5,1));

    private double v1=0;
    private double v2=0;
    private double v3=0;
    private int op=-1;

    private JButton jbnadd=new JButton("+");
    private JButton jbnsub=new JButton("-");
    private JButton jbnmul=new JButton("*");
    private JButton jbndiv=new JButton("/");
    private JButton jbnamo=new JButton("=");
    private JButton jbnac=new JButton("AC");

    private JButton j9=new JButton(new ImageIcon("99.png"));
    private JButton j8=new JButton(new ImageIcon("88.png"));
    private JButton j7=new JButton(new ImageIcon("77.png"));
    private JButton j6=new JButton(new ImageIcon("66.png"));
    private JButton j5=new JButton(new ImageIcon("55.png"));
    private JButton j4=new JButton(new ImageIcon("44.png"));
    private JButton j3=new JButton(new ImageIcon("33.png"));
    private JButton j2=new JButton(new ImageIcon("22.png"));
    private JButton j1=new JButton(new ImageIcon("11.png"));
    private JButton j0=new JButton(new ImageIcon("00.png"));
    private JButton jdot=new JButton(".");

    private JLabel jlb=new JLabel("0",Label.LEFT);

    private void init(){
        this.setBounds(10,10,800,800);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jlb.setBounds(10,10,800,100);

        this.add(jlb);

        jpl1.setBounds(10,100,300,300);
        this.add(jpl1);
        jpl1.add(j7);jpl1.add(j8);jpl1.add(j9);
        jpl1.add(j4);jpl1.add(j5);jpl1.add(j6);
        jpl1.add(j1);jpl1.add(j2);jpl1.add(j3);
        jpl1.add(j0);jpl1.add(jdot);jpl1.add(jbnamo);

        j0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                j0.setText("0");
                if (jlb.getText().equals("0") ){
                    jlb.setText(tmp.getText());
                }
                else if (op>-1){
                    String zxc= String.valueOf(v1);
                    switch (op){
                        case 0:
                            jlb.setText(zxc+"+"+jlb.getText()+tmp.getText());
                            break;
                        case 1:
                            jlb.setText(zxc+"-"+jlb.getText()+tmp.getText());
                            break;
                        case 2:
                            jlb.setText(zxc+"*"+jlb.getText()+tmp.getText());
                            break;
                        case 3:
                            jlb.setText(zxc+"/"+jlb.getText()+tmp.getText());
                            break;
                    }
                }
                else {
                    jlb.setText(jlb.getText()+tmp.getText());
                }

            }
        });
        j1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                j1.setText("1");
                if (jlb.getText().equals("0")){
                    jlb.setText(tmp.getText());
                }
                else if (op>-1){
                    String zxc= String.valueOf(v1);
                    switch (op){
                        case 0:
                            jlb.setText(zxc+"+"+jlb.getText()+tmp.getText());
                            break;
                        case 1:
                            jlb.setText(zxc+"-"+jlb.getText()+tmp.getText());
                            break;
                        case 2:
                            jlb.setText(zxc+"*"+jlb.getText()+tmp.getText());
                            break;
                        case 3:
                            jlb.setText(zxc+"/"+jlb.getText()+tmp.getText());
                            break;
                    }
                }
                else {
                    jlb.setText(jlb.getText()+tmp.getText());
                }
            }
        });
        j2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                j2.setText("2");
                if (jlb.getText().equals("0")){
                    jlb.setText(tmp.getText());
                }
                else if (op>-1){
                    String zxc= String.valueOf(v1);
                    switch (op){
                        case 0:
                            jlb.setText(zxc+"+"+jlb.getText()+tmp.getText());
                            break;
                        case 1:
                            jlb.setText(zxc+"-"+jlb.getText()+tmp.getText());
                            break;
                        case 2:
                            jlb.setText(zxc+"*"+jlb.getText()+tmp.getText());
                            break;
                        case 3:
                            jlb.setText(zxc+"/"+jlb.getText()+tmp.getText());
                            break;
                    }
                }
                else {
                    jlb.setText(jlb.getText()+tmp.getText());
                }
            }
        });
        j3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                j3.setText("3");
                if (jlb.getText().equals("0")||op>-1){
                    jlb.setText(tmp.getText());
                }
                else if (op>-1){
                    String zxc= String.valueOf(v1);
                    switch (op){
                        case 0:
                            jlb.setText(zxc+"+"+jlb.getText()+tmp.getText());
                            break;
                        case 1:
                            jlb.setText(zxc+"-"+jlb.getText()+tmp.getText());
                            break;
                        case 2:
                            jlb.setText(zxc+"*"+jlb.getText()+tmp.getText());
                            break;
                        case 3:
                            jlb.setText(zxc+"/"+jlb.getText()+tmp.getText());
                            break;
                    }
                }
                else {
                    jlb.setText(jlb.getText()+tmp.getText());
                }
            }
        });
        j4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                j4.setText("4");
                if (jlb.getText().equals("0")){
                    jlb.setText(tmp.getText());
                }
                else if (op>-1){
                    String zxc= String.valueOf(v1);
                    switch (op){
                        case 0:
                            jlb.setText(zxc+"+"+jlb.getText()+tmp.getText());
                            break;
                        case 1:
                            jlb.setText(zxc+"-"+jlb.getText()+tmp.getText());
                            break;
                        case 2:
                            jlb.setText(zxc+"*"+jlb.getText()+tmp.getText());
                            break;
                        case 3:
                            jlb.setText(zxc+"/"+jlb.getText()+tmp.getText());
                            break;
                    }
                }
                else {
                    jlb.setText(jlb.getText()+tmp.getText());
                }
            }
        });
        j5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                j5.setText("5");
                if (jlb.getText().equals("0")){
                    jlb.setText(tmp.getText());
                }
                else if (op>-1){
                    String zxc= String.valueOf(v1);
                    switch (op){
                        case 0:
                            jlb.setText(zxc+"+"+jlb.getText()+tmp.getText());
                            break;
                        case 1:
                            jlb.setText(zxc+"-"+jlb.getText()+tmp.getText());
                            break;
                        case 2:
                            jlb.setText(zxc+"*"+jlb.getText()+tmp.getText());
                            break;
                        case 3:
                            jlb.setText(zxc+"/"+jlb.getText()+tmp.getText());
                            break;
                    }
                }
                else {
                    jlb.setText(jlb.getText()+tmp.getText());
                }
            }
        });
        j6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                j6.setText("6");
                if (jlb.getText().equals("0")){
                    jlb.setText(tmp.getText());
                }
                else if (op>-1){
                    String zxc= String.valueOf(v1);
                    switch (op){
                        case 0:
                            jlb.setText(zxc+"+"+jlb.getText()+tmp.getText());
                            break;
                        case 1:
                            jlb.setText(zxc+"-"+jlb.getText()+tmp.getText());
                            break;
                        case 2:
                            jlb.setText(zxc+"*"+jlb.getText()+tmp.getText());
                            break;
                        case 3:
                            jlb.setText(zxc+"/"+jlb.getText()+tmp.getText());
                            break;
                    }
                }
                else {
                    jlb.setText(jlb.getText()+tmp.getText());
                }
            }
        });
        j7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                j7.setText("7");
                if (jlb.getText().equals("0")){
                    jlb.setText(tmp.getText());
                }
                else if (op>-1){
                    String zxc= String.valueOf(v1);
                    switch (op){
                        case 0:
                            jlb.setText(zxc+"+"+jlb.getText()+tmp.getText());
                            break;
                        case 1:
                            jlb.setText(zxc+"-"+jlb.getText()+tmp.getText());
                            break;
                        case 2:
                            jlb.setText(zxc+"*"+jlb.getText()+tmp.getText());
                            break;
                        case 3:
                            jlb.setText(zxc+"/"+jlb.getText()+tmp.getText());
                            break;
                    }
                }
                else {
                    jlb.setText(jlb.getText()+tmp.getText());
                }
            }
        });
        j8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                j8.setText("8");
                if (jlb.getText().equals("0")){
                    jlb.setText(tmp.getText());
                }
                else if (op>-1){
                    String zxc= String.valueOf(v1);
                    switch (op){
                        case 0:
                            jlb.setText(zxc+"+"+jlb.getText()+tmp.getText());
                            break;
                        case 1:
                            jlb.setText(zxc+"-"+jlb.getText()+tmp.getText());
                            break;
                        case 2:
                            jlb.setText(zxc+"*"+jlb.getText()+tmp.getText());
                            break;
                        case 3:
                            jlb.setText(zxc+"/"+jlb.getText()+tmp.getText());
                            break;
                    }
                }
                else {
                    jlb.setText(jlb.getText()+tmp.getText());
                }
            }
        });
        j9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                j9.setText("9");
                if (jlb.getText().equals("0")){
                    jlb.setText(tmp.getText());
                }
                else if (op>-1){
                    String zxc= String.valueOf(v1);
                    switch (op){
                        case 0:
                            jlb.setText(zxc+"+"+jlb.getText()+tmp.getText());
                            break;
                        case 1:
                            jlb.setText(zxc+"-"+jlb.getText()+tmp.getText());
                            break;
                        case 2:
                            jlb.setText(zxc+"*"+jlb.getText()+tmp.getText());
                            break;
                        case 3:
                            jlb.setText(zxc+"/"+jlb.getText()+tmp.getText());
                            break;
                    }
                }
                else {
                    jlb.setText(jlb.getText()+tmp.getText());
                }
            }
        });
        jdot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                if (jlb.getText().equals("0")){
                    jlb.setText(tmp.getText());
                }
                else if (op>-1){
                    String zxc= String.valueOf(v1);
                    switch (op){
                        case 0:
                            jlb.setText(zxc+"+"+jlb.getText()+tmp.getText());
                            break;
                        case 1:
                            jlb.setText(zxc+"-"+jlb.getText()+tmp.getText());
                            break;
                        case 2:
                            jlb.setText(zxc+"*"+jlb.getText()+tmp.getText());
                            break;
                        case 3:
                            jlb.setText(zxc+"/"+jlb.getText()+tmp.getText());
                            break;
                    }
                }
                else {
                    jlb.setText(jlb.getText()+tmp.getText());
                }
            }
        });
        jbnamo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JButton tmp=(JButton)e.getSource();
                v2=Double.parseDouble(jlb.getText());
                switch (op){
                    case 0:
                        v3=v1+v2;
                        String a=String.valueOf(v3);
                        jlb.setText(a);
                        break;
                    case 1:
                        v3=v1+v2;
                        String b=String.valueOf(v3);
                        jlb.setText(b);
                        break;
                    case 2:
                        v3=v1*v2;
                        String c=String.valueOf(v3);
                        jlb.setText(c);
                        break;
                    case 3:
                        v3=v1/v2;
                        String d=String.valueOf(v3);
                        jlb.setText(d);
                        break;
                }
            }
        });

        jpl2.setBounds(350,100,100,200);
        this.add(jpl2);
        jpl2.add(jbndiv);
        jpl2.add(jbnmul);
        jpl2.add(jbnsub);
        jpl2.add(jbnadd);
        jpl2.add(jbnac);

        jbndiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton) e.getSource();
                v1=Double.parseDouble(jlb.getText());
                String asd=String.valueOf(v1);
                op=3;
                jlb.setText(tmp.getText());
            }
        });
        jbnmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton) e.getSource();
                v1=Double.parseDouble(jlb.getText());
                String asd=String.valueOf(v1);
                op=2;
                jlb.setText(tmp.getText());
            }
        });
        jbnsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton) e.getSource();
                v1=Double.parseDouble(jlb.getText());
                String asd=String.valueOf(v1);
                op=1;
                jlb.setText(tmp.getText());
            }
        });
        jbnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton) e.getSource();
                v1=Double.parseDouble(jlb.getText());
                String asd=String.valueOf(v1);
                op=0;
                jlb.setText(tmp.getText());
            }
        });
        jbnac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op=-1;
                v1=0;
                v2=0;
                v3=0;
                jlb.setText("0");
            }
        });

    }
}
