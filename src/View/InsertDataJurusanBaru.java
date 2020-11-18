/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Jurusan;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author User
 */
public class InsertDataJurusanBaru implements ActionListener {
    JFrame jurusanBaru = new JFrame("Insert Data Jurusan Baru");
    JLabel namaLabel, kodeLabel;
    JTextField nama, kode;
    JPanel dataPanel;
    JButton insertButton;
    
    public InsertDataJurusanBaru(){
        jurusanBaru.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jurusanBaru.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jurusanBaru.getContentPane().setBackground(new Color(203,202,250));

        dataPanel = new JPanel();
        dataPanel.setLayout(null);
        
        kodeLabel = new JLabel("Alamat",JLabel.LEFT);
        kodeLabel.setBounds(10,70,150,50);
        kode = new JTextField();
        kode.setBounds(180,70,320,50);
        
        namaLabel = new JLabel("Nama",JLabel.LEFT);
        namaLabel.setBounds(10,10,150,50);
        nama = new JTextField();
        nama.setBounds(180,10,320,50);
        
        insertButton = new JButton("Submit");
        insertButton.setBounds(900, 150,150,50);
        insertButton.addActionListener(this);
        
        dataPanel.add(kodeLabel);
        dataPanel.add(kode);
        dataPanel.add(namaLabel);
        dataPanel.add(nama);
        dataPanel.add(insertButton);
        dataPanel.setBounds(710, (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/5,500,700);
        dataPanel.setBackground(new Color(203,202,250));
    
        jurusanBaru.add(dataPanel);
        jurusanBaru.setLayout(null);
        jurusanBaru.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonClick = e.getActionCommand();
        switch(buttonClick){
            case "Submit":
                String kode = this.kode.getText();
                String nama = this.nama.getText();
                Jurusan jurusan = new Jurusan(kode,nama);
                if(Controller.Controller.insertDataJurusanBaru(jurusan)){
                    jurusanBaru.dispose();
                    JOptionPane.showMessageDialog(null,"Insert Berhasil");
                }else{
                    JOptionPane.showMessageDialog(null, "insert failed!", "Alert", JOptionPane.WARNING_MESSAGE);
                }
                break;
        }
    }
}
