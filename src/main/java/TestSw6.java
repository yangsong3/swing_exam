import javax.swing.*;
import java.awt.*;

public class TestSw6 extends JFrame {
    public TestSw6() {

        //Frame
        setTitle("Swing Example3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300); //Frame size setting
        setLocationRelativeTo(null); //시작시 화면이 뜰 위치 중앙

        //Container
        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기

        //Layout
        cp.setLayout(new FlowLayout());

        //JTable
        String[][] data = {
                {"1", "A", "25"},
                {"2", "B", "30"},
                {"3", "C", "27"},
                {"4", "D", "17"}
        };
        String[] columNames = {"ID", "Name", "age"};

        JTable table = new JTable(data, columNames); // 데이터와 열 이름을 사용해 테이블 생성
        JScrollPane scrollPane = new JScrollPane(table);

        cp.add(scrollPane, BorderLayout.CENTER);


        setVisible(true); //Frame 출력

    }

    public static void main(String[] args) {
        TestSw6 sw = new TestSw6();
    }

}