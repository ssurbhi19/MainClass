import java.net.*;
import java.io.*;

public class Main
{
    public static  void main(String args[])
    {
        String line;
        try
        {
            URL url = new URL( "http://localhost:8080/Student-Servlet/stu?check=rn1" );
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            line = in.readLine();

            System.out.println( line );

            in.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

