package mazeproj;

import java.awt.*;
import javax.swing.*;
public class Maze extends JFrame {

    static int maze[][] =
            {
                    {1,1,1,1,1,1,1,1,1,1,1,1,1},
                    {1,2,1,0,1,0,1,0,0,0,0,0,1},
                    {1,0,1,0,0,0,1,0,1,1,1,0,1},
                    {1,0,0,0,1,1,1,0,0,0,0,0,1},
                    {1,0,1,0,0,0,0,0,1,1,1,0,1},
                    {1,0,1,0,1,1,1,0,1,0,0,0,1},
                    {1,0,1,0,1,0,0,0,1,1,1,0,1},
                    {1,0,1,0,1,1,1,0,1,0,1,0,1},
                    {1,0,0,0,0,0,0,0,0,0,1,3,1},
                    {1,1,1,1,1,1,1,1,1,1,1,1,1}
                    //1 represents blocked wall
                    //0 = open position to move
                    //2 = start position
                    //3 = winning pos
            };
    /*static int maze2[][] =
            {
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                    {1, 2, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1},
                    {1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1},
                    {1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1},
                    {1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1},
                    {1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1},
                    {1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1},
                    {1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 1},
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
            };*/
    Maze() // constructor
    {
      setTitle("Maze Project");
      setSize(1280,800);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);

        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[1].length; col++) {
                Color color;
                switch (maze[row][col]) {
                    case 1:
                        color = Color.BLACK;
                        break;
                    case 2:
                        color = Color.GRAY;
                        break;
                    case 3:
                        color = Color.RED;
                        break;
                    default:
                        color = Color.WHITE;
                }
                g.setColor(color);
                g.fillRect(80 * col, 80 * row, 80,80);
                g.setColor(Color.BLACK);
                g.drawRect(80 * col, 80 * row, 80,80);
            }
        }
    }// end of paint method

    public static void main(String[] args) {
        Maze m = new Maze();
        m.setVisible(true);

    }


}
