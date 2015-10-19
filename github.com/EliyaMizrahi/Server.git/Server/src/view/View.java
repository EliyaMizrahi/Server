package view;

/**
 * The View is an Interface class that has following methods.
 * 
 * @author Eliya Mizrahi & Mor Mordoch  
 * @version 1.0
 * @since 17-10-2015
 */
public interface View {

	public void start();
	public void close();
	public void sendMessage(String message);
	
}
