package LoginSystem;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class CreateAccountUI extends JPanel {
    LoginUI mainUI;

    public CreateAccountUI(LoginUI main) {
        this.mainUI = main;
        this.setLayout(new BorderLayout());
        this.add(createAccountPanel);
        this.setOpaque(false);

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainUI.createLoginUI();
            }
        });
    }

    private JButton cancelButton;
    private JButton createAccountButton;
    private JPasswordField passwordField;
    private JTextField usernameField;
    private JPanel createAccountPanel;

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createAccountPanel = new JPanel();
        createAccountPanel.setLayout(new GridBagLayout());
        createAccountPanel.setOpaque(false);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setOpaque(false);
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        createAccountPanel.add(panel1, gbc);
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$("Consolas", Font.BOLD, 72, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-1447447));
        label1.setHorizontalAlignment(0);
        label1.setHorizontalTextPosition(0);
        label1.setText("Hello There!");
        label1.setVerticalTextPosition(3);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.ipady = 30;
        gbc.insets = new Insets(30, 0, 0, 0);
        panel1.add(label1, gbc);
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$("Consolas", Font.BOLD, 18, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-1447447));
        label2.setHorizontalAlignment(0);
        label2.setHorizontalTextPosition(0);
        label2.setText("Welcome to StudyBuddy application! To use, create your account first!");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(0, 30, 0, 30);
        panel1.add(label2, gbc);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel2.setOpaque(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        createAccountPanel.add(panel2, gbc);
        cancelButton = new JButton();
        cancelButton.setBackground(new Color(-2829100));
        cancelButton.setFocusPainted(false);
        Font cancelButtonFont = this.$$$getFont$$$("Consolas", Font.BOLD, 20, cancelButton.getFont());
        if (cancelButtonFont != null) cancelButton.setFont(cancelButtonFont);
        cancelButton.setForeground(new Color(-2829100));
        cancelButton.setOpaque(false);
        cancelButton.setText("Back");
        panel2.add(cancelButton);
        createAccountButton = new JButton();
        createAccountButton.setBackground(new Color(-14737633));
        createAccountButton.setFocusPainted(false);
        Font createAccountButtonFont = this.$$$getFont$$$("Consolas", Font.BOLD, 20, createAccountButton.getFont());
        if (createAccountButtonFont != null) createAccountButton.setFont(createAccountButtonFont);
        createAccountButton.setForeground(new Color(-2829100));
        createAccountButton.setOpaque(false);
        createAccountButton.setText("Create Account");
        panel2.add(createAccountButton);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridBagLayout());
        panel3.setOpaque(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 30;
        gbc.ipady = 50;
        createAccountPanel.add(panel3, gbc);
        final JLabel label3 = new JLabel();
        label3.setBackground(new Color(-2829100));
        Font label3Font = this.$$$getFont$$$("Monospaced", Font.BOLD, 18, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-1447447));
        label3.setText("Username: ");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(label3, gbc);
        final JLabel label4 = new JLabel();
        label4.setBackground(new Color(-2829100));
        Font label4Font = this.$$$getFont$$$("Monospaced", Font.BOLD, 18, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-1447447));
        label4.setText("Password: ");
        label4.setVerticalAlignment(3);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.ipady = 20;
        panel3.add(label4, gbc);
        passwordField = new JPasswordField();
        passwordField.setBackground(new Color(-14737633));
        passwordField.setCaretColor(new Color(-2829100));
        Font passwordFieldFont = this.$$$getFont$$$("DialogInput", Font.BOLD, 16, passwordField.getFont());
        if (passwordFieldFont != null) passwordField.setFont(passwordFieldFont);
        passwordField.setForeground(new Color(-1447447));
        passwordField.setOpaque(false);
        passwordField.setSelectedTextColor(new Color(-14737633));
        passwordField.setSelectionColor(new Color(-5811170));
        passwordField.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 300;
        panel3.add(passwordField, gbc);
        usernameField = new JTextField();
        usernameField.setBackground(new Color(-14737633));
        usernameField.setCaretColor(new Color(-2829100));
        Font usernameFieldFont = this.$$$getFont$$$("DialogInput", Font.BOLD, 16, usernameField.getFont());
        if (usernameFieldFont != null) usernameField.setFont(usernameFieldFont);
        usernameField.setForeground(new Color(-1447447));
        usernameField.setOpaque(false);
        usernameField.setSelectedTextColor(new Color(-14737633));
        usernameField.setSelectionColor(new Color(-5811170));
        usernameField.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 500;
        panel3.add(usernameField, gbc);
        final JLabel label5 = new JLabel();
        label5.setBackground(new Color(-2829100));
        Font label5Font = this.$$$getFont$$$("Monospaced", Font.BOLD, 18, label5.getFont());
        if (label5Font != null) label5.setFont(label5Font);
        label5.setForeground(new Color(-1447447));
        label5.setText("");
        label5.setVerticalAlignment(3);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.ipady = 20;
        panel3.add(label5, gbc);
        final JLabel label6 = new JLabel();
        label6.setBackground(new Color(-2829100));
        Font label6Font = this.$$$getFont$$$("Monospaced", Font.BOLD, 18, label6.getFont());
        if (label6Font != null) label6.setFont(label6Font);
        label6.setForeground(new Color(-1447447));
        label6.setText("Confirm Password:");
        label6.setVerticalAlignment(3);
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.ipady = 20;
        panel3.add(label6, gbc);
        final JPasswordField passwordField1 = new JPasswordField();
        passwordField1.setBackground(new Color(-14737633));
        passwordField1.setCaretColor(new Color(-2829100));
        Font passwordField1Font = this.$$$getFont$$$("DialogInput", Font.BOLD, 16, passwordField1.getFont());
        if (passwordField1Font != null) passwordField1.setFont(passwordField1Font);
        passwordField1.setForeground(new Color(-1447447));
        passwordField1.setOpaque(false);
        passwordField1.setSelectedTextColor(new Color(-14737633));
        passwordField1.setSelectionColor(new Color(-5811170));
        passwordField1.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 300;
        panel3.add(passwordField1, gbc);
        final JLabel label7 = new JLabel();
        label7.setBackground(new Color(-2829100));
        Font label7Font = this.$$$getFont$$$("Monospaced", Font.BOLD, 18, label7.getFont());
        if (label7Font != null) label7.setFont(label7Font);
        label7.setForeground(new Color(-1447447));
        label7.setText("Name:");
        label7.setVerticalAlignment(3);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.ipady = 20;
        panel3.add(label7, gbc);
        final JLabel label8 = new JLabel();
        label8.setBackground(new Color(-2829100));
        Font label8Font = this.$$$getFont$$$("Monospaced", Font.BOLD, 18, label8.getFont());
        if (label8Font != null) label8.setFont(label8Font);
        label8.setForeground(new Color(-1447447));
        label8.setText("Last Name:");
        label8.setVerticalAlignment(3);
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.ipady = 20;
        panel3.add(label8, gbc);
        final JTextField textField1 = new JTextField();
        textField1.setBackground(new Color(-14737633));
        textField1.setCaretColor(new Color(-2829100));
        Font textField1Font = this.$$$getFont$$$("DialogInput", Font.BOLD, 16, textField1.getFont());
        if (textField1Font != null) textField1.setFont(textField1Font);
        textField1.setForeground(new Color(-1447447));
        textField1.setOpaque(false);
        textField1.setSelectedTextColor(new Color(-14737633));
        textField1.setSelectionColor(new Color(-5811170));
        textField1.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 300;
        panel3.add(textField1, gbc);
        final JTextField textField2 = new JTextField();
        textField2.setBackground(new Color(-14737633));
        textField2.setCaretColor(new Color(-2829100));
        Font textField2Font = this.$$$getFont$$$("DialogInput", Font.BOLD, 16, textField2.getFont());
        if (textField2Font != null) textField2.setFont(textField2Font);
        textField2.setForeground(new Color(-1447447));
        textField2.setOpaque(false);
        textField2.setSelectedTextColor(new Color(-14737633));
        textField2.setSelectionColor(new Color(-5811170));
        textField2.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 300;
        panel3.add(textField2, gbc);
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridBagLayout());
        panel4.setOpaque(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 20, 0, 20);
        panel3.add(panel4, gbc);
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
        return createAccountPanel;
    }

}
