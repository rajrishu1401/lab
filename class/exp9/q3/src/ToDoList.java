import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ToDoList extends JFrame {
    DefaultListModel<String> listModel;

    ToDoList() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("To Do List");
        this.setSize(320, 420);
        this.setResizable(true);
        this.setLocationRelativeTo(null);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 30));

        JButton addButton = new JButton("Add");
        addButton.setPreferredSize(new Dimension(80, 30));

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        topPanel.add(textField);
        topPanel.add(addButton);

        listModel = new DefaultListModel<>();
        JList<String> jList = new JList<>(listModel);
        jList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane listScrollPane = new JScrollPane(jList);

        JButton removeButton = new JButton("Remove Selected");
        removeButton.setPreferredSize(new Dimension(300, 30));
        removeButton.addActionListener((ActionEvent e) -> {
            int[] selectedIndices = jList.getSelectedIndices();
            for (int i = selectedIndices.length - 1; i >= 0; i--) {
                listModel.removeElementAt(selectedIndices[i]);
            }
        });

        addButton.addActionListener((ActionEvent e) -> {
            String item = textField.getText().trim();
            if (!item.isEmpty()) {
                listModel.addElement(item);
                textField.setText("");
            }
        });

        this.setLayout(new BorderLayout());
        this.add(topPanel, BorderLayout.NORTH);
        this.add(listScrollPane, BorderLayout.CENTER);
        this.add(removeButton, BorderLayout.SOUTH);
    }

    public static void main(String[] arg) {
        SwingUtilities.invokeLater(() -> new ToDoList().setVisible(true));
    }
}
