package GamePackage;
import java.io.FileWriter;
import javax.swing.JFrame;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int myScore = 0;
        try {
            FileWriter myFile = new FileWriter("MyScores.txt");


            Scanner input = new Scanner(System.in);
            System.out.println("Write your name. After writing your name game will appear.\n" +
                    "It is intended to write your score in file 'MySore.txt' ");
            String name = input.nextLine();
            myFile.write(name);


            if (name != null) {
                JFrame obj = new JFrame();

                Gameplay gamePlay = new Gameplay();

                obj.setBounds(10, 10, 700, 600);
                obj.setTitle("Breakout Ball");
                obj.setResizable(false);
                obj.setVisible(true);
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                obj.add(gamePlay);
                

            }
            myFile.write(" score is "+ myScore );
            myFile.close();

        }
        catch(Exception e)
        {
            System.out.println("There is a problem");
        }

    }
}
