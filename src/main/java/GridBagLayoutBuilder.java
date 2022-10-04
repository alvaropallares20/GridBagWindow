import javax.swing.*;
import java.awt.*;

public class GridBagLayoutBuilder {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(10, 10, 500, 300);
        f.setTitle("GridBagLayoutBuilder");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        f.setContentPane(mainPanel);

        mainPanel.add(
                new JLabel("Full name"),
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.EAST,
                        GridBagConstraints.NONE,
                        new Insets(10, 20, 10, 10),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JLabel("Address"),
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.EAST,
                        GridBagConstraints.NONE,
                        new Insets(10, 20, 10, 10),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JLabel("Phone"),
                new GridBagConstraints(
                        0,
                        3,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.EAST,
                        GridBagConstraints.NONE,
                        new Insets(10, 20, 10, 10),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JLabel("Description"),
                new GridBagConstraints(
                        0,
                        4,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.EAST,
                        GridBagConstraints.NONE,
                        new Insets(10, 20, 10, 10),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JTextField("1"),
                new GridBagConstraints(
                        1,
                        0,
                        3,
                        1,
                        1,
                        0.5,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(10, 0, 0, 20),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JLabel("Street"),
                new GridBagConstraints(
                        1,
                        1,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.NONE,
                        new Insets(0, 0, 0, 0),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JLabel("City"),
                new GridBagConstraints(
                        2,
                        1,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.NONE,
                        new Insets(0, 0, 0, 0),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JLabel("Zip Code"),
                new GridBagConstraints(
                        3,
                        1,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.NONE,
                        new Insets(0, 20, 0, 0),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JTextField("2"),
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        1,
                        0.5,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 5, 0),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JTextField("3"),
                new GridBagConstraints(
                        2,
                        2,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 5, 5, 5),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JTextField("4"),
                new GridBagConstraints(
                        3,
                        2,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 5, 20),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JTextField("5"),
                new GridBagConstraints(
                        1,
                        3,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5, 0, 5, 0),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JLabel("Age"),

                new GridBagConstraints(
                        2,
                        3,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.EAST,
                        GridBagConstraints.NONE,
                        new Insets(10, 20, 10, 10),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JTextField("6"),
                new GridBagConstraints(
                        3,
                        3,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5, 0, 5, 20),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JTextField("7"),
                new GridBagConstraints(
                        1,
                        4,
                        3,
                        1,
                        1,
                        10,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 20),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JButton("Submit"),
                new GridBagConstraints(
                        2,
                        5,
                        2,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(5, 0, 10, 20),
                        0,
                        0
                )
        );

        f.revalidate();
        f.repaint();
    }
}
