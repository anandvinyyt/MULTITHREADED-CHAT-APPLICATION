package com.chatapp;

import java.io.*;
import java.net.*;

public class Client {
	Socket socket;

	BufferedReader bufferedReader;
	PrintWriter printWriter;

	// Constructor
	public Client() {
		try {
			System.out.println("Sending request to Server....");
			socket = new Socket("127.0.0.1", 8080);
			System.out.println("Connection done.");

			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			printWriter = new PrintWriter(socket.getOutputStream());

			startReading();
			startWriting();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void startReading() {
		// The thread will keep reading and providing data
		Runnable runnable1 = () -> {
			System.out.println("Reader Started....");
			try {

				while (true) {
					String msg = bufferedReader.readLine();
					if (msg.equals("Exit")) {
						System.out.println("Server terminated the chat.");
						socket.close();
						break;
					}
					System.out.println(" Server : " + msg);
				}

			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("Connection closed!!");
			}

		};
		new Thread(runnable1).start();
	}

	public void startWriting() {
		// The thread will take data from the user and then send it to the client
		Runnable runnable2 = () -> {
			System.out.println("Writer Started....");
			try {

				while (!socket.isClosed()) {
					BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
					String content = bufferedReader1.readLine();
					printWriter.println(content);
					printWriter.flush();

					if (content.equals("Exit")) {
						socket.close();
						break;
					}
				}
				System.out.println("Connection is closed");

			} catch (Exception e) {
				e.printStackTrace();
			}

		};
		new Thread(runnable2).start();
	}

	public static void main(String[] args) {
		System.out.println("This is Client.....");
		new Client();
	}
}
