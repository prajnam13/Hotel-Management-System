package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {

    JButton add_employee, add_room, add_driver, logout, back;

    Admin() {

        add_employee = new JButton("ADD EMPLOYEE");
        add_employee.setBounds(250, 230, 200, 30);
        add_employee.setBackground(Color.white);
        add_employee.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_employee.addActionListener(this);
        add(add_employee);

        add_room = new JButton("ADD ROOM");
        add_room.setBounds(250, 380, 200, 30);
        add_room.setBackground(Color.white);
        add_room.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_room.addActionListener(this);
        add(add_room);

        add_driver = new JButton("ADD DRIVER");
        add_driver.setBounds(250, 530, 200, 30);
        add_driver.setBackground(Color.white);
        add_driver.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_driver.addActionListener(this);
        add(add_driver);

        logout = new JButton("Logout");
        logout.setBounds(10, 800, 95, 30);
        logout.setBackground(Color.white);
        logout.setFont(new Font("Tahoma", Font.BOLD, 15));
        logout.addActionListener(this);
        add(logout);

        back = new JButton("Back");
        back.setBounds(110, 800, 95, 30);
        back.setBackground(Color.white);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.addActionListener(this);
        add(back);


        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image image = imageIcon1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(70, 180, 120, 120);
        add(label1);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image image1 = imageIcon2.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon12 = new ImageIcon(image1);
        JLabel label2 = new JLabel(imageIcon12);
        label2.setBounds(70, 340, 120, 120);
        add(label2);

        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image image2 = imageIcon3.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon13 = new ImageIcon(image2);
        JLabel label3 = new JLabel(imageIcon13);
        label3.setBounds(70, 500, 120, 120);
        add(label3);

        ImageIcon imageIcon4 = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image image3 = imageIcon4.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon14 = new ImageIcon(image3);
        JLabel label4 = new JLabel(imageIcon14);
        label4.setBounds(1000, 250, 400, 400);
        add(label4);


        getContentPane().setBackground(new Color(3, 45, 48));
        setLayout(null);
        setSize(1950, 1090);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Admin();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add_employee) {

        } else if (e.getSource() == add_room) {

        } else if (e.getSource() == add_driver) {

        } else if (e.getSource() == logout) {
            System.exit(102);
        } else if (e.getSource() == back) {
            new Dashboard();
            this.setVisible(false);
        }

    }
}
