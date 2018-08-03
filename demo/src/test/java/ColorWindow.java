import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 点击按钮改变颜色
 *
 * @author wanghao
 * @create 2018-07-07 下午4:57
 **/
public class ColorWindow {
    public static void main(String[] args) {
        final Frame f=new Frame("XXX");
        f.setLayout(null);
        f.setSize(500,400);
        f.setLocation(300,200);

        // 设置背景颜色 初始背景颜色黄色
        f.setBackground(new Color(255, 255, 0));


        Button red=new Button("红色");
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("改变背景颜色");
                Color bgColor = new Color(255, 0, 0);
                // 更改背景颜色为红色
                f.setBackground(bgColor);
            }
        });
        Button green=new Button("绿色");
        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("改变背景颜色");
                Color bgColor = new Color(0, 255, 0);
                // 更改背景颜色绿色
                f.setBackground(bgColor);
            }
        });
        Button Blue=new Button("兰色");
        Blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("改变背景颜色");
                Color bgColor = new Color(0, 0, 255);
                // 更改背景颜色蓝色
                f.setBackground(bgColor);
            }
        });
        Button revert=new Button("还原");
        revert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("改变背景颜色");
                Color bgColor = new Color(255, 255, 0);
                // 更改背景颜色蓝色
                f.setBackground(bgColor);
            }
        });
        Button title=new Button("设置背景颜色");
        title.setBounds(0,20,250,50);
        //设置按钮尺寸
        red.setBounds(0,70,100,50);
        green.setBounds(0,120,100,50);
        Blue.setBounds(0,170,100,50);
        revert.setBounds(0,220,100,50);
        f.add(title);
        f.add(red);
        f.add(green);
        f.add(Blue);
        f.add(revert);



        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("我关了");
                System.exit(0);
            }
        });

        f.setVisible(true);
    }
}
