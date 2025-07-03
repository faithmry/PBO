import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ImageViewer extends JFrame implements ActionListener {
    private JLabel imageLabel;
    private JButton openButton;

    public ImageViewer() {
        setTitle("Image Viewer");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        openButton = new JButton("Open Image");
        openButton.addActionListener(this);

        add(openButton, BorderLayout.NORTH);
        add(new JScrollPane(imageLabel), BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int option = fileChooser.showOpenDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());

            Image image = imageIcon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(),
                    Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(image));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageViewer viewer = new ImageViewer();
            viewer.setVisible(true);
        });
    }
}
