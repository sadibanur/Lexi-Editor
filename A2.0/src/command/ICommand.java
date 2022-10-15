/*
 * Class Author: Sadiba Nusrat Nur
 */


package command;

public interface ICommand {

	boolean execute();

	void unExecute();

	boolean canUndo();

	String toString();
}
