package org.example;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        var soc = new Socket("localhost", 1700);
        OutputStream output =soc.getOutputStream();
        output.write(234); // サーバ側のinput.readに対応。
        output.close();
        soc.close();
    }
}
