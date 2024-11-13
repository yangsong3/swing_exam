import javax.swing.*;
import java.awt.*;

public class TestSw7 extends JFrame {
    public TestSw7() {

        //Frame
        setTitle("Swing Example3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300); //Frame size setting
        setLocationRelativeTo(null); //시작시 화면이 뜰 위치 중앙

        //Container
        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기

        //Layout
        cp.setLayout(new FlowLayout());

        //JToolBar
        JToolBar toolBar = new JToolBar();
        JButton newButton = new JButton("New");
        JButton openButton = new JButton("Open");
        JButton saveButton = new JButton("Save");

        toolBar.add(newButton);
        toolBar.add(openButton);
        toolBar.add(saveButton);

        cp.add(toolBar, BorderLayout.NORTH);

        setVisible(true); //Frame 출력

    }

    public static void main(String[] args) {
        TestSw7 sw = new TestSw7();
    }

}