package question;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questionnaire extends JFrame implements ActionListener {

    private JLabel lQuestion, lEmail;
    private JRadioButton rC, rJava, rPython, rRuby;
    private JButton bSend;
    private JTextField pEmail;

    public static void main(String[] args) {
        new Questionnaire();
    }

    public Questionnaire() {
        setSize(400, 400);
        setTitle("Question");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        lQuestion = new JLabel("Jakiego języka programowania chcesz się nauczyć?");
        lQuestion.setBounds(30, 30, 600, 20);
        add(lQuestion);

        ButtonGroup group = new ButtonGroup();

        rC = new JRadioButton("C++");
        rC.setBounds(50, 60, 400, 20);
        group.add(rC);
        add(rC);
        rC.addActionListener(this);

        rJava = new JRadioButton("Java");
        rJava.setBounds(50, 90, 400, 20);
        group.add(rJava);
        add(rJava);
        rJava.addActionListener(this);

        rPython = new JRadioButton("Python");
        rPython.setBounds(50, 120, 400, 20);
        group.add(rPython);
        add(rPython);
        rPython.addActionListener(this);

        rRuby = new JRadioButton("Ruby on Rails");
        rRuby.setBounds(50, 150, 400, 20);
        group.add(rRuby);
        add(rRuby);
        rRuby.addActionListener(this);

        lEmail = new JLabel("Podaj swojego meila:");
        lEmail.setBounds(30, 200, 250, 20);
        add(lEmail);

        pEmail = new JTextField();
        pEmail.setBounds(30, 230, 160, 20);
        add(pEmail);

        bSend = new JButton("Wyślij");
        bSend.setBounds(100, 300, 150, 20);
        bSend.addActionListener(this);
        add(bSend);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == bSend){
            if(rC.isSelected()){
                System.out.println(rC.getText());
            } else if(rJava.isSelected()){
                System.out.println(rJava.getText());
            } else if(rPython.isSelected()) {
                System.out.println(rPython.getText());
            } else if(rRuby.isSelected()) {
                System.out.println(rRuby.getText());
            }

            if(pEmail.getText() != ""){
                System.out.println(pEmail.getText());
            }
        }
    }
}
