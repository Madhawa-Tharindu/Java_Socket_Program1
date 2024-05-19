package Client_Server;
import java.io.IOException;
// import java.net.*;  //to import everything related to socket
import java.net.ServerSocket;
import java.net.Socket;


// Server class
public class Server {

	public static void main(String[] args) {
		 
		 try {
			 System.out.println("Waiting For clients requests");
			 //Creating Server socket object using ServerSocket class
			ServerSocket ss = new ServerSocket(9806);
			
			//Now we should implement the blocking call. because server should wait until the find client request.
			//for waiting purpose we implement the blocking call
			Socket soc = ss.accept();
			System.out.println("Connection is established!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
