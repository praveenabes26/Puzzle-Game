/**
 * Created by PRINCE SINGH on 30-06-2015.
 */import java.util.Scanner;
public class Main {
       public static void main(String[] args) {
            Puzzle a=new Puzzle();
           Array obj1=new Array();
           Scanner obj=new Scanner(System.in);
           int s;
           obj1.printArray();
             a.drawBoard();
           while(!a.finalGame())
            {
                System.out.println("enter the no. by player 1");
                s = obj.nextInt();
                a.insert(s,1);
                System.out.println("enter the no.by player 2");
                s=obj.nextInt();
                a.insert(s,2);

            }
    }
}
