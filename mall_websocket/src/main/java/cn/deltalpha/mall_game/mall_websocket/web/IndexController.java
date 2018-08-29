package cn.deltalpha.mall_game.mall_websocket.web;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import cn.deltalpha.mall_game.mall_websocket.component.WebSocketComponent;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.Session;

@Controller
public class IndexController {


	@Autowired
	WebSocketComponent webSocketComponent;

	@GetMapping("game1")
	public String game1(Map<String, String> map) throws Exception {
		//webSocketComponent.sendMessage("he","1");
		return "game1";
	}

	@GetMapping("game2")
	public String game2(Map<String, String> map) throws Exception {
		return "game2";
	}

	@GetMapping("game3")
	public String game3(Map<String, String> map) throws Exception {
		return "game3";
	}

	@GetMapping("/gaming/{gameId}")
	public String gaming(Map<String, String> map, @PathVariable(value = "gameId") String gameId) throws Exception {
		//TODO 给游戏端推送消息，开始游戏,设备号4代表手机端，5代表游戏端
		String num=gameId;
		//System.out.println(gameId);
		webSocketComponent.sendMessage(num,"5");
		try {
			//System.out.println("发送消息成功");
			return "gaming";
		} catch (Exception e) {
			System.out.println(gameId);
				map.put("number",gameId);
				return "error";
		}
	}

	@GetMapping("score")
	public String score(Map<String,String> map) throws Exception {
		String skr;
		skr = "0";
		map.put("test",skr);
		//Draft_17 = Sec-WebSocket-Version: 13 (aka RFC-6455)
		return "score";
	}
}
