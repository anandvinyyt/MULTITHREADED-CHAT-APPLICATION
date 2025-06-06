# MULTITHREADED-CHAT-APPLICATION

COMPANY : CODTECH IT SOLUTIONS

NAME : VINEET ANAND

INTERN ID : CT12WOJG

DOMAIN : JAVA PROGRAMMING

DURATIONS : 12 WEEKS

MENTOR : NEELA SANTOSH

💬 Multithreaded Chat Application in Java :

This project is a real-time client-server chat application built using Java Sockets and Multithreading. It enables multiple clients to connect and communicate simultaneously with a central server, simulating a basic group chat system.

🔧 Technologies Used :

-Core Java

-Java Sockets (java.net package)

-Multithreading (java.lang.Thread)

-I/O Streams (InputStream, OutputStream, BufferedReader, PrintWriter)

-Command-line Interface (CLI)

🎯 Objective :

The main goal is to demonstrate how Java socket programming and multithreading can be used to handle multiple concurrent client connections to a server, allowing all participants to send and receive messages in real time.

🧩 Features :

-Real-time text-based communication

-Multi-client support via threads

-Server broadcasts messages to all connected clients

-Graceful handling of client connections and disconnections

-Lightweight and easy to run on any system with Java installed

🛠️ How It Works :

1.Server Program :

-Listens for client connections on a specified port.

-For each client that connects, it spawns a new thread to manage communication with that client.

-Broadcasts incoming messages from one client to all other connected clients.

2.Client Program :

-Connects to the server using IP and port.

-Runs two threads:

        -One for sending messages to the server.

        -One for receiving messages from the server and displaying them.

✅ Deliverable :

-A fully functional Java console-based chat application that includes:

-A server program capable of handling multiple clients using threads.

-A client program that allows real-time communication with the server and other users.

This project is ideal for understanding socket communication, concurrency, and networked application design in Java.
