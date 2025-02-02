package MenuSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;

public class MenuUI extends JFrame {
    private final MenuDriver driver;
    private JPanel MenuPanel;
    private JButton exitButton;
    private JButton logoutButton;
    private JButton scheduleButton;
    private JButton toDoListButton;
    private JButton profileButton;
    private JLabel clockLabel;
    private JLabel dateLabel;
    private JPanel ProfileWidgetPanel;
    private JPanel ToDoWidgetPanel;
    private JPanel SchedulesWidgetPanel;
    public ClockDate clock;

    MenuUI(MenuDriver driver) {
        super("Main Menu");
        this.driver = driver;
        $$$setupUI$$$();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setContentPane(MenuPanel);
        this.setSize(new Dimension(1600, 900));
        this.setMinimumSize(new Dimension(1200, 800));
        clock = new ClockDate(clockLabel, dateLabel);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                driver.exitProcedure();
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                driver.exitProcedure();
            }
        });

        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                exitButton.setBackground(new Color(23, 8, 46));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                exitButton.setBackground(new Color(41, 12, 100));
            }
        });
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                driver.logoutProcedure();
            }
        });
        logoutButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                logoutButton.setBackground(new Color(23, 8, 46));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                logoutButton.setBackground(new Color(41, 12, 100));
            }
        });
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                driver.menuSelection(MenuDriver.MENU_PROFILE);
            }
        });
        profileButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                profileButton.setBackground(new Color(23, 8, 46));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                profileButton.setBackground(new Color(41, 12, 100));
            }
        });
        scheduleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                driver.menuSelection(MenuDriver.MENU_SCHEDULE);
            }
        });
        scheduleButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                scheduleButton.setBackground(new Color(23, 8, 46));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                scheduleButton.setBackground(new Color(41, 12, 100));
            }
        });
        toDoListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                driver.menuSelection(MenuDriver.MENU_TODO);
            }
        });
        toDoListButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                toDoListButton.setBackground(new Color(23, 8, 46));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                toDoListButton.setBackground(new Color(41, 12, 100));
            }
        });

    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        MenuPanel = new JPanel();
        MenuPanel.setLayout(new BorderLayout(0, 0));
        MenuPanel.setBackground(new Color(-657419));
        MenuPanel.setOpaque(true);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setBackground(new Color(-14087068));
        panel1.setOpaque(true);
        panel1.setPreferredSize(new Dimension(800, 100));
        MenuPanel.add(panel1, BorderLayout.NORTH);
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$("Lucida Sans", Font.PLAIN, 72, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-1447447));
        label1.setHorizontalAlignment(0);
        label1.setHorizontalTextPosition(0);
        label1.setText("Dashboard.");
        label1.setVerticalTextPosition(3);
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 2.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(15, 20, 10, 50);
        panel1.add(label1, gbc);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        panel2.setBackground(new Color(-14087068));
        panel2.setOpaque(true);
        panel2.setPreferredSize(new Dimension(220, 600));
        MenuPanel.add(panel2, BorderLayout.WEST);
        profileButton = new JButton();
        profileButton.setBackground(new Color(-14087068));
        profileButton.setBorderPainted(false);
        profileButton.setFocusPainted(false);
        Font profileButtonFont = this.$$$getFont$$$("Lucida Sans", Font.PLAIN, 26, profileButton.getFont());
        if (profileButtonFont != null) profileButton.setFont(profileButtonFont);
        profileButton.setForeground(new Color(-2829100));
        profileButton.setHorizontalTextPosition(11);
        profileButton.setOpaque(true);
        profileButton.setText("Profile");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 50;
        gbc.ipady = 20;
        panel2.add(profileButton, gbc);
        scheduleButton = new JButton();
        scheduleButton.setBackground(new Color(-14087068));
        scheduleButton.setBorderPainted(false);
        scheduleButton.setFocusPainted(false);
        Font scheduleButtonFont = this.$$$getFont$$$("Lucida Sans", Font.PLAIN, 26, scheduleButton.getFont());
        if (scheduleButtonFont != null) scheduleButton.setFont(scheduleButtonFont);
        scheduleButton.setForeground(new Color(-2829100));
        scheduleButton.setOpaque(true);
        scheduleButton.setText("Schedule");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 50;
        gbc.ipady = 20;
        panel2.add(scheduleButton, gbc);
        toDoListButton = new JButton();
        toDoListButton.setBackground(new Color(-14087068));
        toDoListButton.setBorderPainted(false);
        toDoListButton.setFocusPainted(false);
        toDoListButton.setFocusTraversalPolicyProvider(false);
        Font toDoListButtonFont = this.$$$getFont$$$("Lucida Sans", Font.PLAIN, 26, toDoListButton.getFont());
        if (toDoListButtonFont != null) toDoListButton.setFont(toDoListButtonFont);
        toDoListButton.setForeground(new Color(-2829100));
        toDoListButton.setOpaque(true);
        toDoListButton.setText("To-Do List");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 50;
        gbc.ipady = 20;
        panel2.add(toDoListButton, gbc);
        logoutButton = new JButton();
        logoutButton.setBackground(new Color(-14087068));
        logoutButton.setBorderPainted(false);
        logoutButton.setFocusPainted(false);
        Font logoutButtonFont = this.$$$getFont$$$("Lucida Sans", Font.PLAIN, 26, logoutButton.getFont());
        if (logoutButtonFont != null) logoutButton.setFont(logoutButtonFont);
        logoutButton.setForeground(new Color(-2829100));
        logoutButton.setOpaque(true);
        logoutButton.setText("Logout");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 50;
        gbc.ipady = 20;
        panel2.add(logoutButton, gbc);
        exitButton = new JButton();
        exitButton.setBackground(new Color(-14087068));
        exitButton.setBorderPainted(false);
        exitButton.setFocusPainted(false);
        Font exitButtonFont = this.$$$getFont$$$("Lucida Sans", Font.PLAIN, 26, exitButton.getFont());
        if (exitButtonFont != null) exitButton.setFont(exitButtonFont);
        exitButton.setForeground(new Color(-2829100));
        exitButton.setOpaque(true);
        exitButton.setText("Exit");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 50;
        gbc.ipady = 20;
        panel2.add(exitButton, gbc);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout(0, 0));
        panel3.setBackground(new Color(-657419));
        panel3.setOpaque(true);
        panel3.setPreferredSize(new Dimension(300, 10));
        MenuPanel.add(panel3, BorderLayout.CENTER);
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new BorderLayout(0, 0));
        panel4.setOpaque(false);
        panel3.add(panel4, BorderLayout.SOUTH);
        clockLabel = new JLabel();
        Font clockLabelFont = this.$$$getFont$$$("Lucida Sans", Font.BOLD, 72, clockLabel.getFont());
        if (clockLabelFont != null) clockLabel.setFont(clockLabelFont);
        clockLabel.setForeground(new Color(-16777216));
        clockLabel.setHorizontalAlignment(4);
        clockLabel.setHorizontalTextPosition(4);
        clockLabel.setText(" clock");
        panel4.add(clockLabel, BorderLayout.CENTER);
        dateLabel = new JLabel();
        Font dateLabelFont = this.$$$getFont$$$("Lucida Sans", -1, 36, dateLabel.getFont());
        if (dateLabelFont != null) dateLabel.setFont(dateLabelFont);
        dateLabel.setForeground(new Color(-13684945));
        dateLabel.setHorizontalAlignment(4);
        dateLabel.setHorizontalTextPosition(4);
        dateLabel.setText(" date");
        panel4.add(dateLabel, BorderLayout.SOUTH);
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new GridBagLayout());
        panel5.setOpaque(false);
        panel3.add(panel5, BorderLayout.CENTER);
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new BorderLayout(0, 0));
        panel6.setBackground(new Color(-657419));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel5.add(panel6, gbc);
        panel6.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JPanel panel7 = new JPanel();
        panel7.setLayout(new BorderLayout(0, 0));
        panel7.setBackground(new Color(-14737633));
        panel6.add(panel7, BorderLayout.NORTH);
        final JLabel label2 = new JLabel();
        label2.setAutoscrolls(false);
        label2.setBackground(new Color(-14737633));
        Font label2Font = this.$$$getFont$$$("Lucida Sans", Font.BOLD, 28, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-657419));
        label2.setHorizontalAlignment(0);
        label2.setMaximumSize(new Dimension(200, 40));
        label2.setMinimumSize(new Dimension(200, 40));
        label2.setPreferredSize(new Dimension(200, 50));
        label2.setText("Profile");
        panel7.add(label2, BorderLayout.CENTER);
        ProfileWidgetPanel = new JPanel();
        ProfileWidgetPanel.setLayout(new BorderLayout(0, 0));
        ProfileWidgetPanel.setBackground(new Color(-12171706));
        panel6.add(ProfileWidgetPanel, BorderLayout.CENTER);
        final JPanel panel8 = new JPanel();
        panel8.setLayout(new BorderLayout(0, 0));
        panel8.setBackground(new Color(-657419));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel5.add(panel8, gbc);
        panel8.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-4473925)), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JPanel panel9 = new JPanel();
        panel9.setLayout(new BorderLayout(0, 0));
        panel9.setBackground(new Color(-14737633));
        panel8.add(panel9, BorderLayout.NORTH);
        final JLabel label3 = new JLabel();
        label3.setAlignmentY(0.0f);
        Font label3Font = this.$$$getFont$$$("Lucida Sans", Font.BOLD, 28, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-657419));
        label3.setHorizontalAlignment(0);
        label3.setMaximumSize(new Dimension(200, 40));
        label3.setMinimumSize(new Dimension(200, 40));
        label3.setPreferredSize(new Dimension(200, 50));
        label3.setText("To-Do");
        panel9.add(label3, BorderLayout.CENTER);
        ToDoWidgetPanel = new JPanel();
        ToDoWidgetPanel.setLayout(new BorderLayout(0, 0));
        ToDoWidgetPanel.setBackground(new Color(-12171706));
        panel8.add(ToDoWidgetPanel, BorderLayout.CENTER);
        final JPanel panel10 = new JPanel();
        panel10.setLayout(new BorderLayout(0, 0));
        panel10.setBackground(new Color(-657419));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel5.add(panel10, gbc);
        panel10.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JPanel panel11 = new JPanel();
        panel11.setLayout(new BorderLayout(0, 0));
        panel11.setAutoscrolls(false);
        panel11.setBackground(new Color(-14737633));
        panel10.add(panel11, BorderLayout.NORTH);
        final JLabel label4 = new JLabel();
        label4.setAlignmentY(0.0f);
        Font label4Font = this.$$$getFont$$$("Lucida Sans", Font.BOLD, 28, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-657419));
        label4.setHorizontalAlignment(0);
        label4.setMaximumSize(new Dimension(200, 40));
        label4.setMinimumSize(new Dimension(200, 40));
        label4.setPreferredSize(new Dimension(200, 50));
        label4.setText("Schedules");
        panel11.add(label4, BorderLayout.CENTER);
        SchedulesWidgetPanel = new JPanel();
        SchedulesWidgetPanel.setLayout(new BorderLayout(0, 0));
        SchedulesWidgetPanel.setBackground(new Color(-12171706));
        panel10.add(SchedulesWidgetPanel, BorderLayout.CENTER);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return MenuPanel;
    }

}
