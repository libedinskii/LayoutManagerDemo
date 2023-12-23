import javax.swing.*;
import java.awt.*;

public class LayoutManagerDemo {
    public static void main(String[] args) {
        // Создаем главное окно
        JFrame frame = new JFrame("LayoutManager Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Создаем панель с менеджером компоновки FlowLayout
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.setBackground(Color.YELLOW);

        // Добавляем кнопки на панель с FlowLayout
        flowPanel.add(new JButton("Button 1"));
        flowPanel.add(new JButton("Button 2"));
        flowPanel.add(new JButton("Button 3"));

        // Создаем панель с менеджером компоновки BorderLayout
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.setBackground(Color.GREEN);

        // Добавляем метку на панель с BorderLayout
        JLabel label = new JLabel("Label");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        borderPanel.add(label, BorderLayout.NORTH);

        // Добавляем панели на главное окно
        frame.add(flowPanel, BorderLayout.CENTER);
        frame.add(borderPanel, BorderLayout.SOUTH);

        // Отображаем главное окно
        frame.setVisible(true);
    }
}
