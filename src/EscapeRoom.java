import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscapeRoom {
    static JPanel panel;
    static JRadioButton door1, door2, door3, door4;
    static ButtonGroup radios = new ButtonGroup();
    int maxSeconds = 120;
    int seconds = maxSeconds;
    Timer timer;


    public static void main(String[] args) {
        new EscapeRoom();
    }



    public EscapeRoom() {
            JFrame frame = new JFrame("Escape Room");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 450);
            frame.setLocationRelativeTo(null);


            door1 = new JRadioButton("Open door 1");
            door2 = new JRadioButton("Open door 2");
            door3 = new JRadioButton("Open door 3");
            door4 = new JRadioButton("Open door 4");

            radios.add(door1);
            radios.add(door2);
            radios.add(door3);
            radios.add(door4);

            panel.setLayout(null);
            panel.add(door1);
            panel.add(door2);
            panel.add(door3);
            panel.add(door4);


            panel = new JPanel();

            frame.add(panel);
            frame.setVisible(true);

        }
        private class Door1Selection implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (door1.isSelected()) {
                    System.out.println("The door is locked try a new on");
                }
                if (door2.isSelected()) {
                    System.out.println("The door is locked try a new one");
                }
                if(door3.isSelected()){
                    System.out.println("You found the right one, now click GO in order to leave this room");
                }
                if(door4.isSelected()){
                    System.out.println("The door is locked try a new one");
                }
            }
        }


    }


