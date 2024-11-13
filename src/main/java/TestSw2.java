import javax.swing.*;
import java.awt.*;

public class TestSw2 extends JFrame {
    public TestSw2() {

        //Frame
        setTitle("Swing Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300); //Frame size setting
        setLocationRelativeTo(null); //시작시 화면이 뜰 위치 중앙

        //Container
        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기

        //Layout
        cp.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Y축 배치
        for (int i = 1; i <= 30; i++) {
            panel.add(new JLabel("Label " + i));
        }

        //JScrollPane
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        //프레임의 컨텐트 패널에 컴포넌트 추가
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);


        setVisible(true); //Frame 출력

    }

    public static void main(String[] args) {
        TestSw2 sw = new TestSw2();
    }

}