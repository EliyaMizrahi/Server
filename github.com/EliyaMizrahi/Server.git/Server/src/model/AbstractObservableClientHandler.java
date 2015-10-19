package model;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Observable;
import controller.Controller;

/**
 * The AbstractObservableClientHandler program implements ClientHandler and inherits Observable.
 * AbstractObservableClientHandler consist controller.
 * @author Eliya Mizrahi & Mor Mordoch  
 * @version 1.0
 * @since 17-10-2015
 *
 */

public abstract class AbstractObservableClientHandler extends Observable implements ClientHandler {

	protected Controller controller;
	
	public abstract void handleClient(InputStream inFromClient, OutputStream outToClient);
	
	/**
	 * This method is used to set the controller
	 * @param controller
	 */
	@Override
	public void setController(Controller controller) {
		this.controller = controller;
	}

}
