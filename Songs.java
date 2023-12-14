/*
 * Create a class "Song" with instance variables (title, artist, and duration)
and override the toString method. The toString method should return a
string representation of the song's information. Write a java program to
print the information
 */
import java.util.Scanner;
public class Songs {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Title :");
        String title = sc.next();
        System.out.print("Enter the Artist :");
        String artist = sc.next();
        System.out.print("Enter the Duaration (in minutes):");
        int sec = sc.nextInt();
       

        Song so = new Song(title ,artist,sec);
        System.out.println(so.toString());
        //so.toString();

    }
    
}

class Song{

    private String title;
    private String artist;
    private int sec ; 


    public Song(String title , String artist , int sec)
    {
            this.title = title ;
            this.artist = artist;
            this.sec =sec;
    }
    public String getTitle()
    {
        return this.title;
    }
    public String getArtist()
    {
        return this.artist;
    }
    public int getMin()
    {
        return this.sec;
    }
    public String toString()
    {
        return "Song Title : "+title +"\n"+ "Song Artist: " +artist+"\n"+ "Song Duration:" +sec +"in Min" ;
    }
}
