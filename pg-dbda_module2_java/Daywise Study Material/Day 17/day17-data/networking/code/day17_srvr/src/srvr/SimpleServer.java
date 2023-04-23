package srvr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleServer {
	public static final int SERVER_PORT;
	static {
		SERVER_PORT = 4500;
	}

	public static void main(String[] args) {
		System.out.println("Waiting for clnt conn");
		try (Scanner sc = new Scanner(System.in);
				// Create server side socket , bound to local(server side) port
				ServerSocket ss = new ServerSocket(SERVER_PORT);
				// accept the connection from rem clnt
				Socket ds = ss.accept();
				//recv req
				//Java App <---- DIS <--- SIS <---Data Socket
				DataInputStream in=new DataInputStream(ds.getInputStream());
				//send resp: Java App --->DOS --> SOS(sock.getOs()) --data socket
				DataOutputStream out=new DataOutputStream(ds.getOutputStream());		

		) {
			System.out.println("Connection established from rem clnt IP " + ds.getInetAddress().getHostName()
					+ " rem clnt port " + ds.getPort());
			System.out.println("server : attached data strms");
			//read request
			System.out.println("Clnt sent req "+in.readUTF());
			System.out.println("Enter the messge to send to clnt");
			out.writeUTF(sc.nextLine());
			System.out.println("server sent the resp n shutting down....");
			
		} //ds.close,ss.close,sc.close
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
