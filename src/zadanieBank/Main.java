package zadanieBank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        task3();


    }

    public static void task1() {
        initWindow();
        BankAccount1 account = new BankAccount1(100);
        BankAccount1.BalanceCounter counter = account.new BalanceCounter(0.20);
        Timer timer = new Timer(1000, counter);
        timer.setInitialDelay(0);
        timer.start();


    }

    public static void task2() {
        initWindow();
        BankAccount2 account = new BankAccount2(100);
        Timer timer = new Timer(1000, account.createBalanceCounter(0.06));
        timer.setInitialDelay(0);
        timer.start();
    }

    public static void task3() {
        initWindow();
        BankAccount3 account = new BankAccount3(100, 0.04);
        Timer timer = new Timer(1000, account.createBalanseCOunter());
        timer.setInitialDelay(0);
        timer.start();
    }

    public static void initWindow() {
        JFrame frame = new JFrame("BankAccount");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("CLOSE");
        JButton button2 = new JButton("TEXT");
        JTextField field = new JTextField();
        field.setText("Hello World!");
        button.addActionListener(e ->
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING))
        );

        button2.addActionListener(e ->
                field.setText("Hello World!")
        );

        button.setBounds(20, 20, 150, 150);
        button.setMargin(new Insets(10, 10, 10, 10));
        frame.getContentPane().add(button);
        frame.getContentPane().add(button2);
        frame.getContentPane().add(field);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
