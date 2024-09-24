package chapter01;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class ChristmasTree extends JFrame {
    public ChristmasTree() {
        // 设置标题
        setTitle("Christmas Tree");
        // 设置窗口关闭时结束程序
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建画板
        JPanel panel = new JPanel(new BorderLayout());
        JPanel canvas = new JPanel(new GridLayout(4, 3));
        // 循环创建12行
        for (int i = 0; i < 12; i++) {
            // 创建每行的面板
            JPanel row = new JPanel(new GridLayout(1, 3));
            // 循环创建每行的3个单元格
            for (int j = 0; j < 3; j++) {
                // 创建单元格面板
                JPanel cell = new JPanel(new FlowLayout());
                // 根据行数设置单元格背景色
                if (i == 0 || i == 1 || i == 2 || i == 10 || i == 11) {
                    cell.setBackground(Color.RED);
                } else if (i == 3 || i == 4 || i == 9) {
                    cell.setBackground(Color.GREEN);
                } else if (i == 5 || i == 6 || i == 8) {
                    cell.setBackground(Color.BLUE);
                } else {
                    cell.setBackground(Color.YELLOW);
                }
                // 将单元格添加到行面板中
                row.add(cell);
            }
            // 将行面板添加到画布面板中
            canvas.add(row);
        }
        // 将画布面板添加到画板面板中
        panel.add(canvas, BorderLayout.CENTER);

        // 将画板面板添加到窗口中
        add(panel); // 这里是修复点，原代码遗漏了将panel添加到窗口中的操作

        // 设置窗口大小和显示位置
        // 设置窗口大小
        setSize(400, 400);
        // 设置窗口显示位置居中
        setLocationRelativeTo(null);

        // 显示窗口
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChristmasTree();
    }
}

