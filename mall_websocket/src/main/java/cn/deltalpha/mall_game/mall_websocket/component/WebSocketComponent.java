package cn.deltalpha.mall_game.mall_websocket.component;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;


@ServerEndpoint(value = "/websocket/{equipmentId}")
@Component
public class WebSocketComponent {

    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;
    
    //静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
    private static int onlineCount = 0;

    //concurrent包的线程安全Set，用来存放每个客户端对应的WebSocket对象。
    private static ConcurrentMap<String,WebSocketComponent> webSocketMap = new ConcurrentHashMap<String,WebSocketComponent>();
    
    /**
     * 发送文本消息
     * @param message
     * @throws Exception 
     */
     public void sendMessage(String message,String equipmentId) throws Exception {

     	WebSocketComponent webSocket = webSocketMap.get(equipmentId);
     	System.out.println(webSocket);
     	if(webSocket != null){
     	    System.out.println(webSocket);
     		webSocket.getSession().getBasicRemote().sendText(message);
     	}

     }
	
    /**
     * 连接建立成功调用的方法
     * @throws Exception */
    @OnOpen
    public void onOpen(Session session,@PathParam("equipmentId") String equipmentId) throws Exception {
        this.session = session;
        System.out.println("连上了"+equipmentId);
        webSocketMap.put(equipmentId, this);
    }
    
    /**
     * 连接关闭调用的方法
     * @throws Exception 
     */
    @OnClose
    public void onClose(@PathParam(value="equipmentId") String equipmentId) throws Exception {
        System.out.println("关闭了"+equipmentId);
    	webSocketMap.remove(equipmentId);
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息*/
    @OnMessage
    public void onMessage(String message, Session session) {
        //this.session=session;
        System.out.println("来自客户端的消息:" + message);
    }

    /**
     * 发生错误时调用
     * */
    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("发生错误");
        error.printStackTrace();
    }

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
    
    
}
