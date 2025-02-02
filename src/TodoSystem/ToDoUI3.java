package TodoSystem;

import javax.swing.*;

import java.awt.*;
import java.util.*;
public class ToDoUI3 extends JFrame{

    ToDoDriver driver;

    /*file
     * SchoolSize
     * text, bool
     * ....
     * HealthSize
     * text, bool
     * .....
     * OthersSize
     * text, bool
     * ......
     * ImportantSize
     * text
     * ......
     */

     /*todo:
      * read file and assign function
      * menu close, clear and write a final file
      */
    private ArrayList<JCheckBox> SchoolCheckBoxList = new ArrayList<JCheckBox>();
    private ArrayList<JCheckBox> HealthCheckBoxList = new ArrayList<JCheckBox>();
    private ArrayList<JCheckBox> OthersCheckBoxList = new ArrayList<JCheckBox>();
    private ArrayList<JCheckBox> ImportantCheckBoxList = new ArrayList<JCheckBox>();

    private int SchoolSize;
    private int HealthSize;
    private int OthersSize;
    private int ImportantSize;

    private int SchoolCheck;
    private int HealthCheck;
    private int OthersCheck;

    private String textAns;                 
    private String CategoryAns;

    ToDoUI3(ToDoDriver driver) {
        initComponents();
        setVisible(true);

    }

    private void initComponents() {

        TopPanel = new javax.swing.JPanel();
        EnterTaskLabel = new javax.swing.JLabel();
        TaskNameTextField = new javax.swing.JTextField();
        CategoryLabel = new javax.swing.JLabel();
        CategoryComboBox = new javax.swing.JComboBox<>();
        DeleteButton = new javax.swing.JButton();
        MenuButton = new javax.swing.JButton();
        ImpButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        SchoolScrollPane = new javax.swing.JScrollPane();
        SchoolWorkPanel = new javax.swing.JPanel();
        SchoolWorkLabel = new javax.swing.JLabel();
        SchoolWorkLabel.setForeground(Color.white);

        SchoolProgressBar = new javax.swing.JProgressBar();

        OthersScrollPane = new javax.swing.JScrollPane();
        OthersPanel = new javax.swing.JPanel();
        othersLabel = new javax.swing.JLabel();
        othersLabel.setForeground(Color.white);

        OthersProgressBar = new javax.swing.JProgressBar();

        HealthScrollPane = new javax.swing.JScrollPane();
        HealthPanel = new javax.swing.JPanel();
        HealthLabel = new javax.swing.JLabel();
        HealthLabel.setForeground(Color.white);

        HealthProgressBar = new javax.swing.JProgressBar();

        jPanel3 = new javax.swing.JPanel();
        ImportantWorkPanel = new javax.swing.JPanel();
        Imp1 = new javax.swing.JCheckBox();
        Imp3 = new javax.swing.JCheckBox();
        Imp2 = new javax.swing.JCheckBox();
        Imp4 = new javax.swing.JCheckBox();
        Imp5 = new javax.swing.JCheckBox();
        BUDDY = new javax.swing.JLabel();
        STUDY = new javax.swing.JLabel();
        PriorityTaskLabel = new javax.swing.JLabel();


        ImportantCheckBoxList.add(Imp1);
        Imp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imp2ActionPerformed(evt, 0);
            }
        });

        ImportantCheckBoxList.add(Imp2);
        Imp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imp2ActionPerformed(evt, 1);
            }
        });

        ImportantCheckBoxList.add(Imp3);
        Imp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imp2ActionPerformed(evt, 2);
            }
        });

        ImportantCheckBoxList.add(Imp4);
        Imp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imp2ActionPerformed(evt, 3);
            }
        });

        ImportantCheckBoxList.add(Imp5);
        Imp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imp2ActionPerformed(evt, 4);
            }
        });



        SchoolProgressBar.setStringPainted(true);
        HealthProgressBar.setStringPainted(true);
        OthersProgressBar.setStringPainted(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setSize(new java.awt.Dimension(700, 550));

        TopPanel.setBackground(new java.awt.Color(51, 51, 51));
        TopPanel.setForeground(new java.awt.Color(102, 102, 102));

        EnterTaskLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        EnterTaskLabel.setForeground(new java.awt.Color(255, 255, 255));
        EnterTaskLabel.setText("Enter Task:");

        CategoryLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        CategoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        CategoryLabel.setText("Category:");

        CategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School Work", "Health", "Others"}));

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });


        MenuButton.setText("MENU");

        ImpButton.setText("⭐");
        ImpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImpActionPerformed(evt);
            }
        });

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(MenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addComponent(EnterTaskLabel)
                .addGap(18, 18, 18)
                .addComponent(TaskNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(CategoryLabel)
                .addGap(18, 18, 18)
                .addComponent(CategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TopPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(MenuButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoryLabel)
                            .addComponent(TaskNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnterTaskLabel)
                            .addComponent(AddButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ImpButton)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        
        SchoolWorkPanel.setBackground(new java.awt.Color(109, 100, 188));


        SchoolWorkLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        SchoolWorkLabel.setText("School Work");


        SchoolWorkPanel.setLayout(new BoxLayout(SchoolWorkPanel, BoxLayout.Y_AXIS));
        SchoolWorkPanel.add(Box.createRigidArea(new Dimension(10, 15)));
        SchoolWorkPanel.add(SchoolWorkLabel);
        SchoolWorkPanel.add(Box.createRigidArea(new Dimension(10, 15)));
        SchoolWorkPanel.add(SchoolProgressBar);
        


        SchoolScrollPane.setViewportView(SchoolWorkPanel);
        SchoolScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        SchoolScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        OthersPanel.setBackground(new java.awt.Color(197, 193, 229));

        othersLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        othersLabel.setForeground(Color.white);
        othersLabel.setText("Others");

        OthersPanel.setLayout(new BoxLayout(OthersPanel, BoxLayout.Y_AXIS));
        OthersPanel.add(Box.createRigidArea(new Dimension(10, 15)));
        OthersPanel.add(othersLabel);
        OthersPanel.add(Box.createRigidArea(new Dimension(10, 15)));
        OthersPanel.add(OthersProgressBar);

        OthersScrollPane.setViewportView(OthersPanel);
        OthersScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        OthersScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        HealthPanel.setBackground(new java.awt.Color(152, 146, 207));

        HealthLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        HealthLabel.setText("Health");


        HealthPanel.setLayout(new BoxLayout(HealthPanel, BoxLayout.Y_AXIS));
        HealthPanel.add(Box.createRigidArea(new Dimension(10, 15)));
        HealthPanel.add(HealthLabel);
        HealthPanel.add(Box.createRigidArea(new Dimension(10, 15)));
        HealthPanel.add(HealthProgressBar);

        HealthScrollPane.setViewportView(HealthPanel);
        HealthScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        HealthScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ImportantWorkPanel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout ImportantWorkPanelLayout = new javax.swing.GroupLayout(ImportantWorkPanel);
        ImportantWorkPanel.setLayout(ImportantWorkPanelLayout);
        ImportantWorkPanelLayout.setHorizontalGroup(
            ImportantWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImportantWorkPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ImportantWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Imp5)
                    .addComponent(Imp4)
                    .addComponent(Imp2)
                    .addComponent(Imp3)
                    .addComponent(Imp1))
                .addContainerGap(680, Short.MAX_VALUE))
        );

        ImportantWorkPanelLayout.setVerticalGroup(
            ImportantWorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImportantWorkPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Imp1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imp2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Imp3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Imp4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imp5)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PriorityTaskLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 20)); // NOI18N
        PriorityTaskLabel.setText("Priority Task");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PriorityTaskLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(486, 486, 486))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SchoolScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(41, 41, 41)
                        .addComponent(HealthScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(46, 46, 46)
                        .addComponent(OthersScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ImportantWorkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)

                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
  
                                .addGap(170, 170, 170))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HealthScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(SchoolScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(OthersScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PriorityTaskLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ImportantWorkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)

                        .addGap(18, 18, 18)

                        .addContainerGap())))
        );

        

        pack();
    }// </editor-fold>           
    
    private void ImpActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource() == ImpButton) {
            textAns = TaskNameTextField.getText();

            ImportantSize++;
            ImportantCheckBoxList.get(ImportantSize-1).setText(textAns);
        }
    }

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {

        if(evt.getSource() == DeleteButton) {
            System.out.println("Delete match");
            int i = 0;
            int i2 = 0;
            int i3 = 0;

            textAns = TaskNameTextField.getText();
            CategoryAns = (String)CategoryComboBox.getSelectedItem();
            if(CategoryAns == "School Work") {
                int sizetmp = SchoolSize;
               for(i = 0; i < sizetmp; i++) {

                    if(textAns.equals(SchoolCheckBoxList.get(i).getText())){

                        SchoolCheckBoxList.get(i).setText("");
                        SchoolWorkPanel.remove((JCheckBox)SchoolCheckBoxList.get(i));

                        SchoolCheckBoxList.remove(i);

                        SchoolSize--;

                        SchoolWorkPanel.revalidate();
                        validate();
                        repaint();
                        this.pack();
                        
                        break;
                    }
               }
                SchoolActionPerformed(evt);
           }
               
            else if(CategoryAns == "Health") {
                for(i2 = 0; i2 < HealthSize; i2++) {
                    System.out.println(textAns);
                    System.out.println(HealthCheckBoxList.get(i2).getText());
                        if(textAns.equals(HealthCheckBoxList.get(i2).getText())){
                            System.out.println("found match");

                            HealthPanel.remove(SchoolCheckBoxList.get(i2));

                            HealthCheckBoxList.remove(i2);
                            
           
                            HealthSize--;
                            HealthPanel.revalidate();
                            validate();
                            repaint();
                            this.pack();
                            
                            break;
                        }
                   }
                    HealthActionPerformed(evt);
 
            }
               
            else if (CategoryAns == "Others"){
                for(i3 = 0; i3 < OthersSize; i3++) {
                    System.out.println(textAns);
                    System.out.println(OthersCheckBoxList.get(i3).getText());
                        if(textAns.equals(OthersCheckBoxList.get(i3).getText())){
                            System.out.println("found match");

                            OthersPanel.remove(SchoolCheckBoxList.get(i3));
                            OthersCheckBoxList.remove(i3);
                            

                            OthersSize--;

                            SchoolWorkPanel.revalidate();
                            validate();
                            repaint();
                            this.pack();
                            
                            break;
                        }
                   }
                    OthersActionPerformed(evt);
                

            }
            


        }
    }
        

        
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource() == AddButton) {
            textAns = TaskNameTextField.getText();
            CategoryAns = (String)CategoryComboBox.getSelectedItem();

            if(CategoryAns == "School Work" ) {
                SchoolSize++;
                System.out.println(SchoolSize);

                SchoolCheckBoxList.add(new JCheckBox());
                SchoolCheckBoxList.get(SchoolSize-1).setText(textAns);

                SchoolWorkPanel.add(SchoolCheckBoxList.get(SchoolSize-1));
                SchoolActionPerformed(evt);

                SchoolCheckBoxList.get(SchoolSize-1).addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            System.out.println("Schoolsize" + SchoolSize);

                            SchoolActionPerformed(evt);

                    }
                });

                this.pack();

            }
            else if(CategoryAns == "Health") {

                HealthSize++;

                HealthCheckBoxList.add(new JCheckBox());
                HealthCheckBoxList.get(HealthSize-1).setText(textAns);

                HealthPanel.add(HealthCheckBoxList.get(HealthSize-1));
               
                HealthActionPerformed(evt);

                HealthCheckBoxList.get(HealthSize-1).addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {

                            HealthActionPerformed(evt);

                    }
                });

                this.pack();

            }
            else if(CategoryAns == "Others"){

                OthersSize++;

                OthersCheckBoxList.add(new JCheckBox());
                OthersCheckBoxList.get(OthersSize-1).setText(textAns);

                OthersPanel.add(OthersCheckBoxList.get(OthersSize-1));

                OthersActionPerformed(evt);

                OthersCheckBoxList.get(OthersSize-1).addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {

                            OthersActionPerformed(evt);

                    }
                });

                this.pack();

            }
        }
    }

    //text is not same all the time
    private void SchoolActionPerformed(java.awt.event.ActionEvent evt) {

        System.out.println("click");
        SchoolCheck = 0;

        for(int count = 0; count < SchoolSize; count++) {
            if(SchoolCheckBoxList.get(count).isSelected()) {
                System.out.println("isselected");
                System.out.println("cout" + count);

                SchoolCheck++;
            }
        }
        System.out.println("school check" + SchoolCheck);
        System.out.println("school size:" + SchoolSize);

        double double_SchoolCheck = SchoolCheck;
        double double_SchoolSize = SchoolSize;

        double proportion = (double_SchoolCheck/double_SchoolSize) * 100;

        int int_proportion = (int)proportion;
        System.out.println(proportion);
        SchoolProgressBar.setValue(int_proportion);
    }

    private void HealthActionPerformed(java.awt.event.ActionEvent evt) {

        System.out.println("click");
        HealthCheck = 0;

        for(int count = 0; count < HealthSize; count++) {
            if(HealthCheckBoxList.get(count).isSelected()) {
                System.out.println("isselected");
                System.out.println("cout" + count);
                HealthCheck++;
            }
        }
        System.out.println("school check" + HealthCheck);
        System.out.println("school size:" + HealthSize);

        double double_HealthCheck = HealthCheck;
        double double_HealthSize = HealthSize;

        double proportion = (double_HealthCheck/double_HealthSize) * 100;

        int int_proportion = (int)proportion;
        System.out.println(proportion);
        HealthProgressBar.setValue(int_proportion);
    }

    private void OthersActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("click");
        OthersCheck = 0;

        for(int count = 0; count < OthersSize; count++) {
            if(OthersCheckBoxList.get(count).isSelected()) {
                System.out.println("isselected");
                System.out.println("cout" + count);
                OthersCheck++;
            }
        }
        System.out.println("school check" + OthersCheck);
        System.out.println("school size:" + OthersSize);

        double double_OthersCheck = OthersCheck;
        double double_OthersSize = OthersSize;

        double proportion = (double_OthersCheck/double_OthersSize) * 100;

        int int_proportion = (int)proportion;
        System.out.println(proportion);
        OthersProgressBar.setValue(int_proportion);
    }

    private void Imp2ActionPerformed(java.awt.event.ActionEvent evt, int id) {
        if(ImportantCheckBoxList.get(id).getText().equals("")) {
            ImportantCheckBoxList.get(id).setSelected(false);
        }
        else {
            String imp_tmp = ImportantCheckBoxList.get(ImportantSize-1).getText();
            boolean imp_bool = ImportantCheckBoxList.get(ImportantSize-1).isSelected();

            ImportantCheckBoxList.get(id).setText(imp_tmp);
            ImportantCheckBoxList.get(id).setSelected(imp_bool);

            ImportantCheckBoxList.get(ImportantSize-1).setText("");
            ImportantCheckBoxList.get(ImportantSize-1).setSelected(false);

            ImportantSize--;
        }
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel BUDDY;
    private javax.swing.JComboBox<String> CategoryComboBox;
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton ImpButton;
    private javax.swing.JLabel EnterTaskLabel;

    private javax.swing.JLabel HealthLabel;
    private javax.swing.JPanel HealthPanel;
    private javax.swing.JScrollPane HealthScrollPane;
    private javax.swing.JCheckBox Imp1;
    private javax.swing.JCheckBox Imp2;
    private javax.swing.JCheckBox Imp3;
    private javax.swing.JCheckBox Imp4;
    private javax.swing.JCheckBox Imp5;
    private javax.swing.JPanel ImportantWorkPanel;
    private javax.swing.JButton MenuButton;

    private javax.swing.JPanel OthersPanel;
    private javax.swing.JScrollPane OthersScrollPane;
    private javax.swing.JLabel PriorityTaskLabel;
    private javax.swing.JLabel STUDY;
   
    private javax.swing.JScrollPane SchoolScrollPane;
    private javax.swing.JLabel SchoolWorkLabel;
    private javax.swing.JPanel SchoolWorkPanel;
    private javax.swing.JTextField TaskNameTextField;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar SchoolProgressBar;
    private javax.swing.JProgressBar HealthProgressBar;
    private javax.swing.JProgressBar OthersProgressBar;
    private javax.swing.JLabel othersLabel;
    // End of variables declaration                   

    
}

