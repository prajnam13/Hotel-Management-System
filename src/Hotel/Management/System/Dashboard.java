package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton add, rec;

    Dashboard() {
        super("Hotel Management System");
        rec = new JButton("RECEPTION");
        rec.setBounds(425, 510, 140, 30);
        rec.setFont(new Font("Tahoma", Font.BOLD, 15));
        rec.setBackground(new Color(238, 101, 12));
        rec.setForeground(Color.BLACK);
        rec.addActionListener(this);
        add(rec);

        add = new JButton("ADMIN");
        add.setBounds(880, 510, 140, 30);
        add.setFont(new Font("Tahoma", Font.BOLD, 15));
        add.setBackground(new Color(238, 101, 12));
        add.setForeground(Color.BLACK);
        add.addActionListener(this);
        add(add);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon2);
        label1.setBounds(850, 300, 200, 195);
        add(label1);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
        Image i22 = i11.getImage().getScaledInstance(200, 195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon22 = new ImageIcon(i22);
        JLabel label2 = new JLabel(imageIcon22);
        label2.setBounds(400, 300, 200, 195);
        add(label2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
        Image i = imageIcon.getImage().getScaledInstance(1950, 1090, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(0, 0, 1959, 1090);
        add(label);
        setLayout(null);
        setSize(1950, 1090);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rec) {

        } else {

        }
    }

    public static void main(String[] args) {
        new Dashboard();
    }


}
