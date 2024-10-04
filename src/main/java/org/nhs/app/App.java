public class App
{
   public static void main(String[] args)
   {
      /*for (int i = 1; i <= 5; i++)
      {
        for (int j = 1; j <= 4; j++)
        {
            System.out.print(i);
        }
        System.out.println();
      }*/

      //Practice 1
      for (int i = 1; i <= 5; i++)
      {
        for (int j = 1; j <= i; j++)
        {
            System.out.print(i);
        }
        System.out.println();
      }

      //Practice 2 
      for (int i = 1; i <= 5; i++)
      {
        for (int j = 1; j <= 5-i; j++)
        {
            System.out.print(".");
        }
        for (int j = 1; j <= i; j++)
        {
            System.out.print(i);
        }
        System.out.println();
      }

     //Practice 3
      for (int i = 1; i <= 5; i++)
      {
        for (int j = 1; j <= 5-i; j++)
        {
            System.out.print(".");
        }
        System.out.print(i);
        for (int j = 1; j <= i-1; j++)
        {
            System.out.print(".");
        }
        System.out.println();
      }

      //Challenge
        for (int i = 0; i<= 9; i++)
        { 
            for (int j = 1; j <= i; j++)
            {
                for (int k = 0; k <= i; k++)
                {
                    
                }
                System.out.print(""+i+i);
            }
            System.out.println();
        }
   }
}