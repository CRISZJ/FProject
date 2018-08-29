package cn.deltalpha.mall_game.mall_websocket.component;

import java.net.InetSocketAddress;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.springframework.stereotype.Component;

@Component
public class MallServer extends WebSocketServer {
	static InetSocketAddress ipAddr = new InetSocketAddress(8090);
	public MallServer() {
		super(ipAddr);
	}

	@Override
	public void onOpen(WebSocket conn, ClientHandshake handshake) {
		System.out.println("有人连上了");
		
	}

	@Override
	public void onClose(WebSocket conn, int code, String reason, boolean remote) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMessage(WebSocket conn, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onError(WebSocket conn, Exception ex) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new MallServer().start();
	}
	
}
