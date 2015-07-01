/**
 * Created by PRINCE SINGH on 30-06-2015.
 */
public class Puzzle {
    Array arrobj=new Array();
    public void drawBoard() {
        Array arrobj=new Array();
         int b = 1;
        int i;
        int j;
            int k = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j <= 9; j++) {
                if (j % 2 == 0)
                    System.out.printf(" ");
                else if (j == 1 || j == 5 || j == 9) {
                    System.out.print(arrobj.array[i][k]);
                    k++;
                } else
                    System.out.printf("|");

            }
            System.out.printf("\n");
            System.out.println("-----------");
            System.out.printf("\n");
            k = 0;
        }

    }

    public void insert(int o,int p) {
        switch (o) {
           case 1:
               if(p == 1) {
                   arrobj.array[0][0] = 'X';
                   this.drawBoard();
                   this.finalGame();
               }
               else {
                   arrobj.array[0][0] = 'O';
                   this.drawBoard();
                   this.finalGame();
               }
                break;
            case 2:
            if(p==1)
            {   arrobj.array[0][1]='X';
                this.drawBoard();
                this.finalGame();}
                else
            { arrobj.array[0][1]='O';
                this.drawBoard();
                this.finalGame();}
                break;
            case 3:
            if(p==1)
            { arrobj.array[0][2]='X';
                this.drawBoard();
                this.finalGame();}
                else
            { arrobj.array[0][2]='O';
                this.drawBoard();
                this.finalGame();}
                break;
            case 4:
            if(p==1)
            { arrobj.array[1][0]='X';
                this.drawBoard();
                this.finalGame();}
            else

            { arrobj.array[1][0]='O';
                this.drawBoard();
                this.finalGame();}
                break;
            case 5:
            if(p==1)
            { arrobj.array[1][1]='X';
                this.drawBoard();
                this.finalGame();}
                else
            {arrobj.array[1][1]='O';
                this.drawBoard();
                this.finalGame();}
                break;
            case 6:
            if(p==1)
            { arrobj.array[1][2]='X';
                this.drawBoard();
                this.finalGame();}
            else
            { arrobj.array[1][2]='O';
                this.drawBoard();
                this.finalGame();}
                break;
            case 7:
            if(p==1)
            {  arrobj.array[2][0]='X';
                this.drawBoard();
                this.finalGame();}
            else
            {  arrobj.array[2][0]='O';
                this.drawBoard();
                this.finalGame();}
                break;
            case 8:
            if(p==1)
            {  arrobj.array[2][1]='X';
                this.drawBoard();
                this.finalGame();}
            else
            { arrobj.array[2][1]='O';
                this.drawBoard();
                this.finalGame();}
                break;
            case 9:
           if(p==1)
           { arrobj.array[2][2]='X';
                this.drawBoard();
               this.finalGame();}
                else
           { arrobj.array[2][2]='O';
                this.drawBoard();
               this.finalGame();}
                break;

            default:
                System.out.println("GAME IS ENDED BECAUSE OF WRONG CHOICE,PLAY NEXT GAME");
                System.exit(0);
        }
    }
    public boolean finalGame(){
if(arrobj.array[0][0]==arrobj.array[0][1]&&arrobj.array[0][1]==arrobj.array[0][2])
{System.out.println("YOU WON THE GAME");
    System.exit(0);
    return true;}

        else if(arrobj.array[1][0]==arrobj.array[1][1]&&arrobj.array[1][1]==arrobj.array[1][2])
{System.out.println("YOU WON THE GAME");
    System.exit(0);
        return true;}
        else if(arrobj.array[2][0]==arrobj.array[2][1]&&arrobj.array[2][1]==arrobj.array[2][2])
        {System.out.println("YOU WON THE GAME");
            System.exit(0);
        return true;}
        else if(arrobj.array[0][0]==arrobj.array[1][0]&&arrobj.array[1][0]==arrobj.array[2][0])
        {  System.out.println("YOU WON THE GAME");
            System.exit(0);
        return true;}
        else if(arrobj.array[0][1]==arrobj.array[1][1]&&arrobj.array[1][1]==arrobj.array[2][1])
        {System.out.println("YOU WON THE GAME");
            System.exit(0);
        return true;}
        else if(arrobj.array[0][2]==arrobj.array[1][2]&&arrobj.array[1][2]==arrobj.array[2][2])
        {  System.out.println("YOU WON THE GAME");
            System.exit(0);
        return true;}
        else if(arrobj.array[0][0]==arrobj.array[1][1]&&arrobj.array[1][1]==arrobj.array[2][2])
        {  System.out.println("YOU WON THE GAME");
            System.exit(0);
        return true;}
        else if(arrobj.array[2][0]==arrobj.array[1][1]&&arrobj.array[1][1]==arrobj.array[0][2])
        {System.out.println("YOU WON THE GAME");
            System.exit(0);
        return true;}
        else
            return false;

    }
}