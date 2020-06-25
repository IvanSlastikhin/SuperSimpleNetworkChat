package ru.jhonsy.network;

import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * @Author: Ivan Slastikhin
 */
public class TCPConnection {

    private final Socket socket;
    private final Thread rxThread;
    private final BufferedReader in;
    private final BufferedWriter out;

    public TCPConnection(Socket socket) throws IOException {
        this.socket = socket;
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream(), Charset.forName("UTF-8")));
        this.out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), Charset.forName("UTF-8")));
        this.rxThread = new Thread(() -> {
            try {
                String msg = in.readLine();
            } catch (IOException e) {

            } finally {

            }
        });
    }
}
