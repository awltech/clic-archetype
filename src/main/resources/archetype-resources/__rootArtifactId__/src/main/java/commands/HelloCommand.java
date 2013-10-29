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
package ${groupId}.${rootArtifactId}.commands;

import ${groupId}.${rootArtifactId}.Messages;
import com.worldline.clic.commands.AbstractCommand;
import com.worldline.clic.commands.CommandContext;

/**
 * Just an example of a command...
 * 
 * @author aneveux
 * @version 1.0
 * @since 1.0
 */
public class HelloCommand extends AbstractCommand {

	/**
	 * Allows to configure the parser and specify all the options which are
	 * available for the command. It allows to perform validation of all the
	 * command line.
	 */
	@Override
	public void configureParser() {
		parser.accepts("name")
				.withRequiredArg()
				.ofType(String.class)
				.required();
	}

	/**
	 * Allows to deal with the command's execution...
	 */
	@Override
	public void execute(final CommandContext context) {
		context.write(Messages.HELLO.value(options.valueOf("name")));
	}

}
