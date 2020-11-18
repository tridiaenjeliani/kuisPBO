/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author User
 */
public class MainMenu implements ActionListener{
    JFrame mainMenu = new JFrame();
    JButton buttonInput;
    JLabel label;
        
    public MainMenu(){
        mainMenu.setSize(500,700);
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label = new JLabel("Main Menu");
        label.setFont(new Font("Serif",Font.PLAIN,20));
        label.setBounds(210,20,150,50);
        mainMenu.add(label);

        buttonInput = new JButton("Insert Data Jurusan");
        buttonInput.setFont(new Font("Serif", Font.PLAIN, 17));
        buttonInput.setActionCommand("Insert Data Jurusan");
        buttonInput.setBounds(150,200,200,50);
        buttonInput.addActionListener(this);
        mainMenu.add(buttonInput);

        buttonInput = new JButton("Lihat Data Jurusan");
        buttonInput.setFont(new Font("Serif", Font.PLAIN, 17));
        buttonInput.setActionCommand("Lihat Data Jurusan");
        buttonInput.setBounds(150,250,200,50);
        buttonInput.addActionListener(this);
        mainMenu.add(buttonInput);
        
        buttonInput = new JButton("Insert Data Mahasiswa");
        buttonInput.setFont(new Font("Serif", Font.PLAIN, 17));
        buttonInput.setActionCommand("Insert Data Mahasiswa");
        buttonInput.setBounds(150,300,200,50);
        buttonInput.addActionListener(this);
        mainMenu.add(buttonInput);
        
        buttonInput = new JButton("Lihat Data Mahasiswa");
        buttonInput.setFont(new Font("Serif", Font.PLAIN, 17));
        buttonInput.setActionCommand("Lihat Data Mahasiswa");
        buttonInput.setBounds(150,350,200,50);
        buttonInput.addActionListener(this);
        mainMenu.add(buttonInput);
        
        buttonInput = new JButton("Exit");
        buttonInput.setFont(new Font("Serif", Font.PLAIN, 17));
        buttonInput.setActionCommand("Exit");
        buttonInput.setBounds(150,400,200,50);
        buttonInput.addActionListener(this);
        mainMenu.add(buttonInput);

        mainMenu.setLayout(null);
        mainMenu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Insert Data Jurusan":
                mainMenu.dispose();
                new InsertDataJurusanBaru();
                break;
            case "Lihat Data Jurusan":
                mainMenu.dispose();
                new MainMenu();
                break;
            case "Insert Data Mahasiswa":
                mainMenu.dispose();
                new MainMenu();
                break;
            case "Lihat Data Mahasiswa":
                mainMenu.dispose();
                new MainMenu();
                break;
        }
    }
}
