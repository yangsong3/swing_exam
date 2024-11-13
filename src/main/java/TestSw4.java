import javax.swing.*;
import java.awt.*;

public class TestSw4 extends JFrame {
    public TestSw4() {

        //Frame
        setTitle("Swing Example3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300); //Frame size setting
        setLocationRelativeTo(null); //시작시 화면이 뜰 위치 중앙

        //Container
        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기

        //Layout
        cp.setLayout(new FlowLayout());

        //버튼을 눌러 Dialog 표시
        JButton showDialogButton = new JButton("Show Dialog");
        showDialogButton.addActionListener(e -> showDialog(this)); //버튼 클릭시 다이얼로그 표시

        cp.add(showDialogButton);

        setVisible(true); //Frame 출력

    }

    private void showDialog(JFrame frame) {
        //JDialog
        JDialog dialog = new JDialog(frame, "Dialog", true);
        dialog.setSize(200, 100);
        dialog.setLocationRelativeTo(frame); // 부모 프레임 기준으로 중앙에 배치

        //dialog 내용 추가
        JLabel message = new JLabel("Hello", JLabel.CENTER);
        dialog.add(message);

        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        TestSw4 sw = new TestSw4();
    }

}