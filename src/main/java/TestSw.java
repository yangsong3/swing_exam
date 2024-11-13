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
        cp.setLayout(new FlowLayout());

        //JLabel
        JLabel jLabel = new JLabel("Label Test");
        jLabel.setBounds(100,100,100,10);
        cp.add(jLabel);

        //JButton
        JButton jButton = new JButton("Button test");
        jButton.setBounds(120, 130,100,20);
        cp.add(jButton);

        //JTextField
        JTextField jTextField = new JTextField();
        jTextField.setBounds(200, 200, 100, 25);
        jTextField.setColumns(10);
        cp.add(jTextField);

        //JCheckBox
        JCheckBox lion = new JCheckBox("lion");
        JCheckBox rabbit = new JCheckBox("rabbit", true);
        cp.add(lion);
        cp.add(rabbit);

        //JRadioButton
        JLabel colorLabel = new JLabel("색상을 선택해 주세요 : ");
        cp.add(colorLabel);

        ButtonGroup group = new ButtonGroup();
        JRadioButton red = new JRadioButton("Red");
        JRadioButton orange = new JRadioButton("Orange");
        JRadioButton yellow = new JRadioButton("Yellow");

        group.add(red);
        group.add(orange);
        group.add(yellow);

        cp.add(red);
        cp.add(orange);
        cp.add(yellow);

        //JComboBox
        String[] colors = {"red", "orange", "yellow", "green", "blue" , "navy", "purple"};
        String[] fruits = {"Apple", "Melon", "Peach", "Grape"};

        JComboBox colorCombo = new JComboBox(colors);
        JComboBox fruitCombo = new JComboBox(fruits);

        cp.add(colorCombo);
        cp.add(fruitCombo);

        //JList
        String[] planet = {"Earth", "Mars", "Jupiter", "Saturn", "Uranus"};

        JList<String> strplist = new JList<>(planet);
        JList plist = new JList<>(planet);

        cp.add(new JScrollPane(strplist));
        cp.add(plist);

        setVisible(true); //Frame 출력

    }

    public static void main(String[] args){
        TestSw sw = new TestSw();
    }

}