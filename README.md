#CLiC Archetype
##About
CLiC (Command Line Client) is an Eclipse framework allowing to deal with command line interpretation and execution. It aims at providing an extensible way of defining commands, and provides various tools in order to parse those commands and execute them.

This Maven archetype allows to create a CLiC plugin project structure containing an example in order to start easily your contribution.
##License
CLiC is released under [LGPL 2.1](http://www.gnu.org/licenses/lgpl-2.1.txt).
##Usage
First of all, you'll need to install this archetype in your local Maven repository thanks to `mvn clean install`

Then, simply use the archetype reference in order to generate the project's skeleton thanks to `mvn archetype:generate`
##Info
Warning: do not use `-SNAPSHOT` in the version you specify, it'll be automatically added in the right place. As this project uses Tycho, a special way of dealing with versions needs to be used.
