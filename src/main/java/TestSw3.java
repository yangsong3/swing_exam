import javax.swing.*;
import java.awt.*;

public class TestSw3 extends JFrame {
    public TestSw3() {

        //Frame
        setTitle("Swing Example3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300); //Frame size setting
        setLocationRelativeTo(null); //시작시 화면이 뜰 위치 중앙

        //Container
        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기

        //Layout
        cp.setLayout(new FlowLayout());

        //JSlider
        JSlider slider = new JSlider(0, 100, 50);
        slider.setMajorTickSpacing(20); // 주요 눈금 간격 설정
        slider.setMinorTickSpacing(5); // 부수 눈금 간격 설정
        slider.setPaintTicks(true); // 눈금 표시 설정
        slider.setPaintLabels(true); // 눈금 레이블 표시 설정

        getContentPane().add(slider, BorderLayout.CENTER);
        cp.setVisible(true);

        setVisible(true); //Frame 출력

    }

    public static void main(String[] args) {
        TestSw3 sw = new TestSw3();
    }

}