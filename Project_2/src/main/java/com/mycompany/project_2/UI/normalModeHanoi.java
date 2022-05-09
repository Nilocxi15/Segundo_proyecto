/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.project_2.UI;

import com.mycompany.project_2.Hanoi.node;
import com.mycompany.project_2.Hanoi.tower;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hamme
 */
public class normalModeHanoi extends javax.swing.JFrame {

    int sec = 0;
    int min = 0;
    boolean state = true;

    int clickedPlayBttn = 0;

    int moveCount = 0;
    int target = 0;

    tower towerOne;
    tower towerTwo;
    tower towerThree;

    DefaultTableModel tableModelOne, tableModelTwo, tableModelThree;

    /**
     * Creates new form normalModeHanoi
     */
    public normalModeHanoi() {
        initComponents();
        this.setLocationRelativeTo(null);

        tableModelOne = (DefaultTableModel) towerOneTable.getModel();
        tableModelOne.setRowCount(8);

        tableModelTwo = (DefaultTableModel) towerTwoTable.getModel();
        tableModelTwo.setRowCount(8);

        tableModelThree = (DefaultTableModel) towerThreeTable.getModel();
        tableModelThree.setRowCount(8);

        DefaultTableCellRenderer renderOne = new DefaultTableCellRenderer();
        renderOne.setHorizontalAlignment(SwingConstants.CENTER);
        towerOneTable.getColumnModel().getColumn(0).setCellRenderer(renderOne);

        DefaultTableCellRenderer renderTwo = new DefaultTableCellRenderer();
        renderTwo.setHorizontalAlignment(SwingConstants.CENTER);
        towerTwoTable.getColumnModel().getColumn(0).setCellRenderer(renderTwo);

        DefaultTableCellRenderer renderThree = new DefaultTableCellRenderer();
        renderThree.setHorizontalAlignment(SwingConstants.CENTER);
        towerThreeTable.getColumnModel().getColumn(0).setCellRenderer(renderThree);
    }

    private void clean() {
        moveCount = 0;
        sec = 0;
        min = 0;
        disksComboBox.setSelectedItem(String.valueOf(target));
        clickedPlayBttn = 0;
    }

    private void showMoves() {
        moveCount++;
        movesLabel.setText(String.valueOf(moveCount));
    }

    private void start() {
        try {
            towerOne = new tower();
            towerTwo = new tower();
            towerThree = new tower();

            target = Integer.parseInt(disksComboBox.getSelectedItem().toString());

            movesLabel.setText(String.valueOf(moveCount));

            for (int i = target; i >= 1; i--) {
                node platform = new node();
                String disk = "";

                for (int j = i; j > 0; j--) {
                    disk += "#";
                }

                platform.setData(disk);
                towerOne.push(platform);
            }

            showTowerOne();
            showTowerTwo();
            showTowerThree();
        } catch (Exception e) {
        }
    }

    private void showTowerOne() {
        ((DefaultTableModel) towerOneTable.getModel()).setRowCount(0);
        tableModelOne.setRowCount(8);

        node i;

        int rowDisk = (8 - towerOne.getNodeCount());

        if (towerOne.getNodeCount() > 0) {

            for (i = towerOne.getHead(); i.getDown() != null; i = i.getDown()) {
                String[] vector = {i.getData()};

                tableModelOne.insertRow(rowDisk, vector);
                rowDisk++;
            }

            if (i.getDown() == null) {
                String[] vector = {i.getData()};
                tableModelOne.insertRow(rowDisk, vector);
            }
        }

        towerOneTable.setModel(tableModelOne);
        tableModelOne.setRowCount(8);
    }

    private void showTowerTwo() {
        ((DefaultTableModel) towerTwoTable.getModel()).setRowCount(0);
        tableModelTwo.setRowCount(8);

        node i;

        int rowDisk = (8 - towerTwo.getNodeCount());

        if (towerTwo.getNodeCount() > 0) {

            for (i = towerTwo.getHead(); i.getDown() != null; i = i.getDown()) {
                String[] vector = {i.getData()};

                tableModelTwo.insertRow(rowDisk, vector);
                rowDisk++;
            }

            if (i.getDown() == null) {
                String[] vector = {i.getData()};
                tableModelTwo.insertRow(rowDisk, vector);
            }
        }

        towerTwoTable.setModel(tableModelTwo);
        tableModelTwo.setRowCount(8);

    }

    private void showTowerThree() {
        ((DefaultTableModel) towerThreeTable.getModel()).setRowCount(0);
        tableModelThree.setRowCount(8);

        node i;

        int rowDisk = (8 - towerThree.getNodeCount());

        if (towerThree.getNodeCount() > 0) {

            for (i = towerThree.getHead(); i.getDown() != null; i = i.getDown()) {
                String[] vector = {i.getData()};

                tableModelThree.insertRow(rowDisk, vector);
                rowDisk++;
            }

            if (i.getDown() == null) {
                String[] vector = {i.getData()};
                tableModelThree.insertRow(rowDisk, vector);
            }
        }

        towerThreeTable.setModel(tableModelThree);
        tableModelThree.setRowCount(8);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        towerOneTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        towerTwoTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        towerThreeTable = new javax.swing.JTable();
        A2Button = new javax.swing.JButton();
        A3Button = new javax.swing.JButton();
        B1Button = new javax.swing.JButton();
        B3Button = new javax.swing.JButton();
        C1Button = new javax.swing.JButton();
        C2Button = new javax.swing.JButton();
        disksComboBox = new javax.swing.JComboBox<>();
        movesLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        hintButton = new javax.swing.JButton();
        retryButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        towerOneTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Torre 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        towerOneTable.setAutoscrolls(false);
        towerOneTable.setFocusable(false);
        towerOneTable.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(towerOneTable);
        if (towerOneTable.getColumnModel().getColumnCount() > 0) {
            towerOneTable.getColumnModel().getColumn(0).setResizable(false);
        }

        towerTwoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Torre 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        towerTwoTable.setAutoscrolls(false);
        towerTwoTable.setFocusable(false);
        towerTwoTable.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(towerTwoTable);
        if (towerTwoTable.getColumnModel().getColumnCount() > 0) {
            towerTwoTable.getColumnModel().getColumn(0).setResizable(false);
        }

        towerThreeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Torre 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        towerThreeTable.setAutoscrolls(false);
        towerThreeTable.setFocusable(false);
        towerThreeTable.setRowSelectionAllowed(false);
        jScrollPane3.setViewportView(towerThreeTable);
        if (towerThreeTable.getColumnModel().getColumnCount() > 0) {
            towerThreeTable.getColumnModel().getColumn(0).setResizable(false);
        }

        A2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/project_2/resources/icons8-2-64.png"))); // NOI18N
        A2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ButtonActionPerformed(evt);
            }
        });

        A3Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/project_2/resources/icons8-3-64.png"))); // NOI18N
        A3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ButtonActionPerformed(evt);
            }
        });

        B1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/project_2/resources/icons8-1-64.png"))); // NOI18N
        B1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ButtonActionPerformed(evt);
            }
        });

        B3Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/project_2/resources/icons8-3-64.png"))); // NOI18N
        B3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ButtonActionPerformed(evt);
            }
        });

        C1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/project_2/resources/icons8-1-64.png"))); // NOI18N
        C1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ButtonActionPerformed(evt);
            }
        });

        C2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/project_2/resources/icons8-2-64.png"))); // NOI18N
        C2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ButtonActionPerformed(evt);
            }
        });

        disksComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5", "6", "7", "8" }));

        movesLabel.setForeground(java.awt.Color.red);
        movesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movesLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("00:00");

        jLabel3.setText("Número de Discos:");

        jLabel4.setText("Número de Movimientos:");

        jLabel5.setText("Tiempo transcurrido:");

        playButton.setText("INICIAR");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        hintButton.setText("PISTA");

        retryButton.setText("REINICIAR");
        retryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryButtonActionPerformed(evt);
            }
        });

        quitButton.setText("ABANDONAR");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(A2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(retryButton)
                                .addGap(18, 18, 18)
                                .addComponent(quitButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(C1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(movesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(disksComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(129, 129, 129))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(playButton)
                .addGap(18, 18, 18)
                .addComponent(hintButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(B3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(C1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(C2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disksComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeLabel)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playButton)
                    .addComponent(hintButton)
                    .addComponent(retryButton)
                    .addComponent(quitButton))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        // TODO add your handling code here:

        state = true;
        clickedPlayBttn++;

        if (clickedPlayBttn > 1) {
            return;
        }

        start();

        Thread thread = new Thread() {
            public void run() {
                for (;;) {
                    if (state == true) {
                        try {
                            if (sec >= 60) {
                                sec = 0;
                                min++;
                            }
                            if (sec < 10 && min < 10) {
                                timeLabel.setText("0" + min + ":0" + sec);
                            } else {
                                if (sec < 10) {
                                    timeLabel.setText(min + ":0" + sec);
                                } else {
                                    if (min < 10) {
                                        timeLabel.setText("0" + min + ":" + sec);
                                    }
                                }
                            }
                            sleep(995);
                            sec++;
                        } catch (Exception e) {
                        }
                    } else {
                        break;
                    }
                }
            }
        };
        thread.start();
    }//GEN-LAST:event_playButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "En serio te vas? :(\n\nEsta partida contará como perdida", "Resultado de partida", JOptionPane.WARNING_MESSAGE);

        homeHanoi homeFrame = new homeHanoi();
        homeFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_quitButtonActionPerformed

    private void retryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryButtonActionPerformed
        // TODO add your handling code here:
        this.state = false;
        this.sec = 0;
        this.min = 0;
        timeLabel.setText("00:" + "00");
        clean();
        start();
        clickedPlayBttn = 0;
    }//GEN-LAST:event_retryButtonActionPerformed

    private void A2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ButtonActionPerformed
        // TODO add your handling code here:
        if (state == false) {
            return;
        }
        try {
            if (towerOne.getNodeCount() > 0) {
                node platform = new node();

                platform.setData(towerOne.pick());

                if (towerTwo.getNodeCount() > 0) {

                    if (platform.getData().compareTo(towerTwo.pick()) > 0) {
                        return;
                    }

                }

                towerOne.pop();
                towerTwo.push(platform);

                showTowerOne();
                showTowerTwo();
                showMoves();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_A2ButtonActionPerformed

    private void A3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ButtonActionPerformed
        // TODO add your handling code here:
        if (state == false) {
            return;
        }
        try {
            if (towerOne.getNodeCount() > 0) {
                node platform = new node();

                platform.setData(towerOne.pick());

                if (towerThree.getNodeCount() > 0) {

                    if (platform.getData().compareTo(towerThree.pick()) > 0) {
                        return;
                    }

                }

                towerOne.pop();
                towerThree.push(platform);

                showTowerOne();
                showTowerThree();
                showMoves();

                if (towerThree.getNodeCount() == target) {
                    JOptionPane.showMessageDialog(null, "Felicidades. Ganó el juego :D", "Resultado de partida", JOptionPane.WARNING_MESSAGE);
                    homeHanoi homeFrame = new homeHanoi();
                    homeFrame.setVisible(true);
                    this.dispose();
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_A3ButtonActionPerformed

    private void B1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ButtonActionPerformed
        // TODO add your handling code here:
        try {
            if (towerTwo.getNodeCount() > 0) {
                node platform = new node();

                platform.setData(towerTwo.pick());

                if (towerOne.getNodeCount() > 0) {

                    if (platform.getData().compareTo(towerOne.pick()) > 0) {
                        return;
                    }

                }

                towerTwo.pop();
                towerOne.push(platform);

                showTowerOne();
                showTowerTwo();
                showMoves();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_B1ButtonActionPerformed

    private void B3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ButtonActionPerformed
        // TODO add your handling code here:
        try {
            if (towerTwo.getNodeCount() > 0) {
                node platform = new node();

                platform.setData(towerTwo.pick());

                if (towerThree.getNodeCount() > 0) {

                    if (platform.getData().compareTo(towerThree.pick()) > 0) {
                        return;
                    }

                }

                towerTwo.pop();
                towerThree.push(platform);

                showTowerTwo();
                showTowerThree();
                showMoves();

                if (towerThree.getNodeCount() == target) {
                    JOptionPane.showMessageDialog(null, "Felicidades. Ganó el juego :D", "Resultado de partida", JOptionPane.WARNING_MESSAGE);
                    homeHanoi homeFrame = new homeHanoi();
                    homeFrame.setVisible(true);
                    this.dispose();
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_B3ButtonActionPerformed

    private void C1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ButtonActionPerformed
        // TODO add your handling code here:
        try {
            if (towerThree.getNodeCount() > 0) {
                node platform = new node();

                platform.setData(towerThree.pick());

                if (towerOne.getNodeCount() > 0) {

                    if (platform.getData().compareTo(towerOne.pick()) > 0) {
                        return;
                    }

                }

                towerThree.pop();
                towerOne.push(platform);

                showTowerOne();
                showTowerThree();
                showMoves();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_C1ButtonActionPerformed

    private void C2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ButtonActionPerformed
        // TODO add your handling code here:
                try {
            if (towerThree.getNodeCount() > 0) {
                node platform = new node();

                platform.setData(towerThree.pick());

                if (towerTwo.getNodeCount() > 0) {

                    if (platform.getData().compareTo(towerTwo.pick()) > 0) {
                        return;
                    }

                }

                towerThree.pop();
                towerTwo.push(platform);

                showTowerThree();
                showTowerTwo();
                showMoves();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_C2ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(normalModeHanoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(normalModeHanoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(normalModeHanoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(normalModeHanoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new normalModeHanoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A2Button;
    private javax.swing.JButton A3Button;
    private javax.swing.JButton B1Button;
    private javax.swing.JButton B3Button;
    private javax.swing.JButton C1Button;
    private javax.swing.JButton C2Button;
    private javax.swing.JComboBox<String> disksComboBox;
    private javax.swing.JButton hintButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel movesLabel;
    private javax.swing.JButton playButton;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton retryButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JTable towerOneTable;
    private javax.swing.JTable towerThreeTable;
    private javax.swing.JTable towerTwoTable;
    // End of variables declaration//GEN-END:variables
}
