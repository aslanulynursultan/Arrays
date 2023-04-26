import java.io.*;

/**
   This program creates a list of songs for a CD
   by reading from a file.
*/

public class CompactDisc
{
   public static void main(String[] args)throws IOException
   {
      FileReader file = new FileReader("Classics.txt");
      BufferedReader input = new BufferedReader(file);
      String title;
      String artist;

      Song [] cd = new Song [6];
      for (int i = 0; i < cd.length; i++)
      {
         title = input.readLine();
         artist = input.readLine();


         Song s= new Song(title,artist);
         cd[i] = s;
      }

      System.out.println("Contents of Classics:");
      for (int i = 0; i < cd.length; i++)
      {
         System.out.print(cd[i].toString());
      }

   }

}