import javax.swing.*;
import java.awt.*;
import java.io.File;

public class TestSw5 extends JFrame {
    public TestSw5() {

        //Frame
        setTitle("Swing Example3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300); //Frame size setting
        setLocationRelativeTo(null); //시작시 화면이 뜰 위치 중앙

        //Container
        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기

        //Layout
        cp.setLayout(new FlowLayout());

        //버튼을 눌러 JFileChooser 표시
        JButton showFileChooserButton = new JButton("Open File Chooser");
        showFileChooserButton.addActionListener(e -> showFileChooser(this)); //버튼 클릭시 다이얼로그 표시

        cp.add(showFileChooserButton);

        //버튼을 눌러 JColorChooser 표시
        JButton showColorChooserButton = new JButton("Open Color Chooser");
        showColorChooserButton.addActionListener(e -> showColorChooser(this));

        cp.add(showColorChooserButton);


        setVisible(true); //Frame 출력
    }

    private void showFileChooser(JFrame frame) {
        //JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this); //파일 열기 대화상자 표시

        if (result == JFileChooser.APPROVE_OPTION) { //파일을 선택한 경우
            File selectedFile = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(this, "Selected file: " + selectedFile.getAbsolutePath());
            // 선택된 파일 경로를 메세지로 표시

        }

    }

    private void showColorChooser(JFrame frame) {
        //JColorChooser
        Color selectedColor = JColorChooser.showDialog(this, "Choose a Color", Color.white);

        if (selectedColor != null) {
            getContentPane().setBackground(selectedColor);
        }

    }

    public static void main(String[] args) {
        TestSw5 sw = new TestSw5();
    }

}