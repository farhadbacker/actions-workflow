
package com.example;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class App {

    public static String getMessage() {
        return "Hello! Maven CI/CD Pipeline is Working!";
    }

    public static void main(String[] args) throws IOException {

        int port = 8080;

        HttpServer server = HttpServer.create(
            new InetSocketAddress(port), 0
        );

        server.createContext("/", exchange -> {
            String response = getMessage();

            exchange.sendResponseHeaders(
                200, response.getBytes().length
            );

            exchange.getResponseBody().write(
                response.getBytes()
            );

            exchange.close();
        });

        server.start();

        System.out.println(
            "Application running on port " + port
        );
    }
}
