import javax.swing.*;

public class TestSw extends JFrame {
    public TestSw() {
        setTitle("Swing Example");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300); //Frame size setting
        setLocationRelativeTo(null); //시작시 화면이 뜰 위치 중앙

        setVisible(true); //Frame 출력

    }

    public static void main(String[] args){
        TestSw sw = new TestSw();
    }

}