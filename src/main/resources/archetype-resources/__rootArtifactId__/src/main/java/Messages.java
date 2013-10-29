/*
 * CLiC, Framework for Command Line Interpretation in Eclipse
 *
 *     Copyright (C) 2013 Worldline or third-party contributors as
 *     indicated by the @author tags or express copyright attribution
 *     statements applied by the authors.
 *
 *     This library is free software; you can redistribute it and/or
 *     modify it under the terms of the GNU Lesser General Public
 *     License as published by the Free Software Foundation; either
 *     version 2.1 of the License.
 *
 *     This library is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *     Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public
 *     License along with this library; if not, write to the Free Software
 *     Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */
#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.${rootArtifactId};

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * Allows to store i18n messages
 * 
 * @author aneveux
 * @version 1.0
 * @since 1.0
 */
public enum Messages {

	// Messages

	HELLO

	;

	/**
	 * ResourceBundle instance
	 */
	private static ResourceBundle resourceBundle = ResourceBundle
			.getBundle("Messages");

	/**
	 * Returns value of the message
	 */
	public String value() {
		if (Messages.resourceBundle == null
				|| !Messages.resourceBundle.containsKey(name()))
			return "!!" + name() + "!!";
		return Messages.resourceBundle.getString(name());
	}

	/**
	 * Returns value of the formatted message
	 */
	public String value(final Object... args) {
		if (Messages.resourceBundle == null
				|| !Messages.resourceBundle.containsKey(name()))
			return "!!" + name() + "!!";
		return MessageFormat.format(
				Messages.resourceBundle.getString(name()), args);
	}

}