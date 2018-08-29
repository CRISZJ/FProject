package cn.deltalpha.mall_game.mall_websocket.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class WebSocketInit implements ApplicationRunner{
	@Autowired
	MallServer mallServer;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		mallServer.start();
	}

}
