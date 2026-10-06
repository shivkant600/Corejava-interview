package com.rays.networking.TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception {

		Socket client = new Socket("localhost", 1234);

		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

		DataOutputStream out = new DataOutputStream(client.getOutputStream());

		out.writeBytes("Hello Server\n");

		String s = in.readLine();

		System.out.println(s);

		client.close();
	}
}