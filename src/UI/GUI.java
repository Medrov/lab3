package UI;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import Model.Reactor;
import Util.Manager;

public class GUI extends javax.swing.JFrame {
    DefaultTreeModel model;
    Manager manager = new Manager();

    public GUI() {
        initComponents();
        setSize(600, 500); // Set the main window size to 1200x800
        setLocationRelativeTo(null); // Center the window on the screen
    }

    DefaultMutableTreeNode reactors = new DefaultMutableTreeNode("Reactors");

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aggregationWindow = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        closeButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        treePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReactorsTree = new javax.swing.JTree();
        buttonPanel = new javax.swing.JPanel();
        chooseFile = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        databaseButton = new javax.swing.JButton();
        regionButton = new javax.swing.JButton();
        countryButton = new javax.swing.JButton();
        operatorButton = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String[]{
                        "", "", ""
                }
        ));
        jScrollPane2.setViewportView(jTable1);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
                                        .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout aggregationWindowLayout = new javax.swing.GroupLayout(aggregationWindow.getContentPane());
        aggregationWindow.getContentPane().setLayout(aggregationWindowLayout);
        aggregationWindowLayout.setHorizontalGroup(
                aggregationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aggregationWindowLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        aggregationWindowLayout.setVerticalGroup(
                aggregationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aggregationWindowLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(ReactorsTree);

        treePanel.setBorder(BorderFactory.createTitledBorder("Reactors"));

        javax.swing.GroupLayout treePanelLayout = new javax.swing.GroupLayout(treePanel);
        treePanel.setLayout(treePanelLayout);
        treePanelLayout.setHorizontalGroup(
                treePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(treePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
        );
        treePanelLayout.setVerticalGroup(
                treePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(treePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                .addContainerGap())
        );

        buttonPanel.setBorder(BorderFactory.createTitledBorder("Actions"));

        chooseFile.setText("Choose File");
        chooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileActionPerformed(evt);
            }
        });

        clearButton.setText("Clear Tree");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        databaseButton.setText("Import Database");
        databaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseButtonActionPerformed(evt);
            }
        });

        regionButton.setText("Region");
        regionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionButtonActionPerformed(evt);
            }
        });

        countryButton.setText("Country");
        countryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryButtonActionPerformed(evt);
            }
        });

        operatorButton.setText("Operator");
        operatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chooseFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(databaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(regionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(countryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(operatorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(databaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(regionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(countryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(operatorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(treePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(treePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileActionPerformed
        JFileChooser chooser = new JFileChooser();
        // Указываем начальный каталог
        chooser.setCurrentDirectory(new File("."));
        // Отобразим диалоговое окно
        int response = chooser.showOpenDialog(null);
        if (chooser.getSelectedFile() == null) {
            System.out.println("Choose a file!");
        } else {
            manager.setList(new File(chooser.getSelectedFile().getAbsolutePath()));
            for (Reactor reactor : manager.getList()) {
                DefaultMutableTreeNode concreteReactor = new DefaultMutableTreeNode(reactor.getReactorClass());
                for (String parameter : reactor.getParameters()) {
                    concreteReactor.add(new DefaultMutableTreeNode(parameter));
                }
                reactors.add(concreteReactor);
                model = (DefaultTreeModel) ReactorsTree.getModel();
                model.setRoot(reactors);
                ReactorsTree.setModel(model);
            }
        }
    }//GEN-LAST:event_chooseFileActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        ReactorsTree.setModel(null);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void databaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseButtonActionPerformed
        manager.readDatabase();
    }//GEN-LAST:event_databaseButtonActionPerformed

    private void regionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionButtonActionPerformed
        createTable("Регион", manager.aggregateByRegion());
    }//GEN-LAST:event_regionButtonActionPerformed

    private void countryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryButtonActionPerformed
        createTable("Страна", manager.aggregateByCountry());
    }//GEN-LAST:event_countryButtonActionPerformed

    private void operatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operatorButtonActionPerformed
        createTable("Оператор", manager.aggregateByOperator());
    }//GEN-LAST:event_operatorButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        aggregationWindow.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void fillTable(Map<String, Long> dataMap) {
        List<Object[]> rows = dataMap.entrySet()
                .stream()
                .map(entry -> new Object[]{entry.getKey(), entry.getValue()})
                .collect(Collectors.toList());
        String[] columnNames = {"Category", "Count"};
        DefaultTableModel tableModel = new DefaultTableModel(rows.toArray(new Object[0][]), columnNames);
        jTable1.setModel(tableModel);
        aggregationWindow.pack();
    }

    private DefaultMutableTreeNode getChild(DefaultMutableTreeNode parent, String childName) {
        for (int i = 0; i < parent.getChildCount(); i++) {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) parent.getChildAt(i);
            if (child.getUserObject().equals(childName)) {
                return child;
            }
        }
        DefaultMutableTreeNode newChild = new DefaultMutableTreeNode(childName);
        parent.add(newChild);
        return newChild;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree ReactorsTree;
    private javax.swing.JDialog aggregationWindow;
    private javax.swing.JButton chooseFile;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton countryButton;
    private javax.swing.JButton databaseButton;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel treePanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton operatorButton;
    private javax.swing.JButton regionButton;
    // End of variables declaration//GEN-END:variables

    private void createTable(String title, Map<String, Map<Integer, Double>> map) {
        if (map != null) {
            // Define an ordered list of years
            List<Integer> years = IntStream.range(2014, 2025).boxed().collect(Collectors.toList());

            DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                            title, "Объем ежегодной загрузки, кг", "Год"
                    }
            ) {
                Class[] types = new Class[]{
                        java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
                };
                boolean[] canEdit = new boolean[]{
                        false, false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };

            for (Map.Entry<String, Map<Integer, Double>> entry : map.entrySet()) {
                Map<Integer, Double> fuelLoad = entry.getValue();

                // Iterate through the ordered list of years
                for (Integer year : years) {
                    Double load = fuelLoad.get(year);
                    if (load != null) {
                        model.addRow(new Object[]{entry.getKey(), Math.round(load), year});
                    } else {
                        // Add a row with zero load for missing years
                        model.addRow(new Object[]{entry.getKey(), 0, year});
                    }
                }
            }

            jTable1.setModel(model);

            // Set appropriate column widths
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(200); // Title column
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150); // Load column
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);  // Year column

            // Adjust the size of the aggregation window
            aggregationWindow.setSize(900, 600); // Adjusted window size to better fit the table
            aggregationWindow.setVisible(true);
        }
    }
}
