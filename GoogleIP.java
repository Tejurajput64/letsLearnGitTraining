import java.net.*;
import java.io.*;
class GoogleIP
{
	public static void main(String[]args)
	{
		try
		{
		InetAddress ip= InetAddress.getByName("www.Google.com");
		System.out.println("I m updating this file in qa1");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}