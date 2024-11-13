import javax.swing.*;
import java.awt.*;

public class TestSw extends JFrame {
    public TestSw() {

        //Frame
        setTitle("Swing Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300); //Frame size setting
        setLocationRelativeTo(null); //시작시 화면이 뜰 위치 중앙

        //Container
        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기

        //Layout
        cp.setLayout(null);

        //JLabel
        JLabel jLabel = new JLabel("Label Test");
        jLabel.setBounds(100,100,100,10);
        cp.add(jLabel);

        //JButton
        JButton jButton = new JButton("Button test");
        jButton.setBounds(200, 200,100,20);
        cp.add(jButton);

        setVisible(true); //Frame 출력

    }

    public static void main(String[] args){
        TestSw sw = new TestSw();
    }

}