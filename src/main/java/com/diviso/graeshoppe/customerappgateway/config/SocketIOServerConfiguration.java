package com.diviso.graeshoppe.customerappgateway.config;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.corundumstudio.socketio.SocketIOServer;

@Configuration
public class SocketIOServerConfiguration {

	@Value("${socket.server.host}")
	private String host;
	
	@Value("${socket.server.port}")
	private Integer port;
	
	@Bean
	public SocketIOServer getSocketIoServer() {
		System.out.println("Host is "+host+" port is "+port);
		com.corundumstudio.socketio.Configuration configuration = new com.corundumstudio.socketio.Configuration();
		configuration.setHostname(host);
		configuration.setPort(port);
		configuration.setKeyStorePassword("password");
        InputStream stream = SocketIOServerConfiguration.class.getResourceAsStream("/config/tls/ci2.pkcs12");
        configuration.setKeyStore(stream);
		SocketIOServer ioServer = new SocketIOServer(configuration);
		ioServer.start();
		return ioServer;
	}

}
