package i5.las2peer.p2p;

import i5.las2peer.security.AgentException;


/**
 * exception thrown on (an attempted) access to an agent, which is not known
 * (to this node or in general)
 * 
 * @author Holger Janssen
 * @version $Revision: 1.5 $, $Date: 2013/04/10 10:09:54 $
 *
 */
public class AgentNotKnownException extends AgentException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8178631098990929221L;

	public AgentNotKnownException ( long id ) {
		super ( "No agent known with id " + id );
	}
	
	public AgentNotKnownException ( long id, Throwable cause ) {
		super ( "No agent known with id " + id, cause );
	}
	
	public AgentNotKnownException ( String message ) {
		super ( message );
	}
	
	public AgentNotKnownException ( String message, Throwable cause ) {
		super (message, cause );
	}
}
