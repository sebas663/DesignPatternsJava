package example.chat;

import java.util.Date;

public class ChatRoomMediator {
	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	}
}
