package clnt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter server IP n server port");
			// java.net.Socket(String serverIP,int remPort)
			try (Socket s1 = new Socket(sc.next(), sc.nextInt());
					//send request : Java App --->DOS --> SOS(sock.getOs()) --> socket
					DataOutputStream out=new DataOutputStream(s1.getOutputStream());
					//recv resp
					//Java App <---- DIS <--- SIS <---Socket
					DataInputStream in=new DataInputStream(s1.getInputStream())
							
					) {
				System.out.println(
						"connected to server IP " + s1.getInetAddress().getHostName() + " server port " + s1.getPort());
				System.out.println("Attached data strms..");
				System.out.println("Enter the message");
				sc.nextLine();//to read off earlier new line char
				String mesg=sc.nextLine();
				//send the mesg to server
				out.writeUTF(mesg);
				System.out.println("sent the req....");
				System.out.println("Server sent the resp "+in.readUTF());				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
