/**
 * Created by PRINCE SINGH on 01-07-2015.
 */
public class Array {
   public static Object[][] array = new Object[3][3];
  public void  printArray() {

      int b = 1;
        int i;
        int j;
        for (i = 0; i<3; i++) {
            for (j = 0; j < 3; j++) {
                this.array[i][j] = b;
                b++;
            }
        }
    }
}
