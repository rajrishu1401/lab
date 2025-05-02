import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class StopWatch extends JFrame {
    private int elapsedSeconds = 0;
    private boolean isRunning = false;
    private Timer timer;
    private JLabel timeLabel;

    StopWatch() {
        this.setTitle("Stopwatch");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        timeLabel = new JLabel("0", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        this.add(timeLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");

        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);
        this.add(buttonPanel, BorderLayout.SOUTH);

        timer = new Timer(1000, (ActionEvent e) -> {
            elapsedSeconds++;
            timeLabel.setText(Integer.toString(elapsedSeconds));
        });

        startButton.addActionListener((ActionEvent e) -> {
            if (!isRunning) {
                timer.start();
                isRunning = true;
            }
        });

        stopButton.addActionListener((ActionEvent e) -> {
            timer.stop();
            isRunning = false;
        });

        resetButton.addActionListener((ActionEvent e) -> {
            timer.stop();
            elapsedSeconds = 0;
            timeLabel.setText("0");
            isRunning = false;
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StopWatch().setVisible(true));
    }
}
