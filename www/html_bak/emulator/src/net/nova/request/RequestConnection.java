package net.nova.request;

import net.nova.communication.SocketHandlerCallback;
import net.nova.communication.SocketSession;

public class RequestConnection implements SocketHandlerCallback {
	@Override
	public void setSession(SocketSession session, String packet) {
		session.getServerMessage().send("DUIH");
	}
}
