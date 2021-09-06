package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the IP Precedence priority level (Type of Service Value) for
 * audio, far-end camera control (FECC) and other call control channels, and
 * video. The value for each can be between 0 and 7.
 * 
 * @author vpryimak
 *
 */
public class IpPrecFecc {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ipprecfecc get" + delimiter + "ipprecfecc get ";
	}

	/**
	 * Sets the IP precedence. A priority level is required. This must be an
	 * integer in the range {0..7}.
	 * 
	 * @param priority
	 * @return
	 */
	public static String set(int priority) {
		return "ipprecfecc set " + priority + delimiter + "ipprecfecc set " + priority + " ";
	}
}
