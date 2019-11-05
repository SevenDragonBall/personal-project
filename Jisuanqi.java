package com.git;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Jisuanqi {
    // 计算器运算主函数
    public static void main(String[] args) {
        new MyFrame("计算器");
    }

}
class MyFrame extends Frame{
    private static final long serialVersionUID = 1L;
    // 文本部分的两个变量
    private TextArea ta,tb;
    public MyFrame(String title){
        super(title);
        // 设置文本部分
        SetTextAreas();
        // 设置按钮部分
        SetButtonArea();
        // 设置主窗体
        SetMainFram();
    }

    // 设置按钮部分  增加按钮 类型为私有
    private void SetButtonArea() {

        addButton("7",33,28,20,178);
        addButton("8",33,28,58,178);
        addButton("9",33,28,96,178);
        addButton("/",33,28,134,178);
        addButton("%",33,28,172,178);

        addButton("4",33,28,20,210);
        addButton("5",33,28,58,210);
        addButton("6",33,28,96,210);
        addButton("*",33,28,134,210);
        addButton("1/x",33,28,172,210);

        addButton("1",33,28,20,242);
        addButton("2",33,28,58,242);
        addButton("3",33,28,96,242);
        addButton("-",33,28,134,242);

        addButton("0",71,28,20,274);
        addButton(".",33,28,96,274);
        addButton("+",33,28,134,274);

        addButton("=",33,60,172,242);
       addButton("C",30,60,180,50 );
    }

    double m,n;
    String  k;
    boolean flag =true;
    boolean flag2 =false;
    // 增加按钮功能  设置按钮的样式、大小、以及触发事件
    private void addButton(String string, int i, int j,int x,int y) {

        // 创建一个按钮对象 该对象为终态不可被变更
        final Button b = new Button(string);
        // 设置按钮的坐标
        b.setLocation(x, y);
        // 调整按钮的宽高
        b.setSize(i, j);
        // 设置按钮的字体 字体为 标楷体 粗体 15
        b.setFont(new Font("标楷体", Font.BOLD, 15));
        // 设置按钮的背景色为粉色
        b.setBackground(Color.pink);
        // 设置前景色为深灰色
        b.setForeground(Color.darkGray);
        // 添加鼠标监听器
        b.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // 点击事件
                counts();

            }

            private void counts() {
                // 当文本为空白并且用户随机点击运算符时
                if(ta.getText().equals("")&&(b.getActionCommand().equals("+")||
                        b.getActionCommand().equals("-")||
                        b.getActionCommand().equals("*")||
                        b.getActionCommand().equals("/")||
                        b.getActionCommand().equals("%")||
                        b.getActionCommand().equals("1/x")||
                        b.getActionCommand().equals("="))) {
                 // 当用户点击.并且随机点击运算符时
                }
                else if( b.getActionCommand().equals("C")){
                    ta.setText("0");

                }else if(ta.getText().equals(".")&&(b.getActionCommand().equals("+")||
                        b.getActionCommand().equals("-")||
                        b.getActionCommand().equals("*")||
                        b.getActionCommand().equals("/")||
                        b.getActionCommand().equals("%")||
                        b.getActionCommand().equals("1/x")||
                        b.getActionCommand().equals("="))){
                    // 当用户进行下一次运算时
                }else {
                    if(		b.getActionCommand().equals("+")||
                            b.getActionCommand().equals("-")||
                            b.getActionCommand().equals("*")||
                            b.getActionCommand().equals("%")||
                            b.getActionCommand().equals("1/x")||
                            b.getActionCommand().equals("/")){
                        // 将flag2的值改为false
                        if(flag2 = true) {
                            flag2 = false;
                        }
                        if(flag) {
                            n = new Double(ta.getText()).doubleValue();
                            flag = false;
                        }else {

                            if(k=="="){

                            }else {
                                m = new Double(ta.getText()).doubleValue();
                                if(k == "-") {
                                    if(n==0)
                                        n = m;
                                    else
                                        n=n-m;
                                }else if(k == "+") {
                                    if(n==0)
                                        n = m;
                                    else
                                        n=n+m;
                                }else if(k == "*") {
                                    if(n==0)
                                        n = m;
                                    else
                                        n=n*m;
                                }else if(k=="%"){
                                    if(n==0)
                                        n=m;
                                    else
                                        m=m*100;
                                }else if(k=="1/x"){
                                    if(n==0)
                                        n=m;
                                    else
                                        n=1/m;
                                }else if(k == "/") {
                                    if(n==0)
                                        n = m;
                                    else
                                        n=n/m;
                                }
                            }
                        }
                        k = b.getActionCommand();
                        ta.setText("");
                    }else if(b.getActionCommand().equals("=")) {
                        m = new Double(ta.getText()).doubleValue();
                        if(k == "+") {
                            ta.setText("");
                            ta.append(n+"+"+m);
                            ta.append(System.getProperty("line.separator"));
                            n = n+m;
                            ta.append("="+n);



                        }else if(k == "-") {
                            ta.setText("");
                            ta.append(n+"-"+m);
                            ta.append(System.getProperty("line.separator"));
                            n = n-m;
                            ta.append("="+n);
                        }else if(k == "*") {
                            ta.setText("");
                            ta.append(n+"*"+m);
                            ta.append(System.getProperty("line.separator"));
                            n = n*m;
                            ta.append("="+n);
                        }else if(k == "%") {
                            ta.setText("");
                            ta.append("%"+m);
                            ta.append(System.getProperty("line.separator"));
                            m = m*100;
                            ta.append("="+m+"%");
                        }else if(k == "1/x") {
                            ta.setText("");
                            ta.append(1+"/"+m);
                            ta.append(System.getProperty("line.separator"));
                            n = 1/m;
                            ta.append("="+n);
                        }else if(k == "/") {
                            ta.setText("");
                            ta.append(n+"/"+m);
                            ta.append(System.getProperty("line.separator"));
                            n= n/m;
                            ta.append("="+n);
                        }
                        k="=";
                        flag2 = true;
                    }else {
                        if(flag2) {
                            flag = true;
                            flag2 = false;
                            ta.setText("");
                            m = n =0;
                        }
                        ta.append(b.getActionCommand());
                    }
                }
            }
        });
        this.add(b);
    }

    private void SetTextAreas() {
        // 计算器文本显示部分
        ta = new TextArea("0",8,52,3);
        ta.setBackground(Color.lightGray);
        ta.setSize(160, 50);
        ta.setFont(new Font("标楷体", Font.BOLD, 15));
        ta.setLocation(20,60);
        this.add(ta);
        // 计算器设计介绍部分
        tb = new TextArea("? 设计团队： 七龙珠",8,52,3);
        tb.setBackground(Color.pink);
        tb.setSize(190, 25);
        tb.setFont(new Font("标楷体", Font.BOLD, 16));
        tb.setForeground(Color.blue);
        tb.setLocation(20,130);
        this.add(ta);
        this.add(tb);
    }
    @SuppressWarnings("deprecation")
    private void SetMainFram() {
        this.setLayout(null);
        this.setSize(220,310);
        this.setVisible(true);
        this.setLocation(310, 340);
        this.setResizable(false);
        // 文本框大小不可更改
        ta.setEditable(false);
        tb.setEditable(false);
        // 手指变光标设置
        this.setCursor(Cursor.HAND_CURSOR);
        // 窗口关闭设置
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}