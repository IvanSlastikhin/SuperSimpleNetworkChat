package ru.jhonsy.network;

import java.io.*;
import java.net.Socket;

/**
 * @Author - Ivan Slastikhin
 */
public class TCPConnection {

    private final Socket socket;
    private final Thread rxThread;
    private final BufferedReader in;
    private final BufferedWriter out;
    private final TCPConnectionListener eventListener;


}
