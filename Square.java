public class Square
{
   public static final SQUARE_SIZE =50;
   public static final UP=0;
   public static final RIGHT=1;
   public static final DOWN=2;
   public static final LEFT=3;
   private boolean[] hitWall = new boolean[4];
   private boolean seen = false;
   private boolean inView = false;
   private int row;
   private int col;
   Treasure treasure;

   public Square(boolean up, boolean right, boolean down, boolean left, int row, int col)
   {
      hitWall[0]=up;
      hitWall[1]=right;
      hitWall[2]=down;
      hitWall[3]=left;
      this.row = row;
      this.col = col;
   }
   
   public boolean wall(int direction)
   {
      return hitWall[direction];
   }

   public boolean seen()
   {
      
   }
}
