package i5.las2peer.p2p;

/**
 * exception thrown on access to artifacts which cannot be found in the net
 * 
 * @author Holger Janssen
 * @version $Revision: 1.2 $, $Date: 2012/12/11 12:33:32 $
 *
 */
public class ArtifactNotFoundException extends Exception {
	
	/**
	 * serialization id 
	 */
	private static final long serialVersionUID = 1965222546030413764L;

	public ArtifactNotFoundException ( String message ) {
		super ( message );
	}
	
	public ArtifactNotFoundException ( long id ) {
		this ( "artifact with id " + id + " could not be found!");
	}
	
}
