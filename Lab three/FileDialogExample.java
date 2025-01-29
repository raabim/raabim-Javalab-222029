
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialogExample extends Frame implements ActionListener {
    private Button openButton, saveButton;

    public FileDialogExample() {
        // Set up the frame
        setTitle("File Dialog Example");
        setSize(300, 200);
        setLayout(null);

        
        openButton = new Button("Open File");
        openButton.setBounds(50, 50, 80, 30);
        openButton.addActionListener(this);
        add(openButton);

        // Create and add the "Save" button
        saveButton = new Button("Save File");
        saveButton.setBounds(150, 50, 80, 30);
        saveButton.addActionListener(this);
        add(saveButton);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == openButton) {
            
            FileDialog fileDialog = new FileDialog(this, "Open File", FileDialog.LOAD);
            fileDialog.setVisible(true);
            System.out.println("File chosen: " + fileDialog.getFile());
        } else if (e.getSource() == saveButton) {
            
            FileDialog fileDialog = new FileDialog(this, "Save File", FileDialog.SAVE);
            fileDialog.setVisible(true);
            System.out.println("File chosen: " + fileDialog.getFile());
        }
    }

    public static void main(String[] args) {
        // Create and display the frame
        FileDialogExample example = new FileDialogExample();
        example.setVisible(true);
    }
}

