package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    Reception() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280, 5, 1230, 820);
        panel.setBackground(new Color(3, 45, 48));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5, 5, 270, 820);
        panel1.setBackground(new Color(3, 45, 48));
        add(panel1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/cccc.gif"));
        Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon2);
        label1.setBounds(300, 20, 800, 800);
        panel.add(label1);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i22 = i11.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i22);
        JLabel label2 = new JLabel(imageIcon1);
        label2.setBounds(5, 530, 250, 250);
        panel1.add(label2);

        JButton btnNCF = new JButton("New Customer Form");
        btnNCF.setBounds(30, 30, 200, 30);
        btnNCF.setBackground(Color.WHITE);
        btnNCF.setForeground(Color.BLACK);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnRoom = new JButton(" Room");
        btnRoom.setBounds(30, 70, 200, 30);
        btnRoom.setBackground(Color.WHITE);
        btnRoom.setForeground(Color.BLACK);
        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnDepartment = new JButton(" Department");
        btnDepartment.setBounds(30, 110, 200, 30);
        btnDepartment.setBackground(Color.WHITE);
        btnDepartment.setForeground(Color.BLACK);
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton allEmployee = new JButton(" All Employee Info");
        allEmployee.setBounds(30, 150, 200, 30);
        allEmployee.setBackground(Color.WHITE);
        allEmployee.setForeground(Color.BLACK);
        panel1.add(allEmployee);
        allEmployee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton ci = new JButton(" Customer Info");
        ci.setBounds(30, 190, 200, 30);
        ci.setBackground(Color.WHITE);
        ci.setForeground(Color.BLACK);
        panel1.add(ci);
        ci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton checkout = new JButton(" Checkout info");
        checkout.setBounds(30, 270, 200, 30);
        checkout.setBackground(Color.WHITE);
        checkout.setForeground(Color.BLACK);
        panel1.add(checkout);
        checkout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnCheckin = new JButton(" Update Check-In Details");
        btnCheckin.setBounds(30, 310, 200, 30);
        btnCheckin.setBackground(Color.WHITE);
        btnCheckin.setForeground(Color.BLACK);
        panel1.add(btnCheckin);
        btnCheckin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnURS = new JButton(" Update Room Status");
        btnURS.setBounds(30, 350, 200, 30);
        btnURS.setBackground(Color.WHITE);
        btnURS.setForeground(Color.BLACK);
        panel1.add(btnURS);
        btnURS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnPUS = new JButton(" Pickup Service");
        btnPUS.setBounds(30, 390, 200, 30);
        btnPUS.setBackground(Color.WHITE);
        btnPUS.setForeground(Color.BLACK);
        panel1.add(btnPUS);
        btnPUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnSR = new JButton(" Search Room");
        btnSR.setBounds(30, 430, 200, 30);
        btnSR.setBackground(Color.WHITE);
        btnSR.setForeground(Color.BLACK);
        panel1.add(btnSR);
        btnSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton mi = new JButton(" Manager Info");
        checkout.setBounds(30, 230, 200, 30);
        mi.setBackground(Color.WHITE);
        mi.setForeground(Color.BLACK);
        panel1.add(mi);
        mi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1950, 1090);
        setVisible(true);
        setLayout(null);

    }

    public static void main(String[] args) {
        new Reception();
    }
}
