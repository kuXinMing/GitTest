import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * GuiDemo01
 *
 * @author wanghao
 * @create 2018-07-07 下午4:17
 **/
public class DemoGuiOne {
    public static void main(String [] args){
        // 声明窗口对象
        JFrame f = new JFrame("简单的GUI窗口");
        // 设置窗口宽高与坐标
        f.setSize(300,500);
        f.setLocation(300,500);
        // 设置布局样式
        f.setLayout(new FlowLayout());
        /**
         *
         * 布局管理器
         * 1)容器中的组件的排放方式,就是布局.
         * 2)常见的布局管理器
         *   FlowLayout(流式布局管理器)
         *     从左到右的顺序排列
         *     Panel默认的布局管理器
         *   BorderLayout(辩解布局管理器)
         *     东  南  西  北   中
         *     Frame 默认的布局管理器
         *     不指定布局方式,默认 满屏覆盖,在添加一个 也是 满屏覆盖
         *   GridLayout (网格布局管理器)
         *     规则的矩阵
         *   CardLayout  (卡片布局管理器)
         *     选项卡
         *   GridBagLayout(网格包布局管理器)
         *    非规则的矩阵

         * 事件监听机制组成
         *  事件源:
         *  事件:Event
         *  监听器:Listener
         *  时间处理:(引发事件后处理方式)
         *
         *  事件源:就是awt包或者swing包中的那些图像界面组件.
         *  事件:每个事件源都有自己特定的对应时间和共性时间.
         *  监听器:可以出发某一个事件的动作都已经封装到监听器中.
         */
        JButton jButton1 = new JButton("我是按钮1");
        JButton jButton2 = new JButton("我是按钮2");
        JButton jButton3 = new JButton("我是按钮3");
        jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(10);
                System.out.println("按钮干的退出");
            }
        });
        f.add(jButton1);
        f.add(jButton2);
        f.add(jButton3);

        // 键盘和鼠标事件
        TextField textField = new TextField();
        textField.addKeyListener(new KeyAdapter() {
            /**
             * keyPressed：键盘按下，未释放
             * keyTyped：键盘按下，然后释放。
             * 对于按下键和释放键事件，getKeyCode 方法返回该事件的 keyCode。对于键入键事件，
             * getKeyCode 方法总是返回 VK_UNDEFINED。
             *
             * 所以键入键事件只能靠 getKeyChar 来区分了
             *
             *
             KeyPressed是键被按下，KeyReleased是键被弹起，这两个都是更底层一些的事件。
             KeyTypede是指有字符被输入，比如按住shift，再按A键，如果当时Caps Lock不亮，就产生一个输入大写A的事件。
             */
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                System.out.println("是指字符被输入。Code："+e.getKeyCode());
                System.out.println("是指字符被输入。Char："+e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                System.out.println("是指键被按下。Code："+e.getKeyCode());
                System.out.println("是指键被按下。Char："+e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                System.out.println("是指键被弹起。Code："+e.getKeyCode());
                System.out.println("是指键被弹起。Char："+e.getKeyChar());
            }
        });
        f.add(textField);
        f.addWindowListener(new MyWindow());
        f.setVisible(true);
    }
}

/**
 * 因为接口WindowLinstener的方法被WindowAdapter实现，所以我们简介继承WindowAdapter，并复写我们需要更改的方法。
 */
class MyWindow extends WindowAdapter {
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("窗口打开");

    }

    @Override
    public void windowClosing(WindowEvent e) {
        // 点×关闭窗口
        System.out.println("窗口关闭");
        System.exit(0);
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("窗口激活");
    }
}