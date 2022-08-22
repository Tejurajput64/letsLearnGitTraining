import java.net.*;
import java.io.*;
class GoogleIP
{
	public static void main(String[]args)
	{
		try
		{
		InetAddress ip= InetAddress.getByName("www.Google.com");
		System.out.println("modify here=" +ip.getHostName());
		System.out.println("ip=" +ip.getHostAddress());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}