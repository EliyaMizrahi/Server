package view;

import controller.Controller;

/**
 * The MyServerView program implements an application that realize the methods from
 * AbstractViewObservableServer.
 * 
 * @author Eliya Mizrahi & Mor Mordoch  
 * @version 1.0
 * @since 17-10-2015
 *
 */

public class MyServerView extends AbstractViewObservableServer {

	/**
	 * Constructor
	 * @param controller
	 */
	public MyServerView(Controller controller) {
		super(controller);

	}

	/**
	 * This method is use to begin the project.
	 */
	@Override
	public void start() {
		controller.start();
	}


	/**
	 * This method is use to display string massage. 
	 * @param massage
	 */
	@Override
	public void sendMessage(String message) {
		if (message != null) {
			System.out.println(message);
		} else {
			System.out.println("error");
		}
	}

	/**
	 * This method is use to close the project.
	 */
	@Override
	public void close() {
		controller.close();
	}

}
