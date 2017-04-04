import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Dice extends JComponent {

    public int die1 = 0;
    public int die2 = 0;
    public int total = 0;

    @Override
    public void paintComponent(Graphics g) {
        int w = this.getWidth();
        int h = this.getHeight();

        g.setColor(Color.green);
        g.fillRect(0, 0, w, h);

        g.setColor(Color.white);
        g.fillRoundRect(w/10, h/3, w/3, h/3, 15, 15);
        g.fillRoundRect(6 * w/10, h/3, w/3, h/3, 15, 15);

        g.setColor(Color.black);
        g.drawRoundRect(w/10, h/3, w/3, h/3, 15, 15);
        g.drawRoundRect(6 * w/10, h/3, w/3, h/3, 15, 15);

        switch (die1) {
            case (1):
                g.fillOval(w/10 + w/9, h/3 + h/9, w/9, h/9);
                break;
            case (2):
                g.fillOval(w/10 + 2 * w/9, h/3, w/9, h/9);
                g.fillOval(w/10, h/3 + 2 * h/9, w/9, h/9);
                break;
            case (3):
                g.fillOval(w/10 + w/9, h/3 + h/9, w/9, h/9);
                g.fillOval(w/10 + 2 * w/9, h/3, w/9, h/9);
                g.fillOval(w/10, h/3 + 2 * h/9, w/9, h/9);
                break;
            case (4):
                g.fillOval(w/10, h/3, w/9, h/9);
                g.fillOval(w/10 + 2 * w/9, h/3, w/9, h/9);
                g.fillOval(w/10, h/3 + 2 * h/9, w/9, h/9);
                g.fillOval(w/10 + 2 * w/9, h/3 + 2 * h/9, w/9, h/9);
                break;
            case (5):
                g.fillOval(w/10, h/3, w/9, h/9);
                g.fillOval(w/10 + 2 * w/9, h/3, w/9, h/9);
                g.fillOval(w/10, h/3 + 2 * h/9, w/9, h/9);
                g.fillOval(w/10 + 2 * w/9, h/3 + 2 * h/9, w/9, h/9);
                g.fillOval(w/10 + w/9, h/3 + h/9, w/9, h/9);
                break;
            case (6):
                g.fillOval(w/10, h/3, w/9, h/9);
                g.fillOval(w/10 + 2 * w/9, h/3, w/9, h/9);
                g.fillOval(w/10, h/3 + 2 * h/9, w/9, h/9);
                g.fillOval(w/10 + 2 * w/9, h/3 + 2 * h/9, w/9, h/9);
                g.fillOval(w/10, h/3 + h/9, w/9, h/9);
                g.fillOval(w/10 + 2 * w/9, h/3 + h/9, w/9, h/9);
                break;
        }
        switch (die2) {
            case (1):
                g.fillOval(6 * w/10 + w/9, h/3 + h/9, w/9, h/9);
                break;
            case (2):
                g.fillOval(6 * w/10 + 2 * w/9, h/3, w/9, h/9);
                g.fillOval(6 * w/10, h/3 + 2 * h/9, w/9, h/9);
                break;
            case (3):
                g.fillOval(6 * w/10 + w/9, h/3 + h/9, w/9, h/9);
                g.fillOval(6 * w/10 + 2 * w/9, h/3, w/9, h/9);
                g.fillOval(6 * w/10, h/3 + 2 * h/9, w/9, h/9);
                break;
            case (4):
                g.fillOval(6 * w/10, h/3, w/9, h/9);
                g.fillOval(6 * w/10 + 2 * w/9, h/3, w/9, h/9);
                g.fillOval(6 * w/10, h/3 + 2 * h/9, w/9, h/9);
                g.fillOval(6 * w/10 + 2 * w/9, h/3 + 2 * h/9, w/9, h/9);
                break;
            case (5):
                g.fillOval(6 * w/10, h/3, w/9, h/9);
                g.fillOval(6 * w/10 + 2 * w/9, h/3, w/9, h/9);
                g.fillOval(6 * w/10, h/3 + 2 * h/9, w/9, h/9);
                g.fillOval(6 * w/10 + 2 * w/9, h/3 + 2 * h/9, w/9, h/9);
                g.fillOval(6 * w/10 + w/9, h/3 + h/9, w/9, h/9);
                break;
            case (6):
                g.fillOval(6 * w/10, h/3, w/9, h/9);
                g.fillOval(6 * w/10 + 2 * w/9, h/3, w/9, h/9);
                g.fillOval(6 * w/10, h/3 + 2 * h/9, w/9, h/9);
                g.fillOval(6 * w/10 + 2 * w/9, h/3 + 2 * h/9, w/9, h/9);
                g.fillOval(6 * w/10, h/3 + h/9, w/9, h/9);
                g.fillOval(6 * w/10 + 2 * w/9, h/3 + h/9, w/9, h/9);
                break;
        }
    }

    public int roll() {
        die1 = (int) (1 + Math.random() * 6);
        die2 = (int) (1 + Math.random() * 6);
        total = die1 + die2;
        return total;
    }
}