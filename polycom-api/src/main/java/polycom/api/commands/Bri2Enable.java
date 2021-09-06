package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the configuration of the specified ISDN BRI line. This command
 * is only applicable if you have a BRI network interface connected to your
 * system.
 * 
 * @author vpryimak
 *
 */
public class Bri2Enable {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the status of the BRI line—yes if enabled, no if disabled.
	 * 
	 * @return
	 */
	public static String get() {
		return "bri2enable get"+delimiter+"bri2enable get ";
	}

	/**
	 * Enables the BRI line.
	 * 
	 * @return
	 */
	public static String yes() {
		return "bri2enable yes"+delimiter+"bri2enable yes ";
	}

	/**
	 * Disables the BRI line.
	 * 
	 * @return
	 */
	public static String no() {
		return "bri2enable no"+delimiter+"bri2enable no ";
	}
}
