package sorrawich.week11.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyView {
    private JFrame frame;
    private JLabel usLabel;
    private JLabel bahtLabel;
    private JTextField usTextField;
    private JTextField bahtTextField;
    private JButton button;

    private Double usToBahtRate = 30.5;

    public CurrencyView() {
        frame = new JFrame("US to Baht Currency Convert");
        usLabel = new JLabel("US Dollar");
        bahtLabel = new JLabel("Baht");
        usTextField = new JTextField("1");
        bahtTextField = new JTextField(usToBahtRate.toString());
        button = new JButton("Convert");
    }

    public void loadCurrencyForm() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bahtTextField.setText(Double.toString(Double.parseDouble(usTextField.getText())*usToBahtRate));
            }
        });

        bahtTextField.setEnabled(false);

        GridLayout gridLayout = new GridLayout(3, 2);
        frame.setLayout(gridLayout);

        frame.add(usLabel);
        frame.add(usTextField);

        frame.add(bahtLabel);
        frame.add(bahtTextField);

        frame.add(button);

        frame.setSize(200, 200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
