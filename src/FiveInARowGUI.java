import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FiveInARowGUI extends JFrame implements MouseListener {
    private static final int BOARD_SIZE = 15;
    private static final int CELL_SIZE = 40;
    private static final int PADDING = 20;
    private static final int WINDOW_WIDTH = (CELL_SIZE * BOARD_SIZE) + (2 * PADDING);
    private static final int WINDOW_HEIGHT = (CELL_SIZE * BOARD_SIZE) + (2 * PADDING);
    private char[][] board;
    private Graphics2D g2d;
    private boolean isBlackTurn = true;
    public FiveInARowGUI() {
        super("五子棋游戏");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        board = new char[BOARD_SIZE][BOARD_SIZE];
        initializeBoard();
        addMouseListener(this);
    }

    private void initializeBoard() {
        // 遍历棋盘的每一行
        for (int i = 0; i < BOARD_SIZE; i++) {
            // 遍历当前行的每一个位置
            for (int j = 0; j < BOARD_SIZE; j++) {
                // 将当前位置设置为空白状态
                board[i][j] = ' ';
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // 调用父类的paint方法进行基本的绘制操作
        g2d = (Graphics2D) g; // 将Graphics对象转换为Graphics2D对象，以便使用更高级的绘图功能
        drawBoard(); // 绘制棋盘
        drawPieces(); // 绘制棋子
    }

    private void drawBoard() {
        // 设置棋盘线条的颜色为黑色
        g2d.setColor(Color.BLACK);
        // 遍历棋盘大小，绘制每个格子的线条
        for (int i = 0; i <= BOARD_SIZE; i++) {
            // 绘制水平线条，形成棋盘的横线
            g2d.drawLine(PADDING, PADDING + i * CELL_SIZE, PADDING + BOARD_SIZE * CELL_SIZE, PADDING + i * CELL_SIZE);
            // 绘制垂直线条，形成棋盘的竖线
            g2d.drawLine(PADDING + i * CELL_SIZE, PADDING, PADDING + i * CELL_SIZE, PADDING + BOARD_SIZE * CELL_SIZE);
        }
    }

    private void drawPieces() {
        // 设置绘图颜色为黑色，用于绘制黑子或白子的边框
        g2d.setColor(Color.BLACK);
        // 遍历棋盘的每一行和每一列
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                // 判断当前位置的棋子类型
                if (board[i][j] == 'B') {
                    // 绘制黑色棋子
                    g2d.fillOval(PADDING + j * CELL_SIZE, PADDING + i * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                } else if (board[i][j] == 'W') {
                    // 改变颜色为白色，用于绘制白子
                    g2d.setColor(Color.WHITE);
                    // 绘制白色棋子
                    g2d.fillOval(PADDING + j * CELL_SIZE, PADDING + i * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                    // 重置颜色为黑色，绘制白子的边框
                    g2d.setColor(Color.BLACK);
                    g2d.drawOval(PADDING + j * CELL_SIZE, PADDING + i * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // 获取鼠标点击位置相对于面板的横坐标
        int x = e.getX() - PADDING;
        // 获取鼠标点击位置相对于面板的纵坐标
        int y = e.getY() - PADDING;
        // 计算点击位置对应的棋盘列号
        int col = x / CELL_SIZE;
        // 计算点击位置对应的棋盘行号
        int row = y / CELL_SIZE;
        // 检查点击位置是否在棋盘范围内
        if (x < 0 || y < 0 || x >= BOARD_SIZE * CELL_SIZE || y >= BOARD_SIZE * CELL_SIZE) {
            return;
        }
        // 检查点击的棋盘位置是否为空
        if (board[row][col] != ' ') {
            return;
        }
        // 在棋盘的点击位置放置黑棋或白棋
        board[row][col] = isBlackTurn ? 'B' : 'W';
        // 重新绘制棋盘以显示新落子
        repaint();
        // 检查是否获胜
        if (checkWin(row, col, isBlackTurn ? 'B' : 'W')) {
            // 显示获胜提示信息
            JOptionPane.showMessageDialog(this, "玩家 " + (isBlackTurn ? "黑" : "白") + " 获胜！");
            // 终止程序运行
            System.exit(0);
        }
        // 切换到另一个玩家的回合
        isBlackTurn = !isBlackTurn;
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    private boolean checkWin(int row, int col, char player) {
        return checkHorizontal(row, col, player) ||
                checkVertical(row, col, player) ||
                checkDiagonalLeft(row, col, player) ||
                checkDiagonalRight(row, col, player);
    }

    private boolean checkHorizontal(int row, int col, char player) {
        int count = 1;
        int left = col - 1;
        int right = col + 1;

        while (left >= 0 && board[row][left] == player) {
            count++;
            left--;
        }

        while (right < BOARD_SIZE && board[row][right] == player) {
            count++;
            right++;
        }

        return count >= 5;
    }

    private boolean checkVertical(int row, int col, char player) {
        int count = 1;
        int up = row - 1;
        int down = row + 1;

        while (up >= 0 && board[up][col] == player) {
            count++;
            up--;
        }

        while (down < BOARD_SIZE && board[down][col] == player) {
            count++;
            down++;
        }

        return count >= 5;
    }

    private boolean checkDiagonalLeft(int row, int col, char player) {
        int count = 1;
        int leftUp = col - 1;
        int rightDown = col + 1;

        while (leftUp >= 0 && row > 0 && board[row - 1][leftUp] == player) {
            count++;
            leftUp--;
            row--;
        }

        while (rightDown < BOARD_SIZE && row < BOARD_SIZE - 1 && board[row + 1][rightDown] == player) {
            count++;
            rightDown++;
            row++;
        }

        return count >= 5;
    }
    private boolean checkDiagonalRight(int row, int col, char player) {
        int count = 1;
        int leftDown = col - 1;
        int rightUp = col + 1;
        while (leftDown >= 0 && row < BOARD_SIZE - 1 && board[row + 1][leftDown] == player) {
            count++;
            leftDown--;
            row++;
        }
        while (rightUp < BOARD_SIZE && row > 0 && board[row - 1][rightUp] == player) {
            count++;
            rightUp++;
            row--;
        }
        return count >= 5;
    }
    public static void main(String[] args) {
        new FiveInARowGUI();
    }
}
