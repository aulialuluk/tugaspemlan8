import javax.swing.*;
import java.awt.*;

public class Form {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Pendaftaran Ulang Mahasiswa Baru");
        frame.setSize(520, 370);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(new Color(245, 250, 255));

        JPanel formPanel = new JPanel(new GridLayout(4, 2, 15, 15));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        formPanel.setBackground(Color.WHITE);

        JTextField nameField = new JTextField();
        JTextField nimField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField phoneField = new JTextField();

        formPanel.add(new JLabel("Nama:"));
        formPanel.add(nameField);
        formPanel.add(new JLabel("NIM:"));
        formPanel.add(nimField);
        formPanel.add(new JLabel("Email:"));
        formPanel.add(emailField);
        formPanel.add(new JLabel("No. Telepon:"));
        formPanel.add(phoneField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(245, 250, 255));
        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        submitButton.setBackground(new Color(70, 130, 180));
        submitButton.setForeground(Color.WHITE);
        submitButton.setFocusPainted(false);
        submitButton.setPreferredSize(new Dimension(120, 35));
        buttonPanel.add(submitButton);

        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        submitButton.addActionListener(e -> {
            String nomorPendaftaran = "REG-" + System.currentTimeMillis();
            JFrame dataFrame = new JFrame("Data Pendaftaran");
            dataFrame.setSize(520, 370);
            dataFrame.setLayout(new BorderLayout());
            dataFrame.setLocationRelativeTo(frame);
            dataFrame.getContentPane().setBackground(new Color(245, 250, 255));

            JPanel dataPanel = new JPanel(new GridLayout(5, 1, 10, 10));
            dataPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
            dataPanel.setBackground(Color.WHITE);

            JLabel regLabel = new JLabel("Nomor Pendaftaran: " + nomorPendaftaran, SwingConstants.LEFT);
            regLabel.setFont(new Font("Segoe UI", Font.BOLD, 15));
            dataPanel.add(regLabel);
            dataPanel.add(new JLabel("Nama: " + nameField.getText(), SwingConstants.LEFT));
            dataPanel.add(new JLabel("NIM: " + nimField.getText(), SwingConstants.LEFT));
            dataPanel.add(new JLabel("Email: " + emailField.getText(), SwingConstants.LEFT));
            dataPanel.add(new JLabel("No. Telepon: " + phoneField.getText(), SwingConstants.LEFT));

            dataFrame.add(dataPanel, BorderLayout.CENTER);
            dataFrame.setVisible(true);
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
