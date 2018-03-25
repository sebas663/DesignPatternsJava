package example.chat2;

public interface ChatMediator {
	public void sendMessage(String msg, User user);

	void addUser(User user);
}
