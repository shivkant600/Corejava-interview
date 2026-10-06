package com.rays.networking.TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(1234);
		
		System.out.println("serer wait for client.....");
		
		Socket client = server.accept();
		System.out.println("client connected");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		
		// orr send kar tai bytes
		out.writeBytes("Hello Client\n");
		
		
		// data receive hota hai string mai
		String s = in.readLine();
		
		System.out.println(s);
		
		client.close();
		server.close();
		
		
	}
}